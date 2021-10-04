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

public class EjemploPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EjemploPost() {
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

		out.println("<html>");
		out.println("<head><title>Ejemplo de gesti�n de peticiones POST desde el Servlet</title><head>");
		out.println("<body>");
		out.println("<h1>Formulario</h1>");
		out.println(
				"<p>El formulario se mostrar� la primera vez cuando se haya realizado una petici�n GET al servlet</p>");

		out.println("<form method=\"post\">");
		out.println("<label for=\"nombre\">Nombre:</label><input id=\"nombre\" type=\"text\" name=\"nombre\"><br>");
		out.println(
				"<label for=\"apellidos\">Apellidos:</label><input id=\"apellidos\" type=\"text\" name=\"apellidos\"><br>");
		out.println("<button type=\"submit\" name=\"submit\">Enviar</button>");
		out.println("</form>");
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

		if (!paramEnumeration.hasMoreElements()) {

			// No hay par�metros en la petici�n
			out.println("Estoy en una petici�n post y no he recibido par�metros");
			
		} else {

			// Comienzo de la lista de par�metros
			out.println("<h1>Los datos del formulario son los siguientes</h1>");
			out.println("<ul>");

			while (paramEnumeration.hasMoreElements()) {

				// Recorro la lista de par�metros (Suponemos que tienen un solo valor para el ejemplo(
				String param = (String) paramEnumeration.nextElement();
				out.write("<li>He recibido el par�metro " + param + " con el siguiente valor: "
						+ request.getParameter(param) + "</li>");

			}

			// Fin de la lista de par�metros
			out.println("</ul>");

		}
	}

}