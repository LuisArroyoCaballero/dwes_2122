package org.iesalixar.servidor.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.iesalixar.servidor.model.Usuario;

/**
 * Servlet implementation class Fin
 */
@WebServlet("/Fin")
public class Fin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		
		if (!sesion.isNew() && sesion.getAttribute("usuario") != null) {
		
			Usuario usuario = new Usuario();
			
			usuario.setUsuario("pepe");
			usuario.setApellido((String) sesion.getAttribute("apellido"));
			usuario.setDireccion((String) sesion.getAttribute("direccion"));
			usuario.setEdad((int) sesion.getAttribute("edad"));
			usuario.setAficiones((String[]) sesion.getAttribute("aficiones"));
			
			request.setAttribute("usuarioBean", usuario);
			
			request.getRequestDispatcher("fin.jsp").forward(request, response);
			return;
			
			
		}
		sesion.invalidate();
		response.sendRedirect(request.getContextPath()+"/Inicio");
	}

}
