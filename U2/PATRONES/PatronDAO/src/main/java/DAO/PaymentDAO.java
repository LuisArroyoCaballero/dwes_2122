package DAO;

import java.util.List;

import Models.Payment;

public interface PaymentDAO {
	public void createPayment(Payment pago);
	public List<Payment> getPaymentList();
}
