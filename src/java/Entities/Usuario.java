/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Usuario.findByApellidos", query = "SELECT u FROM Usuario u WHERE u.apellidos = :apellidos")
    , @NamedQuery(name = "Usuario.findByTelefono", query = "SELECT u FROM Usuario u WHERE u.telefono = :telefono")
    , @NamedQuery(name = "Usuario.findByIdnif", query = "SELECT u FROM Usuario u WHERE u.idnif = :idnif")
    , @NamedQuery(name = "Usuario.findByDireccion", query = "SELECT u FROM Usuario u WHERE u.direccion = :direccion")
    , @NamedQuery(name = "Usuario.findByPoblacion", query = "SELECT u FROM Usuario u WHERE u.poblacion = :poblacion")
    , @NamedQuery(name = "Usuario.findByCp", query = "SELECT u FROM Usuario u WHERE u.cp = :cp")
    , @NamedQuery(name = "Usuario.findByFechaAlta", query = "SELECT u FROM Usuario u WHERE u.fechaAlta = :fechaAlta")
    , @NamedQuery(name = "Usuario.findByMail", query = "SELECT u FROM Usuario u WHERE u.mail = :mail")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "telefono")
    private String telefono;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "idnif")
    private String idnif;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "poblacion")
    private String poblacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "cp")
    private String cp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaAlta")
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "mail")
    private String mail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleadonif")
    private Collection<Empleado> empleadoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnifUsuarionif")
    private Collection<Socio> socioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private Collection<Participa> participaCollection;

    public Usuario() {
    }

    public Usuario(String idnif) {
        this.idnif = idnif;
    }

    public Usuario(String idnif, String nombre, String apellidos, String telefono, String direccion, String poblacion, String cp, Date fechaAlta, String mail) {
        this.idnif = idnif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.cp = cp;
        this.fechaAlta = fechaAlta;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdnif() {
        return idnif;
    }

    public void setIdnif(String idnif) {
        this.idnif = idnif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @XmlTransient
    public Collection<Empleado> getEmpleadoCollection() {
        return empleadoCollection;
    }

    public void setEmpleadoCollection(Collection<Empleado> empleadoCollection) {
        this.empleadoCollection = empleadoCollection;
    }

    @XmlTransient
    public Collection<Socio> getSocioCollection() {
        return socioCollection;
    }

    public void setSocioCollection(Collection<Socio> socioCollection) {
        this.socioCollection = socioCollection;
    }

    @XmlTransient
    public Collection<Participa> getParticipaCollection() {
        return participaCollection;
    }

    public void setParticipaCollection(Collection<Participa> participaCollection) {
        this.participaCollection = participaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnif != null ? idnif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idnif == null && other.idnif != null) || (this.idnif != null && !this.idnif.equals(other.idnif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Usuario[ idnif=" + idnif + " ]";
    }
    
}
