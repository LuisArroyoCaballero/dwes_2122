package Singleton;

public class Presidente {
	private static Presidente presidente = null;
	private String nombre;
	private String apellidos;
	private int year;
	
	private Presidente(String nombre, String apellidos, int year) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.year = year;
	}

	public static Presidente getPresidenteElecto(String nombre, String apellidos, int year) {
		if (presidente == null) {
			presidente = new Presidente(nombre, apellidos, year);
		} 			
		return presidente;
		
	}
	
	public static Presidente getPresidente() {
		return presidente;
	}

	public static void setPresidente(Presidente presidente) {
		Presidente.presidente = presidente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Presidente [nombre=" + nombre + ", apellidos=" + apellidos + ", year=" + year + "]";
	}
	
	
	
	

}
