package Classes;

public class MaquinistaEspecial extends Maquinista{
	
	private int antiguedad;
	private int codigo;

	public MaquinistaEspecial(String nombre, String apellidos, String direccion, int antiguedad, int codigo) {
		super(nombre, apellidos, direccion);
		this.antiguedad=antiguedad;
		this.codigo=codigo;
		// TODO Auto-generated constructor stub
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
	

	
	
	
	
	
}
