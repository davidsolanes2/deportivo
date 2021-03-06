package model;
// Generated 15-abr-2017 19:52:22 by Hibernate Tools 4.3.1



/**
 * Sala generated by hbm2java
 */
public class Sala  implements java.io.Serializable {


     private Integer idsala;
     private String descripcion;
     private String actividadSala;
     private Actividad actividad;

    public Sala() {
    }

	
    public Sala(String descripcion, String actividadSala) {
        this.descripcion = descripcion;
        this.actividadSala = actividadSala;
    }
    public Sala(String descripcion, String actividadSala, Actividad actividad) {
       this.descripcion = descripcion;
       this.actividadSala = actividadSala;
       this.actividad = actividad;
    }
   
    public Integer getIdsala() {
        return this.idsala;
    }
    
    public void setIdsala(Integer idsala) {
        this.idsala = idsala;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getActividadSala() {
        return this.actividadSala;
    }
    
    public void setActividadSala(String actividadSala) {
        this.actividadSala = actividadSala;
    }
    public Actividad getActividad() {
        return this.actividad;
    }
    
    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }




}


