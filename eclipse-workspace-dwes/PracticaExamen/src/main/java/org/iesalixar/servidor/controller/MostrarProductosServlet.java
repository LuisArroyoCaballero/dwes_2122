package org.iesalixar.servidor.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.servidor.dao.ProductDAOImpl;
import org.iesalixar.servidor.models.Product;

/**
 * Servlet implementation class MostrarProductosServlet
 */

public class MostrarProductosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarProductosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String productLine = request.getParameter("pl");
		if (productLine != null) {
			ProductDAOImpl productDao = new ProductDAOImpl();

			ArrayList<Product> productos = productDao.getAllProducts(productLine);
			request.setAttribute("productos", productos);
			request.setAttribute("productLine", productLine);
			
		}else {
			request.setAttribute("error", "Categoría NO SELECCIONADA");
		}
		request.getRequestDispatcher("/WEB-INF/view/mostrarproductos.jsp").forward(request, response);
	}

}
