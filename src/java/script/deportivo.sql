DROP DATABASE IF EXISTS deportivo;
CREATE DATABASE deportivo ;
USE deportivo;

/* Table structure for table categoria*/

CREATE TABLE categoria (
  idcategoria int(11) NOT NULL AUTO_INCREMENT,
  descripcion varchar(50) NOT NULL,
  PRIMARY KEY (idcategoria)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/* Table structure for table usuario*/

CREATE TABLE usuario (
  nombre varchar(50) NOT NULL,
  apellidos varchar(50) NOT NULL,
  telefono varchar(9) NOT NULL,
  idnif varchar(10) NOT NULL,
  direccion varchar(50) NOT NULL,
  poblacion varchar(50) NOT NULL,
  cp varchar(5) NOT NULL,
  fechaAlta date NOT NULL,
  mail varchar(50) NOT NULL,
  KEY (idnif, nombre),
  PRIMARY KEY (idnif)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/* Table structure for table socio */

CREATE TABLE socio (
  idsocio int(11) NOT NULL AUTO_INCREMENT,
  idnifUsuarionif varchar(10) NOT NULL,
  fechaBaja date NULL,
  cuota float(5,2) NOT NULL,
  socio_participa varchar(50) NULL,
  KEY (idnifUsuarionif),
  PRIMARY KEY (idsocio),
  FOREIGN KEY (idnifUsuarionif) REFERENCES usuario(idnif) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/* Table structure for table `empleado` */

CREATE TABLE empleado (
  idempleado int(11) NOT NULL AUTO_INCREMENT,
  salario double(5,2) NOT NULL,
  fechaAlta date NOT NULL,
  fechaBaja date NULL,
  idEmpleadonif varchar(10) NOT NULL,
  categoria int(11) NOT NULL,
  PRIMARY KEY (idempleado),
  FOREIGN KEY (categoria) REFERENCES categoria(idcategoria) ON UPDATE CASCADE,
  FOREIGN KEY (idEmpleadonif) REFERENCES usuario(idnif) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/* Table structure for table `sala` */

CREATE TABLE sala (
  idsala int(11) NOT NULL AUTO_INCREMENT,
  descripcion varchar(50) NOT NULL,
  actividadSala varchar(50) NOT NULL,
  PRIMARY KEY (idsala)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/* Table structure for table `actividad` */

CREATE TABLE actividad (
  idactividad int(11) NOT NULL AUTO_INCREMENT,
  descripcionActividad varchar(50) NOT NULL,
  actividad varchar(50) NOT NULL,
  fecha datetime NOT NULL,
  PRIMARY KEY (idactividad),
  FOREIGN KEY (idactividad) REFERENCES sala(idsala) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/* Table structure for table participa*/

CREATE TABLE participa (
  idparticipa int(11) NOT NULL AUTO_INCREMENT,
  nifUser varchar(10) NOT NULL,
  actSuscrito int(11) NOT NULL,
  fecha date NOT NULL,
  PRIMARY KEY (idparticipa, nifUser, actSuscrito),
  FOREIGN KEY (actSuscrito) REFERENCES actividad(idactividad) ON UPDATE CASCADE,
  FOREIGN KEY (nifUser) REFERENCES usuario(idnif) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
