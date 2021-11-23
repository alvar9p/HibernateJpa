package test.ciclovida;

import domain.Contacto;
import javax.persistence.*;

public class Estado2RecuperarObjetoPersistente {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        // Definimos la variable
        Contacto contacto = null;
        
        em.getTransaction().begin();
        // Recuperamos el objeto
        contacto = em.find(Contacto.class, 2);
        
        // Detached
        System.out.println("contacto = " + contacto);
        
    }
}
