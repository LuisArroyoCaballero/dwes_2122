package Factory;

import Classes.Barbacoa;
import Classes.Carbonara;
import Classes.Pizza;
import Classes.Procciuto;
import Classes.Tropical;

public class PizzaFactory {
	public static Pizza cocinarPizza(String nombre) {
		if (nombre == "Tropical") {
			return new Tropical("Pizza "+nombre);
		} else if (nombre == "Barbacoa") {
			return new  Barbacoa("Pizza "+nombre);
		} else if (nombre == "Carbonara") {
			return new Carbonara("Pizza "+nombre);
		} else {
			return new Procciuto("Pizza Procciuto");
		}
		
	}
}
