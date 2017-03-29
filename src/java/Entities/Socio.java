/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author david
 */
@Entity
@Table(name = "socio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Socio.findAll", query = "SELECT s FROM Socio s")
    , @NamedQuery(name = "Socio.findByIdsocio", query = "SELECT s FROM Socio s WHERE s.idsocio = :idsocio")
    , @NamedQuery(name = "Socio.findByMail", query = "SELECT s FROM Socio s WHERE s.mail = :mail")
    , @NamedQuery(name = "Socio.findByFechaAlta", query = "SELECT s FROM Socio s WHERE s.fechaAlta = :fechaAlta")
    , @NamedQuery(name = "Socio.findByFechaBaja", query = "SELECT s FROM Socio s WHERE s.fechaBaja = :fechaBaja")})
public class Socio implements Serializable {

    @JoinColumn(name = "afiliado", referencedColumnName = "actSuscrito")
    @ManyToOne
    private Afiliado afiliado;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsocio")
    private Integer idsocio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "mail")
    private String mail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaAlta")
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;
    @Column(name = "fechaBaja")
    @Temporal(TemporalType.DATE)
    private Date fechaBaja;
    @JoinColumn(name = "suscrito", referencedColumnName = "actSuscrito")
    @ManyToOne
    private Suscrito suscrito;

    public Socio() {
    }

    public Socio(Integer idsocio) {
        this.idsocio = idsocio;
    }

    public Socio(Integer idsocio, String mail, Date fechaAlta) {
        this.idsocio = idsocio;
        this.mail = mail;
        this.fechaAlta = fechaAlta;
    }

    public Integer getIdsocio() {
        return idsocio;
    }

    public void setIdsocio(Integer idsocio) {
        this.idsocio = idsocio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Suscrito getSuscrito() {
        return suscrito;
    }

    public void setSuscrito(Suscrito suscrito) {
        this.suscrito = suscrito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsocio != null ? idsocio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Socio)) {
            return false;
        }
        Socio other = (Socio) object;
        if ((this.idsocio == null && other.idsocio != null) || (this.idsocio != null && !this.idsocio.equals(other.idsocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Socio[ idsocio=" + idsocio + " ]";
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }
    
}
