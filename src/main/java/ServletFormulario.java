package mx.edu.utez.poo.web01;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "servletFormulario", value = "/servlet-formulario")
public class ServletFormulario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("hola");
        System.out.println("redireccionando a la pag de formulario.jsp");

        request.getRequestDispatcher("/WEB-INF/formulario.jsp").forward(request, response);
    }
}