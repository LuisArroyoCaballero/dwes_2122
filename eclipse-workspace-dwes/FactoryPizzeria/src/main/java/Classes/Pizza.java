package Classes;

public abstract class Pizza {
	
	private String nombre;
	
	

	public Pizza(String nombre) {
		super();
		this.nombre = nombre;
	}


	public abstract void cookPizza();
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
