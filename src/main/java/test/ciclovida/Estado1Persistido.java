package test.ciclovida;

import domain.Contacto;
import javax.persistence.*;

public class Estado1Persistido {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //1. Estado transitivo
        Contacto contacto = new Contacto();
        contacto.setEmail("clara@mail.com");
        contacto.setTelefono("99556688");
        
        //2. Persistimos el objeto
        em.getTransaction().begin();
        em.persist(contacto);
        em.getTransaction().commit();
        
        //3. Detached (separado)
        System.out.println("contacto" + contacto);
    }
}
