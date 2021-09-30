package Main;

import Singleton.Presidente;

public class Main {
	public static void main(String[] args) {
		Presidente p1 = Presidente.getPresidenteElecto("Barack", "Obama", 2012);
		System.out.println(Presidente.getPresidente());
		Presidente p2 = Presidente.getPresidenteElecto("Mariano", "Rajoy", 2018);
		System.out.println(Presidente.getPresidente());
		
		System.out.println(p1.equals(p2));
	}
}
