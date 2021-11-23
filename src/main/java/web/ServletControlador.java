package web;

import domain.Alumno;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.ServicioAlumno;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        List<Alumno> alumnos = servicioAlumno.listarAlumnos();
        request.setAttribute("alumnos", alumnos);

        try {
            request.getRequestDispatcher("/WEB-INF/listarAlumnos.jsp").forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
   }
}
