package org.iesalixar.servidor.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Inicio
 */
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*" + "@"
			+ "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

	private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
	private static final String PASSWORD_REGEX =
	        "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";
	 
	    private static final Pattern PASSWORD_PATTERN =
	            Pattern.compile(PASSWORD_REGEX);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inicio() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		HttpSession sesion = request.getSession();;
		
		if (!sesion.isNew()) {
			String button = request.getParameter("signIn");
			String user = request.getParameter("user");
			String password = request.getParameter("password");
			String confirmPassword = request.getParameter("confirmPassword");
			if (
					button != null 
					&& button.equals("REGISTRARSE" ) &&
					password != null &&
					confirmPassword != null &&
					PASSWORD_PATTERN.matcher(request.getParameter("password")).matches() &&
					PASSWORD_PATTERN.matcher(request.getParameter("confirmPassword")).matches() &&
					password.equals(confirmPassword) &&
					EMAIL_PATTERN.matcher(request.getParameter("email")).matches()
					) {
				sesion.setAttribute("user", user);
				sesion.setAttribute("date", sesion.getCreationTime());
				//logger.info("El usuario ha entrado en sesi�n.");
				
				response.sendRedirect("Reservar");
				
				
				
			} 
			else {
				sesion.invalidate();
				response.sendRedirect(request.getContextPath());
				
			}
			return;
			
		}
		
		
		sesion.invalidate();
		response.sendRedirect("Logout");
	}

}
