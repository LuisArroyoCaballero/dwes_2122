package Main;

import Animals.Animal;
import Factory.AnimalFactory;

public class Main {
	public static void main(String[] args) {
		Animal a1 = AnimalFactory.createAnimal("Paco","Cat");
		a1.greet();
	}


}
