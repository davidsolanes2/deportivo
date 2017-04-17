
package service.webservices;

import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.*;
import persistence.DeportivoORM;

/**
 *
 * @author david
 */
@WebService(serviceName = "template01")
public class template01 {

    /**
     * Web service operation
     * @param nombre
     * @param apellidos
     * @param telefono
     * @param idnif
     * @param direccion
     * @param poblacion
     * @param cp
     * @param fechaAlta
     * @param mail
     * @return 
     * 
     */
    @WebMethod(operationName = "IngresarUsuario")
    public String IngresarUsuario(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellidos") String apellidos, @WebParam(name = "telefono") String telefono, @WebParam(name = "idnif") String idnif, @WebParam(name = "direccion") String direccion, @WebParam(name = "poblacion") String poblacion, @WebParam(name = "cp") String cp, @WebParam(name = "fechaAlta") Date fechaAlta, @WebParam(name = "mail") String mail) {
       
        Usuario u = new Usuario(nombre,apellidos,telefono,idnif,direccion,poblacion,cp,fechaAlta,mail);
        DeportivoORM deportivoORM = new DeportivoORM();
        deportivoORM.ingresarUsuario(u);
        return "Usuario dado de alta";
      
    }
}
