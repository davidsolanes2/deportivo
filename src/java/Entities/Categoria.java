/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "categoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c")
    , @NamedQuery(name = "Categoria.findByIdcategoria", query = "SELECT c FROM Categoria c WHERE c.categoriaPK.idcategoria = :idcategoria")
    , @NamedQuery(name = "Categoria.findByDescripcion", query = "SELECT c FROM Categoria c WHERE c.categoriaPK.descripcion = :descripcion")})
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CategoriaPK categoriaPK;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    private Collection<Empleado> empleadoCollection;

    public Categoria() {
    }

    public Categoria(CategoriaPK categoriaPK) {
        this.categoriaPK = categoriaPK;
    }

    public Categoria(int idcategoria, String descripcion) {
        this.categoriaPK = new CategoriaPK(idcategoria, descripcion);
    }

    public CategoriaPK getCategoriaPK() {
        return categoriaPK;
    }

    public void setCategoriaPK(CategoriaPK categoriaPK) {
        this.categoriaPK = categoriaPK;
    }

    @XmlTransient
    public Collection<Empleado> getEmpleadoCollection() {
        return empleadoCollection;
    }

    public void setEmpleadoCollection(Collection<Empleado> empleadoCollection) {
        this.empleadoCollection = empleadoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoriaPK != null ? categoriaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.categoriaPK == null && other.categoriaPK != null) || (this.categoriaPK != null && !this.categoriaPK.equals(other.categoriaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Categoria[ categoriaPK=" + categoriaPK + " ]";
    }
    
}
