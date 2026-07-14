package mx.edu.utez.poo.web01.control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mx.edu.utez.poo.web01.model.Usuario;

import java.io.IOException;


@WebServlet(name="servletUsuario", value = "/servlet-usuario")
public class ServletUsuario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Usuario unUsuario = new Usuario();
        unUsuario.setNombre("Marina");
        unUsuario.setEdad(10);

        req.setAttribute("usuario",unUsuario);
        req.getRequestDispatcher("/WEB-INF/consulta-usuario.jsp").forward(req,resp);
    }
}
