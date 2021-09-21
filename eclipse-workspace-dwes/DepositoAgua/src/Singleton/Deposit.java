package Singleton;

public class Deposit {
	private static Deposit deposito = null;
	private static int cantidad = 0;
	
	private Deposit() {
		System.out.println("Soy un deposito.");
	}
	
	public static int llenarDeposito(int cantidadBucket) {
		setCantidad(getCantidad()+cantidadBucket);
		return getCantidad();
	}
	public static int vaciarDeposito(int cantidadBucket) {
		setCantidad(getCantidad()-cantidadBucket);
		return getCantidad();
	}

	public static Deposit getDeposito() {
		if (deposito == null) {
			deposito = new Deposit();
		} 
			return deposito;
	}
	public static void setDeposito(Deposit deposito) {
		Deposit.deposito = deposito;
	}
	public static int getCantidad() {
		return cantidad;
	}

	public static void setCantidad(int cantidad) {
		Deposit.cantidad = cantidad;
	}
	
	
}
