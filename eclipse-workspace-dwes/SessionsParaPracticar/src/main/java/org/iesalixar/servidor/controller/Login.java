package org.iesalixar.servidor.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.iesalixar.servidor.model.User;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		HttpSession sesion = null;
		
		/* Comprobación de usuario y contraseña */
		
		if (user.equals("usuario") && password.equals("usuario")) {
			/* Creamos usuario y sesion. Añadimos como atributo el usuario a la sesion. */
			
			sesion = request.getSession(); // getSession() comprueba que haya sesion, en caso de no existir la crea.
			User usuario = new User();
			sesion.setAttribute("user", usuario);
			response.sendRedirect("UserServlet"); // El senRedirect() cambia la URL para ver a donde has sido redireccionado. El request y response estan implicitos.
			
		} else if (user.equals("admin") && password.equals("admin")) {
			/* Creamos usuario y sesion. Añadimos como atributo el usuario a la sesion. */
			
			sesion = request.getSession(); // getSession() comprueba que haya sesion, en caso de no existir la crea.
			User usuario = new User();
			sesion.setAttribute("user", usuario);
			response.sendRedirect("AdminServlet"); // El senRedirect() cambia la URL para ver a donde has sido redireccionado. El request y response estan implicitos.
			
		} else {
			/* En caso de no introducir los datos correctos lo enviamos de vuelta al login. */
			
			response.sendRedirect("Login");
		}
	
	}

}
