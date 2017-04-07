/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author david
 */
@Embeddable
public class ActividadPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idactividad")
    private int idactividad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "descripcionActividad")
    private String descripcionActividad;

    public ActividadPK() {
    }

    public ActividadPK(int idactividad, String descripcionActividad) {
        this.idactividad = idactividad;
        this.descripcionActividad = descripcionActividad;
    }

    public int getIdactividad() {
        return idactividad;
    }

    public void setIdactividad(int idactividad) {
        this.idactividad = idactividad;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idactividad;
        hash += (descripcionActividad != null ? descripcionActividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActividadPK)) {
            return false;
        }
        ActividadPK other = (ActividadPK) object;
        if (this.idactividad != other.idactividad) {
            return false;
        }
        if ((this.descripcionActividad == null && other.descripcionActividad != null) || (this.descripcionActividad != null && !this.descripcionActividad.equals(other.descripcionActividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.ActividadPK[ idactividad=" + idactividad + ", descripcionActividad=" + descripcionActividad + " ]";
    }
    
}
