package Pojos;
// Generated 15-abr-2017 19:52:22 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Participa generated by hbm2java
 */
public class Participa  implements java.io.Serializable {


     private ParticipaId id;
     private Actividad actividad;
     private Usuario usuario;
     private Date fecha;

    public Participa() {
    }

    public Participa(ParticipaId id, Actividad actividad, Usuario usuario, Date fecha) {
       this.id = id;
       this.actividad = actividad;
       this.usuario = usuario;
       this.fecha = fecha;
    }
   
    public ParticipaId getId() {
        return this.id;
    }
    
    public void setId(ParticipaId id) {
        this.id = id;
    }
    public Actividad getActividad() {
        return this.actividad;
    }
    
    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}


