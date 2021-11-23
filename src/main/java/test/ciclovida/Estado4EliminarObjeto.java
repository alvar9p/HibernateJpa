package test.ciclovida;

import domain.Contacto;
import javax.persistence.*;

public class Estado4EliminarObjeto {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        // Definimos la variable
        Contacto contacto = null;

        // Recuperamos el objeto
        // 1. Estado detached
        contacto = em.find(Contacto.class, 3);
        
        
        em.getTransaction().begin();
        
        // 2. Remove
        em.remove(em.merge(contacto));
        
        em.getTransaction().commit();
        
        // 3.- Transitivo
        System.out.println("contacto = " + contacto);

    }
}
