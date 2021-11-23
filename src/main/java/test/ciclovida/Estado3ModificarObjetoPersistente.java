package test.ciclovida;

import domain.Contacto;
import javax.persistence.*;

public class Estado3ModificarObjetoPersistente {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        // Definimos la variable
        Contacto contacto = null;

        // Recuperamos el objeto
        // 1. Estado detached
        contacto = em.find(Contacto.class, 3);
        
        // 2. Modificamos el objeto
        contacto.setEmail("clara@mail.com");
        
        em.getTransaction().begin();
        
        // 3. Persistente
        //em.persist(contacto);
        em.merge(contacto);
        
        
        em.getTransaction().commit();
        
        // Detached
        System.out.println("contacto = " + contacto);

    }
}
