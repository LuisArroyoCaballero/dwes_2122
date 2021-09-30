package Models;

public class Payment {
	private int customerNumber;
	private String checkNumber;
	private String paymantDate;
	private double amount;
	
	// CONSTRUCTOR
	
	public Payment(int customerNumber, String checkNumber, String paymantDate, double amount) {
		super();
		this.customerNumber = customerNumber;
		this.checkNumber = checkNumber;
		this.paymantDate = paymantDate;
		this.amount = amount;
	}
	
	//GETTER & SETTER	
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCheckNumber() {
		return checkNumber;
	}
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}
	public String getPaymantDate() {
		return paymantDate;
	}
	public void setPaymantDate(String paymantDate) {
		this.paymantDate = paymantDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Payments [customerNumber=" + customerNumber + ", checkNumber=" + checkNumber + ", paymantDate="
				+ paymantDate + ", amount=" + amount + "]";
	}
	
	
	
	
}
