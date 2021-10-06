package org.iesalixar.servidor.luisarroyo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EjemploPost
 */

public class PostLoggin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PostLoggin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Muestro un formulario para recoger nombre y apellidos del usuario
		PrintWriter out = response.getWriter();

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");

		out.println("<html>");
		out.println("<head><title>Ejemplo de gestión de peticiones POST desde el Servlet</title><head>");
		out.println("<body>");
		out.println("<h1>Formulario</h1>");
		out.println(
				"<p>El formulario se mostrará la primera vez cuando se haya realizado una petición GET al servlet</p>");

		out.println("<form method=\"post\">");
		out.println("<label for=\"nombre\">Usuario:</label><input id=\"usuario\" type=\"text\" name=\"usuario\"><br>");
		out.println(
				"<label for=\"apellidos\">Password:</label><input id=\"password\" type=\"text\" name=\"password\"><br>");
		out.println("<button type=\"submit\" name=\"submit\">Enviar</button>");
		out.println("</form>");
		if (usuario != null && password != null && !usuario.equals("admin") && !password.equals("admin")) {
			out.print("<h1 style=\"color:  red;\"> El usuario y contraseña introducidos son incorrectos </h1>");
		}
		out.println("</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		Enumeration paramEnumeration = request.getParameterNames();

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");

		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");

		if (usuario.equals("admin") && password.equals("admin")) {
			out.print("<h1> Bienvenido, su usuario y contraseña son correctos </h1>");
		} else {
			
			doGet(request, response);

		}

	}
}
