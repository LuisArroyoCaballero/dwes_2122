		package org.iesalixar.servidor.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.iesalixar.servidor.dao.ProductLineDAOImpl;
import org.iesalixar.servidor.models.ProductLine;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String role = (String) session.getAttribute("role");
		ProductLineDAOImpl productlineDAO = new ProductLineDAOImpl();
		ArrayList<ProductLine> productLineList = productlineDAO.getAll();
		
		request.setAttribute("role", role);
		request.setAttribute("productLineList", productLineList);

		request.getRequestDispatcher("WEB-INF/view/home.jsp").forward(request, response);
	}

}
