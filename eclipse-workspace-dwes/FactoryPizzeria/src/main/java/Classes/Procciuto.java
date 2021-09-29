package Classes;

public class Procciuto extends Pizza{

	public Procciuto(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cookPizza() {
		System.out.println("La tipica de jamon york y queso");
	}

}
