
package Hibernate;

import org.hibernate.Session;

/**
 *
 * @author david
 */
public class DeportivoHelper {
    Session session = null;
    
    public DeportivoHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
}
