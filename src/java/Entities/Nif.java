/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "nif")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nif.findAll", query = "SELECT n FROM Nif n")
    , @NamedQuery(name = "Nif.findByNifGeneral", query = "SELECT n FROM Nif n WHERE n.nifGeneral = :nifGeneral")})
public class Nif implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "nifGeneral")
    private String nifGeneral;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nifEmpleado")
    private Collection<Empleado> empleadoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nif")
    private Collection<Usuario> usuarioCollection;

    public Nif() {
    }

    public Nif(String nifGeneral) {
        this.nifGeneral = nifGeneral;
    }

    public String getNifGeneral() {
        return nifGeneral;
    }

    public void setNifGeneral(String nifGeneral) {
        this.nifGeneral = nifGeneral;
    }

    @XmlTransient
    public Collection<Empleado> getEmpleadoCollection() {
        return empleadoCollection;
    }

    public void setEmpleadoCollection(Collection<Empleado> empleadoCollection) {
        this.empleadoCollection = empleadoCollection;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nifGeneral != null ? nifGeneral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nif)) {
            return false;
        }
        Nif other = (Nif) object;
        if ((this.nifGeneral == null && other.nifGeneral != null) || (this.nifGeneral != null && !this.nifGeneral.equals(other.nifGeneral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Nif[ nifGeneral=" + nifGeneral + " ]";
    }
    
}
