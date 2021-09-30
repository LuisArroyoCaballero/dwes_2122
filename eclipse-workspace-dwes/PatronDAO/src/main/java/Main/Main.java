package Main;

import ConexionDB.ConexionDB;
import DAO.PaymentDAOImp;
import Models.Payment;

public class Main {
	public static void main(String[] args) {
		System.out.println("-----------------------------");
		System.out.println("LISTA DE PAGOS");
		System.out.println(new PaymentDAOImp().getPaymentList());
		System.out.println("-----------------------------");
		new PaymentDAOImp().createPayment(new Payment(103, "PT550181", "2004-02-29", 1200));
		System.out.println(new PaymentDAOImp().getPaymentList());
		
		ConexionDB.close();
	}

}
