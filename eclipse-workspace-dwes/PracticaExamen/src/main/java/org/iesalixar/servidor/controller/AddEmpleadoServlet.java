package org.iesalixar.servidor.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.servidor.dao.EmployeeDAOImpl;
import org.iesalixar.servidor.dao.OfficeDAOImpl;
import org.iesalixar.servidor.models.Employee;
import org.iesalixar.servidor.models.Office;

/**
 * Servlet implementation class AddEmpleadoServlet
 */
public class AddEmpleadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpleadoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		OfficeDAOImpl officeDAO = new OfficeDAOImpl();
		EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
		
		ArrayList<Office> oficinas = officeDAO.getAll();
		ArrayList<Employee> empleados = employeeDAO.getAll();
		
		request.setAttribute("oficinas", oficinas);
		request.setAttribute("empleados", empleados);
		
		request.getRequestDispatcher("/WEB-INF/view/Admin/addempleado.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int numeroEmpleado = Integer.parseInt(request.getParameter("employeeNumber"));
		String nombre = request.getParameter("firstName");
		String apellido = request.getParameter("firstName");
		String extension = request.getParameter("extension");
		String puesto = request.getParameter("jobTitle");
		String mail = request.getParameter("mail");
		String oficina = request.getParameter("officeCode");
		int jefe = Integer.parseInt(request.getParameter("jefe"));
		EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
		
		if (numeroEmpleado >= 0 && employeeDAO.getByEmployeeNumber(numeroEmpleado) == null && jefe >= 0 && nombre != null && apellido != null && extension != null && puesto != null
				&& oficina != null) {
			Employee empleado = new Employee();
			System.out.println();
			empleado.setEmployeeNumber(numeroEmpleado);
			empleado.setLastName(apellido);
			empleado.setFirstName(nombre);
			empleado.setExtension(extension);
			empleado.setEmail(mail);
			empleado.setOfficeCode(oficina);
			empleado.setReportsTo(jefe);
			empleado.setJobTitle(puesto);

			employeeDAO.createEmployee(empleado);
			
			
			response.sendRedirect(request.getContextPath()+"/Admin/Empleados");

		} else {
			
			request.setAttribute("errorEmpleado", "Numero de empleado existente");
			
			doGet(request, response);
			
		}
	}

}
