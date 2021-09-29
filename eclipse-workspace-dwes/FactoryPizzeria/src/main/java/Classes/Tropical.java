package Classes;

public class Tropical extends Pizza{

	
	public Tropical(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cookPizza() {
		System.out.println("Por desgracia llevo piña");
	}
	
}
