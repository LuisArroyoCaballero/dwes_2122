package Classes;

public class Cuadrado extends Figura{
	
	public Cuadrado(String color) {
		super(color);
	}

	public void dibujarFigura() {
		System.out.println("Soy un cuadrado de color "+ this.getColor());
	}

	public String getColor() {
		return super.getColor();
	}

	public void setColor(String color) {
		this.setColor(color);
	}
	
	

}
