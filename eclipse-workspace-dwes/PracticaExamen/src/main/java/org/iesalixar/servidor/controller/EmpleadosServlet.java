package org.iesalixar.servidor.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.servidor.dao.EmployeeDAOImpl;
import org.iesalixar.servidor.models.Employee;

/**
 * Servlet implementation class EmpleadosServlet
 */
public class EmpleadosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmpleadosServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();

		ArrayList<Employee> empleados = employeeDAO.getAll();
		request.setAttribute("employees", empleados);

		request.getRequestDispatcher("/WEB-INF/view/Admin/empleados.jsp").forward(request, response);
	}

}
