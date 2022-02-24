package org.iesalixar.servidor.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.iesalixar.servidor.dao.ProductLineDAOImpl;
import org.iesalixar.servidor.models.ProductLine;

/**
 * Servlet implementation class LogOutServlet
 */
public class LogOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(LogOutServlet.class);

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LogOutServlet() {
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

		sesion.invalidate();
		
		logger.info("Ha salido de la sesion");
		response.sendRedirect(request.getContextPath()+"/Login");
		
	}

}
