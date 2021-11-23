package test.cascade;

import domain.Alumno;
import domain.Contacto;
import domain.Domicilio;
import javax.persistence.*;

public class PersistenciaCascadaTest {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("Nogales");
        domicilio.setNoCalle("10");
        domicilio.setPais("Mexico");
        
        Contacto contacto = new Contacto();
        contacto.setEmail("clara@mail.com");
        contacto.setTelefono("44332211");

        Alumno alumno = new Alumno();
        alumno.setNombre("Carlos");
        alumno.setApellido("Lara");
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);
        
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        
        System.out.println("alumno = " + alumno);
    }
}
