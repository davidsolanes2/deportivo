package Pojos;
// Generated 15-abr-2017 19:52:22 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private Integer idcategoria;
     private String descripcion;
     private Set empleados = new HashSet(0);

    public Categoria() {
    }

	
    public Categoria(String descripcion) {
        this.descripcion = descripcion;
    }
    public Categoria(String descripcion, Set empleados) {
       this.descripcion = descripcion;
       this.empleados = empleados;
    }
   
    public Integer getIdcategoria() {
        return this.idcategoria;
    }
    
    public void setIdcategoria(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set empleados) {
        this.empleados = empleados;
    }




}


