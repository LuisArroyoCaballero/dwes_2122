package Clients;

import Singleton.Deposit;

public class Bucket {
	private int cantidadBucket;

	public Bucket(int cantidadBucket) {
		setCantidadBucket(cantidadBucket);;
	}

	public int getCantidadBucket() {
		return cantidadBucket;
	}

	public void setCantidadBucket(int cantidadBucket) {
		this.cantidadBucket = cantidadBucket;
	}
	
	public void vaciar() {
		Deposit.getDeposito();
		Deposit.llenarDeposito(getCantidadBucket());
		setCantidadBucket(0);
		
	}
	
	public void llenar() {
		Deposit.getDeposito();
		Deposit.vaciarDeposito(getCantidadBucket());
		setCantidadBucket(25);
	}
	
	
	
}
