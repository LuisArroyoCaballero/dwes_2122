package evinicial;

import DAO.ClassicModelsDAO;
import DBSingleton.ConexionDB;

public class Main {
	public static void main(String[] args) {

		System.out.println("-----------------------------");
		System.out.println("LISTA DE EMPLEADOS");
		System.out.println(ClassicModelsDAO.getEmpleados());
		System.out.println("-----------------------------");

		System.out.println("-----------------------------");
		System.out.println("LISTA DE OFICINAS");
		System.out.println(ClassicModelsDAO.getOffices());
		System.out.println("-----------------------------");

		// Cierro cualquier conexi?n que se haya abierto en otro lado
		ConexionDB.close();
	}

}
