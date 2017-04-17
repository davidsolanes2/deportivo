
package model.dao;

import hibernate.HibernateUtil;
import model.pojos.Usuario;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import java.util.List;


/**
 *
 * @author david
 */
public class UsuarioDAO {
    public void ingresarUsuario (Usuario u) {
        SessionFactory sf=null;
        Session sesion=null;
        Transaction tx=null;
        try{
            sf = HibernateUtil.getSessionFactory();
            sesion = sf.openSession();
            tx = sesion.beginTransaction();
            sesion.save(u);
            tx.commit();
            sesion.close();
        }
        catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException ("No se pudo guardar");
        }  
    }
    public String consultarUsuario (String idnif) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Usuario u = (Usuario)sesion.get(Usuario.class, idnif);
        if(u!=null) {
            return "El usuario es " + u.getIdnif();
        }
        else {
           return "El usuario no existe"; 
        }   
    }
    
    public List<Usuario> verUsuarios() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Query query = sesion.createQuery("from Usuario");
        List<Usuario> lista = query.list();
        sesion.close();
        return lista;
    }
}
