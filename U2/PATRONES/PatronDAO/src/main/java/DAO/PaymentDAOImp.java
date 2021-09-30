package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ConexionDB.ConexionDB;
import Models.Payment;

public class PaymentDAOImp implements PaymentDAO {

	// Metodo que crea un nuevo pago en la base de datos

	public void createPayment(Payment pago) {
		Connection con = ConexionDB.getConnection();

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from customers where customerNumber=" + pago.getCustomerNumber());

			int numeroClaves = 0;
			while (rs.next()) {
				numeroClaves++;
			}

			if (numeroClaves != 0) {
				st.executeUpdate("insert into payments(customerNumber, checkNumber, paymentDate, amount) values ("
						+ pago.getCustomerNumber() + "," + pago.getCheckNumber()+ ","+pago.getPaymantDate()+","+pago.getAmount()+ ")");
			} else {
				System.out.println("El numero de cliente no existe");
			}

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}

	}

	// Metodo que devuelve la lista de pagos de la base de datos

	public List<Payment> getPaymentList() {
		return getPaymentListStatic();
	};

	public List<Payment> getPaymentListStatic() {
		Connection con = ConexionDB.getConnection();
		ArrayList<Payment> listaPagos = new ArrayList<Payment>();

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from payments");

			while (rs.next()) {
				Payment e = new Payment(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
				listaPagos.add(e);
			}

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}

		return listaPagos;
	}

}
