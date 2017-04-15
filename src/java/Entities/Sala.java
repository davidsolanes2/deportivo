/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author david
 */
@Entity
@Table(name = "sala")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sala.findAll", query = "SELECT s FROM Sala s")
    , @NamedQuery(name = "Sala.findByIdsala", query = "SELECT s FROM Sala s WHERE s.idsala = :idsala")
    , @NamedQuery(name = "Sala.findByDescripcion", query = "SELECT s FROM Sala s WHERE s.descripcion = :descripcion")
    , @NamedQuery(name = "Sala.findByActividad", query = "SELECT s FROM Sala s WHERE s.actividad = :actividad")})
public class Sala implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsala")
    private Integer idsala;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "actividad")
    private String actividad;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "sala")
    private Actividad actividad1;

    public Sala() {
    }

    public Sala(Integer idsala) {
        this.idsala = idsala;
    }

    public Sala(Integer idsala, String descripcion, String actividad) {
        this.idsala = idsala;
        this.descripcion = descripcion;
        this.actividad = actividad;
    }

    public Integer getIdsala() {
        return idsala;
    }

    public void setIdsala(Integer idsala) {
        this.idsala = idsala;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Actividad getActividad1() {
        return actividad1;
    }

    public void setActividad1(Actividad actividad1) {
        this.actividad1 = actividad1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsala != null ? idsala.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sala)) {
            return false;
        }
        Sala other = (Sala) object;
        if ((this.idsala == null && other.idsala != null) || (this.idsala != null && !this.idsala.equals(other.idsala))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Sala[ idsala=" + idsala + " ]";
    }
    
}
