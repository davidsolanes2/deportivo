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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "afiliado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Afiliado.findAll", query = "SELECT a FROM Afiliado a")
    , @NamedQuery(name = "Afiliado.findByIdsuscrito", query = "SELECT a FROM Afiliado a WHERE a.idsuscrito = :idsuscrito")
    , @NamedQuery(name = "Afiliado.findByFecha", query = "SELECT a FROM Afiliado a WHERE a.fecha = :fecha")})
public class Afiliado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsuscrito")
    private Integer idsuscrito;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "socioRealiza")
    private Collection<RealizanActividades> realizanActividadesCollection;
    @OneToMany(mappedBy = "afiliado")
    private Collection<Socio> socioCollection;
    @JoinColumn(name = "actSuscrito", referencedColumnName = "actividad")
    @ManyToOne(optional = false)
    private Actividad actSuscrito;
    @JoinColumn(name = "nomUser", referencedColumnName = "nombre")
    @ManyToOne(optional = false)
    private Usuario nomUser;

    public Afiliado() {
    }

    public Afiliado(Integer idsuscrito) {
        this.idsuscrito = idsuscrito;
    }

    public Afiliado(Integer idsuscrito, Date fecha) {
        this.idsuscrito = idsuscrito;
        this.fecha = fecha;
    }

    public Integer getIdsuscrito() {
        return idsuscrito;
    }

    public void setIdsuscrito(Integer idsuscrito) {
        this.idsuscrito = idsuscrito;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public Collection<RealizanActividades> getRealizanActividadesCollection() {
        return realizanActividadesCollection;
    }

    public void setRealizanActividadesCollection(Collection<RealizanActividades> realizanActividadesCollection) {
        this.realizanActividadesCollection = realizanActividadesCollection;
    }

    @XmlTransient
    public Collection<Socio> getSocioCollection() {
        return socioCollection;
    }

    public void setSocioCollection(Collection<Socio> socioCollection) {
        this.socioCollection = socioCollection;
    }

    public Actividad getActSuscrito() {
        return actSuscrito;
    }

    public void setActSuscrito(Actividad actSuscrito) {
        this.actSuscrito = actSuscrito;
    }

    public Usuario getNomUser() {
        return nomUser;
    }

    public void setNomUser(Usuario nomUser) {
        this.nomUser = nomUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsuscrito != null ? idsuscrito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Afiliado)) {
            return false;
        }
        Afiliado other = (Afiliado) object;
        if ((this.idsuscrito == null && other.idsuscrito != null) || (this.idsuscrito != null && !this.idsuscrito.equals(other.idsuscrito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Afiliado[ idsuscrito=" + idsuscrito + " ]";
    }
    
}
