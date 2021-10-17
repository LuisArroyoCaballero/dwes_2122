package org.iesalixar.servidor;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.ArrayAllocationExpression;

/**
 * Servlet implementation class Properties
 */
@WebServlet("/LoadProperties")
public class LoadProperties extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadProperties() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<String> listaPropiedades = new ArrayList<String>();
		
		Properties prop = new Properties();
		InputStream is = null;
		
		try {
			is = new FileInputStream("EjemploProperties/resources/bd.properties");
			prop.load(is);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			is.close();
		}
		
		for (Enumeration e = prop.keys(); e.hasMoreElements();) {
			
			String key = (String) e.nextElement();
			
			listaPropiedades.add(prop.getProperty(key));
			
		}
		
		request.setAttribute("propiedades", listaPropiedades);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
