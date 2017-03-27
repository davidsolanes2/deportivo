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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "sala")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sala.findAll", query = "SELECT s FROM Sala s")
    , @NamedQuery(name = "Sala.findByIdsala", query = "SELECT s FROM Sala s WHERE s.salaPK.idsala = :idsala")
    , @NamedQuery(name = "Sala.findByDescripcion", query = "SELECT s FROM Sala s WHERE s.salaPK.descripcion = :descripcion")
    , @NamedQuery(name = "Sala.findByActividad", query = "SELECT s FROM Sala s WHERE s.actividad = :actividad")})
public class Sala implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalaPK salaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "actividad")
    private String actividad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sala")
    private Collection<Actividad> actividadCollection;

    public Sala() {
    }

    public Sala(SalaPK salaPK) {
        this.salaPK = salaPK;
    }

    public Sala(SalaPK salaPK, String actividad) {
        this.salaPK = salaPK;
        this.actividad = actividad;
    }

    public Sala(int idsala, String descripcion) {
        this.salaPK = new SalaPK(idsala, descripcion);
    }

    public SalaPK getSalaPK() {
        return salaPK;
    }

    public void setSalaPK(SalaPK salaPK) {
        this.salaPK = salaPK;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @XmlTransient
    public Collection<Actividad> getActividadCollection() {
        return actividadCollection;
    }

    public void setActividadCollection(Collection<Actividad> actividadCollection) {
        this.actividadCollection = actividadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salaPK != null ? salaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sala)) {
            return false;
        }
        Sala other = (Sala) object;
        if ((this.salaPK == null && other.salaPK != null) || (this.salaPK != null && !this.salaPK.equals(other.salaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Sala[ salaPK=" + salaPK + " ]";
    }
    
}
