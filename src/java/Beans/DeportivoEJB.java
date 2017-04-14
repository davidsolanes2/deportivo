
package Beans;

import Entities.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author david
 */

@Stateless
public class DeportivoEJB {

   @PersistenceUnit
    EntityManagerFactory emf;
   
   public boolean insertUsuario(Usuario u) {
       if(!existUsuario(u)) {
           EntityManager em = emf.createEntityManager();
           em.persist(u);
           em.close();
           return true;
       }
       return false;
   }

    public boolean existUsuario(Usuario u) {
        EntityManager em = emf.createEntityManager();
        Usuario encontrado = em.find(Usuario.class, u.getNombre());
        em.close();
        return encontrado != null;
    }
    
    
   
}
