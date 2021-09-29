package Classes;

public class Tren {
	private String modelo;
	private Maquinista maquinista;
	private Locomotora locomotora;
	
	
	public Tren(String modelo, Maquinista maquinista, Locomotora locomotora) {
		super();
		this.modelo = modelo;
		this.maquinista = maquinista;
		this.locomotora = locomotora;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Maquinista getMaquinista() {
		return maquinista;
	}


	public void setMaquinista(Maquinista maquinista) {
		this.maquinista = maquinista;
	}


	public Locomotora getLocomotora() {
		return locomotora;
	}


	public void setLocomotora(Locomotora locomotora) {
		this.locomotora = locomotora;
	}


	
	
	
	
	
}
