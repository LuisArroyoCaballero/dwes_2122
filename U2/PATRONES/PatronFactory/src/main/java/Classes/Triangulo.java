package Classes;

public class Triangulo extends Figura{
	
	public Triangulo(String color) {
		super(color);
	}

	public void dibujarFigura() {
		System.out.println("Soy un triangulo de color "+ this.getColor());
	}

	public String getColor() {
		return super.getColor();
	}

	public void setColor(String color) {
		this.setColor(color);
	}
}
