/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author david
 */
@Entity
@Table(name = "realizan_actividades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RealizanActividades.findAll", query = "SELECT r FROM RealizanActividades r")
    , @NamedQuery(name = "RealizanActividades.findByIdrealizan", query = "SELECT r FROM RealizanActividades r WHERE r.idrealizan = :idrealizan")})
public class RealizanActividades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrealizan")
    private Integer idrealizan;
    @JoinColumn(name = "socio_realiza", referencedColumnName = "actSuscrito")
    @ManyToOne(optional = false)
    private Afiliado socioRealiza;
    @JoinColumn(name = "actividades", referencedColumnName = "actividad")
    @ManyToOne(optional = false)
    private Actividad actividades;

    public RealizanActividades() {
    }

    public RealizanActividades(Integer idrealizan) {
        this.idrealizan = idrealizan;
    }

    public Integer getIdrealizan() {
        return idrealizan;
    }

    public void setIdrealizan(Integer idrealizan) {
        this.idrealizan = idrealizan;
    }

    public Afiliado getSocioRealiza() {
        return socioRealiza;
    }

    public void setSocioRealiza(Afiliado socioRealiza) {
        this.socioRealiza = socioRealiza;
    }

    public Actividad getActividades() {
        return actividades;
    }

    public void setActividades(Actividad actividades) {
        this.actividades = actividades;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrealizan != null ? idrealizan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RealizanActividades)) {
            return false;
        }
        RealizanActividades other = (RealizanActividades) object;
        if ((this.idrealizan == null && other.idrealizan != null) || (this.idrealizan != null && !this.idrealizan.equals(other.idrealizan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.RealizanActividades[ idrealizan=" + idrealizan + " ]";
    }
    
}
