package Main;

import Classes.Casa;
import Classes.Pared;
import Classes.Tejado;
import Classes.TejadoTejas;

public class Main {
	public static void main(String[] args) {
		
		Casa casa1 = new Casa(50, new Tejado(), new Pared(10), new Pared(29.6), new Pared(20), new Pared(30));
		Casa casa2 = new Casa(50, new TejadoTejas(), new Pared(52), new Pared(15), new Pared(76), new Pared(14));
		
		// COMPROBAMOS QUE LAS PAREDES SON DISTINTAS
		
		System.out.println(casa1.toString());
		System.out.println(casa2.toString());
		
		// COMPROBAMOS LA LA INYECCION DE TEJADOS DISTINTOS
		
		casa1.getTejado().darSoporte();
		casa2.getTejado().darSoporte();
	}

}
