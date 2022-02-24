package org.iesalixar.servidor.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.iesalixar.servidor.dao.ProductDAOImpl;
import org.iesalixar.servidor.dao.ProductLineDAOImpl;
import org.iesalixar.servidor.models.Product;
import org.iesalixar.servidor.models.ProductLine;

/**
 * Servlet implementation class AddProductServlet
 */
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductLineDAOImpl plDAO = new ProductLineDAOImpl();
		ArrayList<ProductLine> productLines = plDAO.getAll();
		
		request.setAttribute("productLines", productLines);
		
		request.getRequestDispatcher("/WEB-INF/view/Admin/addproducto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String codigoProducto = request.getParameter("productCode");
		String nombreProducto = request.getParameter("productName");
		String lineaProducto = request.getParameter("productLine");
		String escalaProducto = request.getParameter("productScale");
		String vendedorProducto = request.getParameter("productVendor");
		String descripcionProducto = request.getParameter("productDescription");
		int stock = Integer.parseInt(request.getParameter("stock"));
		Double buyPrice = Double.parseDouble(request.getParameter("buyPrice"));
		Double msrp = Double.parseDouble(request.getParameter("msrp"));
		
		ProductDAOImpl productDAO = new ProductDAOImpl();
		
		if (
				stock >= 0 && 
				buyPrice >= 0 && 
				msrp >= 0 && 
				productDAO.getByProductCode(codigoProducto) == null && 
				codigoProducto != null && nombreProducto != null && 
				lineaProducto != null && escalaProducto != null &&
				vendedorProducto != null && 
				descripcionProducto != null 
				) {
			
			Product producto = new Product();
			producto.setProductCode(codigoProducto);
			producto.setProductName(nombreProducto);
			producto.setProductLine(lineaProducto);
			producto.setProductScale(escalaProducto);
			producto.setProductVendor(vendedorProducto);
			producto.setProductDescription(descripcionProducto);
			producto.setQuantityInStock(stock);
			producto.setBuyPrice(buyPrice);
			producto.setMsrp(msrp);

			productDAO.createProduct(producto);
			
			request.setAttribute("correcto", "Se ha insertado el producto correctamente");
			doGet(request, response);
			

		} else {
			
			request.setAttribute("errorProducto", "Numero de producto existente");
			
			doGet(request, response);
			
		}
	}

}
