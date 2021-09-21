package Main;

import Clients.Bucket;
import Singleton.Deposit;

public class Main {
	public static void main(String[] args) {
		Bucket c1 = new Bucket(5);
		Bucket c2 = new Bucket(6);
		Bucket c3 = new Bucket(9);
		
		c1.vaciar();
		c2.vaciar();
		c3.vaciar();
		
		System.out.println(Deposit.getCantidad());
	}

}
