package org.iesalixar.servidor.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class Matricula
 */
@WebServlet("/Matricula")
public class Matricula extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*" + "@"
			+ "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

	private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
	private static final String NAME_REGEX = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";

	private static final Pattern NAME_PATTERN = Pattern.compile(NAME_REGEX);
	final static Logger logger = Logger.getLogger(Login.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Matricula() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sesion = request.getSession();

		if (!sesion.isNew() && sesion.getAttribute("Login") != null && (boolean) sesion.getAttribute("Login")) {
			request.getRequestDispatcher("matricula.jsp").forward(request, response);
			return;
		}

		sesion.invalidate();
		response.sendRedirect("Login");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		
		if (!sesion.isNew() && sesion.getAttribute("Login") != null && ((boolean) sesion.getAttribute("Login"))) {
			if (EMAIL_PATTERN.matcher(request.getParameter("email")).matches()
					&& NAME_PATTERN.matcher(request.getParameter("name")).matches()
					&& NAME_PATTERN.matcher(request.getParameter("lastName")).matches()) {
				
				String select[] = request.getParameterValues("select");
				String radio = request.getParameter("curso");
				sesion.setAttribute("name", request.getParameter("name"));
				sesion.setAttribute("lastName", request.getParameter("lastName"));
				sesion.setAttribute("email", request.getParameter("email"));
				sesion.setAttribute("selection", select);

				Cookie cookie = new Cookie("curso", radio);
				response.addCookie(cookie);

				response.sendRedirect("Page");

				return;

			} else {
				logger.error("Los campos introducidos no son válidos");
				response.sendRedirect("Matricula");

				return;
			}
		}
		logger.error("El usuario intento entrar en Matrícula sin tener sesion.");

		sesion.invalidate();
		response.sendRedirect(request.getContextPath());

	}

}
