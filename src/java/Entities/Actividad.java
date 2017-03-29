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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "actividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividad.findAll", query = "SELECT a FROM Actividad a")
    , @NamedQuery(name = "Actividad.findByIdactividad", query = "SELECT a FROM Actividad a WHERE a.actividadPK.idactividad = :idactividad")
    , @NamedQuery(name = "Actividad.findByDescripcionActividad", query = "SELECT a FROM Actividad a WHERE a.actividadPK.descripcionActividad = :descripcionActividad")
    , @NamedQuery(name = "Actividad.findByActividad", query = "SELECT a FROM Actividad a WHERE a.actividadPK.actividad = :actividad")
    , @NamedQuery(name = "Actividad.findByFecha", query = "SELECT a FROM Actividad a WHERE a.fecha = :fecha")})
public class Actividad implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actividades")
    private Collection<RealizanActividades> realizanActividadesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actSuscrito")
    private Collection<Afiliado> afiliadoCollection;

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ActividadPK actividadPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actSuscrito")
    private Collection<Suscrito> suscritoCollection;
    @JoinColumn(name = "descripcionActividad", referencedColumnName = "descripcion", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sala sala;

    public Actividad() {
    }

    public Actividad(ActividadPK actividadPK) {
        this.actividadPK = actividadPK;
    }

    public Actividad(ActividadPK actividadPK, Date fecha) {
        this.actividadPK = actividadPK;
        this.fecha = fecha;
    }

    public Actividad(int idactividad, String descripcionActividad, String actividad) {
        this.actividadPK = new ActividadPK(idactividad, descripcionActividad, actividad);
    }

    public ActividadPK getActividadPK() {
        return actividadPK;
    }

    public void setActividadPK(ActividadPK actividadPK) {
        this.actividadPK = actividadPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public Collection<Suscrito> getSuscritoCollection() {
        return suscritoCollection;
    }

    public void setSuscritoCollection(Collection<Suscrito> suscritoCollection) {
        this.suscritoCollection = suscritoCollection;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actividadPK != null ? actividadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.actividadPK == null && other.actividadPK != null) || (this.actividadPK != null && !this.actividadPK.equals(other.actividadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Actividad[ actividadPK=" + actividadPK + " ]";
    }

    @XmlTransient
    public Collection<RealizanActividades> getRealizanActividadesCollection() {
        return realizanActividadesCollection;
    }

    public void setRealizanActividadesCollection(Collection<RealizanActividades> realizanActividadesCollection) {
        this.realizanActividadesCollection = realizanActividadesCollection;
    }

    @XmlTransient
    public Collection<Afiliado> getAfiliadoCollection() {
        return afiliadoCollection;
    }

    public void setAfiliadoCollection(Collection<Afiliado> afiliadoCollection) {
        this.afiliadoCollection = afiliadoCollection;
    }
    
}
