package Classes;

public class Circulo extends Figura{
	
	
	public Circulo(String color) {
		super(color);
	}

	public void dibujarFigura() {
		System.out.println("Soy un circulo de color "+ this.getColor());
	}

	public String getColor() {
		return super.getColor();
	}

	public void setColor(String color) {
		this.setColor(color);
	}
	
	
	
	
}
