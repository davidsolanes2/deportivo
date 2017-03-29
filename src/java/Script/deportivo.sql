DROP DATABASE IF EXISTS deportivo;
CREATE DATABASE deportivo ;
USE deportivo;

/*ManytoMany*/

CREATE TABLE nif (
  nifGeneral varchar(10) NOT NULL,
  PRIMARY KEY (nifGeneral)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;


/* Table structure for table categoria*/

CREATE TABLE categoria (
  idcategoria int(11) NOT NULL AUTO_INCREMENT,
  descripcion varchar(50) NOT NULL,
  KEY (descripcion),
  PRIMARY KEY (idcategoria, descripcion)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/* Table structure for table `sala` */

CREATE TABLE sala (
  idsala int(11) NOT NULL AUTO_INCREMENT,
  descripcion varchar(50) NOT NULL,
  actividad varchar(50) NOT NULL,
  KEY (descripcion),
  PRIMARY KEY (idsala, descripcion)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/* Table structure for table `actividad` */

CREATE TABLE actividad (
  idactividad int(11) NOT NULL AUTO_INCREMENT,
  descripcionActividad varchar(50) NOT NULL,
  actividad varchar(50) NOT NULL,
  fecha datetime NOT NULL,
  KEY (actividad),
  PRIMARY KEY (idactividad, descripcionActividad, actividad),
  FOREIGN KEY (descripcionActividad) REFERENCES sala(descripcion) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/* Table structure for table usuario*/

CREATE TABLE usuario (
  iduser int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(50) NOT NULL,
  apellidos varchar(50) NOT NULL,
  telefono varchar(9) NOT NULL,
  nif varchar(10) NOT NULL,
  direccion varchar(50) NOT NULL,
  poblacion varchar(50) NOT NULL,
  cp varchar(5) NOT NULL,
  socioCategoria varchar(50) NOT NULL,
  KEY (nombre),
  PRIMARY KEY (iduser, socioCategoria),
  FOREIGN KEY (socioCategoria) REFERENCES categoria(descripcion) ON UPDATE CASCADE,
  FOREIGN KEY (nif) REFERENCES nif(nifGeneral) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/* Table structure for table suscrito*/

CREATE TABLE afiliado (
  idsuscrito int(11) NOT NULL AUTO_INCREMENT,
  nomUser varchar(50) NOT NULL,
  actSuscrito varchar(50) NOT NULL,
  fecha datetime NOT NULL,
  PRIMARY KEY (idsuscrito),
  FOREIGN KEY (actSuscrito) REFERENCES actividad(actividad) ON UPDATE CASCADE,
  FOREIGN KEY (nomUser) REFERENCES usuario(nombre) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/* Table structure for table socio */

CREATE TABLE socio (
  idsocio int(11) NOT NULL AUTO_INCREMENT,
  mail varchar(50) NOT NULL,
  fechaAlta date NOT NULL,
  fechaBaja date NULL,
  afiliado varchar(50) NULL,
  PRIMARY KEY (idsocio),
  FOREIGN KEY (afiliado) REFERENCES afiliado(actSuscrito) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/* Table structure for table `empleado` */

CREATE TABLE empleado (
  idempleado int(11) NOT NULL AUTO_INCREMENT,
  salario double(5,2) NOT NULL,
  fechaAlta date NOT NULL,
  fechaBaja date NULL,
  nifEmpleado varchar(10) NOT NULL,
  categoria varchar(50) NOT NULL,
  PRIMARY KEY (idempleado),
  FOREIGN KEY (categoria) REFERENCES categoria(descripcion) ON UPDATE CASCADE,
  FOREIGN KEY (nifEmpleado) REFERENCES nif(nifGeneral) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE realizan_actividades (
  idrealizan int(11) NOT NULL AUTO_INCREMENT,
  socio_realiza varchar(50) NOT NULL,
  actividades varchar(50) NOT NULL,
  PRIMARY KEY (idrealizan),
  FOREIGN KEY (socio_realiza) REFERENCES afiliado(actSuscrito) ON UPDATE CASCADE,
  FOREIGN KEY (actividades) REFERENCES actividad(actividad) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

