package test;

import dao.AlumnoDAO;
import dao.AsignacionDAO;
import dao.ContactoDAO;
import dao.CursoDAO;
import dao.DomicilioDAO;
import java.util.List;

public class TestDAOs {
    public static void main(String[] args) {
        AlumnoDAO alumnoDao = new AlumnoDAO();
        System.out.println("Alumnos: ");
        imprimir(alumnoDao.listar());
        
        System.out.println("Domicilios: ");
        DomicilioDAO domicilioDao = new DomicilioDAO();
        imprimir(domicilioDao.listar());
        
        System.out.println("Contacto: ");
        ContactoDAO contactoDao = new ContactoDAO();
        imprimir(contactoDao.listar());
        
        System.out.println("Cursos: ");
        CursoDAO CursoDao = new CursoDAO();
        imprimir(CursoDao.listar());
        
        System.out.println("Asignaciones: ");
        AsignacionDAO asignacionDao = new AsignacionDAO();
        imprimir(asignacionDao.listar());
    }
    
    private static void imprimir(List coleccion){
        for(Object o: coleccion){
            System.out.println("Valor: " + o );
        }
    }
}
