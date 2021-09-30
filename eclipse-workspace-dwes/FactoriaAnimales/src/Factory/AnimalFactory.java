package Factory;

import Animals.Animal;
import Animals.Cat;
import Animals.Cow;
import Animals.Dog;

public class AnimalFactory {
	public static Animal createAnimal(String nombre, String tipo) {
		if (tipo == "Cat") {
			return new Cat(nombre);
		} else if (tipo == "Cow") {
			return new Cow(nombre);
		} else {
			return new Dog(nombre);
		}
	}
}
