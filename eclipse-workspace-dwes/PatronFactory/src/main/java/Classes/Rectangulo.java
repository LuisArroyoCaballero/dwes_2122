package Classes;

public class Rectangulo extends Figura{

	public Rectangulo(String color) {
		super(color);
	}

	public void dibujarFigura() {
		System.out.println("Soy un rectangulo de color "+ this.getColor());
	}

	public String getColor() {
		return super.getColor();
	}

	public void setColor(String color) {
		this.setColor(color);
	}
}
