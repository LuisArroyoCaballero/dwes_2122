package Main;

import Classes.Figura;
import Factory.EnumFigura;
import Factory.FiguraFactory;

public class Main {
	public static void main(String[] args) {

		Figura triangulo1 = FiguraFactory.representarFigura("rojo", EnumFigura.Triangulo);
		Figura circulo1 = FiguraFactory.representarFigura("azul", EnumFigura.Circulo);
		Figura rectangulo1 = FiguraFactory.representarFigura("amarillo", EnumFigura.Rectangulo);
		Figura cuadrado1 = FiguraFactory.representarFigura("verde", EnumFigura.Cuadrado);
		
		triangulo1.dibujarFigura();
		circulo1.dibujarFigura();
		rectangulo1.dibujarFigura();
		cuadrado1.dibujarFigura();
		
	}

}
