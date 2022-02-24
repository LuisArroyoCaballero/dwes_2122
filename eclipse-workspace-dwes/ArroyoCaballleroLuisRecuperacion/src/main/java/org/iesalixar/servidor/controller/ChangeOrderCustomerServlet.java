package org.iesalixar.servidor.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.servidor.dao.CustomerDAOImpl;
import org.iesalixar.servidor.dao.OrderDAOImpl;
import org.iesalixar.servidor.models.Customer;
import org.iesalixar.servidor.models.Order;

/**
 * Servlet implementation class ChangeOrderCustomerServlet
 */
public class ChangeOrderCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeOrderCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		OrderDAOImpl orderDAO = new OrderDAOImpl();
		CustomerDAOImpl customerDAO = new CustomerDAOImpl();
		
		ArrayList<Customer> customers = customerDAO.getAll();
		Order order = orderDAO.getByOrderNumber(Integer.parseInt(request.getParameter("orderNumber")));
		
		request.setAttribute("order", order);
		request.setAttribute("customers", customers);
		
		request.getRequestDispatcher("/WEB-INF/view/Admin/changeordercustomer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int customerNumber = Integer.parseInt(request.getParameter("customerNumber"));
		int orderNumber = Integer.parseInt(request.getParameter("orderNumber"));
		
		
		if (customerNumber > 0 && orderNumber > 0) {
			OrderDAOImpl orderDAO = new OrderDAOImpl();
			
			orderDAO.updateOrder(orderNumber,customerNumber);
			
			request.setAttribute("correcto", "Se ha modificado el pedido correctamente");
			doGet(request, response);
		}
		
		else {
			
			request.setAttribute("errorProducto", "Numero de producto existente");
			
			doGet(request, response);
			
		}
		
	}

}
