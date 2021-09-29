package Classes;

public class Barbacoa extends Pizza{

	public Barbacoa(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cookPizza() {
		System.out.println("Llenita de carne estoy.");
		
	}

}
