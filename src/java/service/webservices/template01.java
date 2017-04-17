
package service.webservices;

import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.pojos.Usuario;
import model.dao.UsuarioDAO;

/**
 *
 * @author david
 */
@WebService(serviceName = "template01")
public class template01 {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresarUsuario")
    public String IngresarUsuario(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellidos") String apellidos, @WebParam(name = "telefono") String telefono, @WebParam(name = "idnif") String idnif, @WebParam(name = "direccion") String direccion, @WebParam(name = "poblacion") String poblacion, @WebParam(name = "cp") String cp, @WebParam(name = "fechaAlta") Date fechaAlta, @WebParam(name = "mail") String mail) {
       
        Usuario u = new Usuario(nombre,apellidos,telefono,idnif,direccion,poblacion,cp,fechaAlta,mail);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.ingresarUsuario(u);
        return "Usuario dado de alta";
      
    }
}
