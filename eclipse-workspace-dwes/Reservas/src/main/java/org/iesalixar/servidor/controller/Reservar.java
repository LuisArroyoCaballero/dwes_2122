package org.iesalixar.servidor.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Reservar
 */
@WebServlet("/Reservar")
public class Reservar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reservar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		
		if (!sesion.isNew() && sesion.getAttribute("user") != null && sesion.getAttribute("date") != null) {
			request.getRequestDispatcher("reservar.jsp").forward(request, response);
			return;
		}
		
		sesion.invalidate();
		response.sendRedirect(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		
		if (!sesion.isNew() && sesion.getAttribute("user") != null && sesion.getAttribute("date") != null) {
			if (
					request.getParameter("fechaInicio") != null &&
					request.getParameter("fechaFin") != null &&
					request.getParameter("numeroPersonas") != null &&
					request.getParameter("reservar") != null
					) {
				
				String fechaInicio = (String) request.getParameter("fechaInicio");
				String fechaFin = (String) request.getParameter("fechaFin");
				String numeroPersonas = (String) request.getParameter("numeroPersonas");
				String[] checkbox = request.getParameterValues("checkbox");
				
				//Add atributos en sesion
				
				sesion.setAttribute("fechaInicio", fechaInicio);
				sesion.setAttribute("fechaFin", fechaFin);
				sesion.setAttribute("numeroPersonas", numeroPersonas);
				sesion.setAttribute("checkbox", checkbox);
			
				
				response.sendRedirect("Confirmar");
				return;
				
		
			
			} else {
				sesion.invalidate();
				response.sendRedirect(request.getContextPath());
				return;
			}
			
		}
		
		sesion.invalidate();
		response.sendRedirect(request.getContextPath());
		
	}

}
