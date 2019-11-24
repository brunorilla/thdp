package ejercicio8;

import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato tom = new Gato();
		Raton jerry = new Raton();
		Raton jerry1 = new Raton();
		Raton jerry2 = new Raton();
		
		tom.setEnergia(100);
		jerry.setEnergia(20);
		
		int corridoGato = tom.correr(100);
		int corridoRaton = jerry.correr(100);
		
		System.out.println("Corrido gato"  + corridoGato);
		System.out.println("Corrido raton"  + corridoRaton);
		
		tom.alcanzar(jerry, 100);
	
		ArrayList<Raton> ratones = new ArrayList<Raton>();
		
		ratones.add(jerry);
		ratones.add(jerry2);
		
		System.out.println(ratones.size());
		
		for (Raton raton: ratones) {
			System.out.println(raton);
		}
	
	}

}
