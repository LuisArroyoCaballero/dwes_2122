package org.iesalixar.servidor.luisarroyo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EjemploPost
 */
@WebServlet("/EjemploPost")
public class EjemploGetLuis extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EjemploGetLuis() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Obtengo el elemento para la salida
		PrintWriter out = response.getWriter();
		int numParams = 0;
		
		//Genero la salida de la p�gina
		out.println("<html>");
		out.println("<head><title>Ejemplo de gesti�n de peticiones GET desde el Servlet</title><head>");
		out.println("<body>");
		
		//Si no recibo par�metros muestro un enlace con par�metros en la query
		//Tb podr� obtener un mapa, tengo varias formas de hacerlo
		Enumeration paramEnumeration = request.getParameterNames();
		
		
		if (!paramEnumeration.hasMoreElements() ) {
			
			//No hay par�metros en la petici�n
			out.println("<p><a href=\"?modulo=servidor&profesor=Luis Rafael Arroyo Caballero \">Pasando par�metros</a></p>");
			
		} else {
			
			//Comienzo de la lista de par�metros
			out.println("<ul>");
			
			while (paramEnumeration.hasMoreElements()) {
				
				//Recorro la lista de par�metros 
				String param = (String) paramEnumeration.nextElement();				
				out.write("<li>He recibido el par�metro "+param+" con el siguiente valor: "+request.getParameter(param)+"</li>");
				
			}
			
			//Fin de la lista de par�metros
			out.println("</ul>");
			
		}
		
		
		
		
		
		out.println("</body>");
		out.println("</html>");
		out.close();

	}

}