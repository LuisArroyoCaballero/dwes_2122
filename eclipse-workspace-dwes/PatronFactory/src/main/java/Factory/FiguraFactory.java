package Factory;

import Classes.Circulo;
import Classes.Cuadrado;
import Classes.Figura;
import Classes.Rectangulo;
import Classes.Triangulo;

public class FiguraFactory {
	
	public static Figura representarFigura(String color, EnumFigura tipo) {
		if (tipo == EnumFigura.Rectangulo) {
			return new Rectangulo(color);
		} else if (tipo == EnumFigura.Cuadrado) {
			return new Cuadrado(color);
		} else if (tipo == EnumFigura.Triangulo)  {
			return new Triangulo(color);
		} else {
			return new Circulo(color);
		}
	}

}
