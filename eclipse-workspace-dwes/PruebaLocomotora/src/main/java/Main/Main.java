package Main;

import Classes.Locomotora;
import Classes.Maquinista;
import Classes.MaquinistaEspecial;
import Classes.Tren;

public class Main {
	public static void main(String[] args) {
		Tren t1 = new Tren("Modelo100", new MaquinistaEspecial("Luis", "Arroyo", "calle 2", 5, 123), new Locomotora("Modelo 7", 500, 100));
		
		System.out.println(t1.getMaquinista().getNombre());
	}
}
