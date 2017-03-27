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
public class UsuarioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "iduser")
    private int iduser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "socioCategoria")
    private String socioCategoria;

    public UsuarioPK() {
    }

    public UsuarioPK(int iduser, String socioCategoria) {
        this.iduser = iduser;
        this.socioCategoria = socioCategoria;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getSocioCategoria() {
        return socioCategoria;
    }

    public void setSocioCategoria(String socioCategoria) {
        this.socioCategoria = socioCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) iduser;
        hash += (socioCategoria != null ? socioCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPK)) {
            return false;
        }
        UsuarioPK other = (UsuarioPK) object;
        if (this.iduser != other.iduser) {
            return false;
        }
        if ((this.socioCategoria == null && other.socioCategoria != null) || (this.socioCategoria != null && !this.socioCategoria.equals(other.socioCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.UsuarioPK[ iduser=" + iduser + ", socioCategoria=" + socioCategoria + " ]";
    }
    
}
