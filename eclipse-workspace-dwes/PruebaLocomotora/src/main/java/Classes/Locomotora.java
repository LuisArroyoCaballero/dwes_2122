package Classes;

public class Locomotora {
	private String modelo;
	private double potencia;
	private double longitud;
	
	//CONSTRUCTORES
	
	public Locomotora(String modelo, float potencia, float longitud) {
		super();
		this.modelo = modelo;
		this.potencia = potencia;
		this.longitud = longitud;
	}

	
	//GETTERS & SETTERS


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}


	public double getLongitud() {
		return longitud;
	}


	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	
	
}
