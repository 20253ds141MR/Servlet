package mx.edu.utez.poo.web01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name= "servletPostFormulario", value = "/servlet-post-formulario")
public class ServletPostFormulario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String username = req.getParameter("username") != null ?
                req.getParameter("username").trim() : "";
        String password = req.getParameter("password") != null ?
                req.getParameter("password").trim() : "";

        if (username.isEmpty() || password.isEmpty()) {
            req.setAttribute("error", "El usuario y contraseña son obligatorios");
            req.getRequestDispatcher("/WEB-INF/formulario.jsp").forward(req, resp);

        } else if (username.equals("juan@halconfiera3000") && password.equals("12345")) {
            req.getRequestDispatcher("/WEB-INF/home.jsp").forward(req, resp);

        } else {
            req.setAttribute("error", "Credenciales Incorrectas");
            req.getRequestDispatcher("/WEB-INF/formulario.jsp").forward(req, resp);
        }
    }
}