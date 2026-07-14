package mx.edu.utez.poo.web01.control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mx.edu.utez.poo.web01.model.Usuario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="servlet-lista-usuarios", value = "/servlet-lista-usuarios")
public class ServletListaUsuarios extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       List<Usuario> listaUsuarios=new ArrayList<>();

       Usuario usuario1=new Usuario();
       usuario1.setNombre("Amalia");
       usuario1.setEdad(25);

       Usuario usuario2=new Usuario();
       usuario2.setNombre("Ale");
       usuario2.setEdad(19);

       Usuario usuario3=new Usuario();
       usuario3.setNombre("Paloma");
       usuario3.setEdad(20);

       listaUsuarios.add(usuario1);
       listaUsuarios.add(usuario2);
       listaUsuarios.add(usuario3);


       req.setAttribute("listaUsuarios",listaUsuarios);
       req.getRequestDispatcher("WEB-INF/consulta-lista-usuarios.jsp").forward(req,resp);

    }
}
