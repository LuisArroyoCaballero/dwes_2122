package org.iesalixar.servidor.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.iesalixar.servidor.model.Reserva;

/**
 * Servlet implementation class Confirmar
 */
@WebServlet("/Confirmar")
public class Confirmar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Confirmar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		
		if (
				!sesion.isNew() &&
				sesion.getAttribute("user") != null &&
				sesion.getAttribute("date") != null 
				) {
			Reserva reserva = new Reserva();
			
			reserva.setCheckbox((String[]) sesion.getAttribute("checkbox"));
			reserva.setFechaFin((String) sesion.getAttribute("fechaFin"));
			reserva.setFechaInicio((String) sesion.getAttribute("fechaInicio"));
			reserva.setNumeroPersonas((String) sesion.getAttribute("numeroPersonas"));
			
			request.setAttribute("reservaBean", reserva);
			
			request.getRequestDispatcher("confirmar.jsp").forward(request, response);
			return;
		}
		
		sesion.invalidate();
		response.sendRedirect("Inicio");
		
		
		
	}

}
