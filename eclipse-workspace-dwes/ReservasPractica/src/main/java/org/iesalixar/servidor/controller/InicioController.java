package org.iesalixar.servidor.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InicioController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InicioController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
		
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		if (!session.isNew()) {
			
		}
	}
}
