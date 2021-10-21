package org.iesalixar.servidor.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.iesalixar.servidor.model.User;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminServlet() {
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

		if (!sesion.isNew()) {
			User usuario = (User) sesion.getAttribute("usuario");

			if (usuario != null && usuario.getName().equals("admin")) {
				request.getRequestDispatcher("Admin.jsp").forward(request, response);
			}

		}
		sesion.invalidate();
		response.sendRedirect(request.getContextPath());

	}

}
