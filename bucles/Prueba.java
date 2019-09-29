package bucles;

import java.util.Scanner;

public class Prueba {
	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int ingreso = 0;
		int prom = 0;
		int acum = 0;
		System.out.println("Start");
		input = new Scanner(System.in);
		
		do {
			counter ++;
			ingreso = input.nextInt();
			acum = acum + ingreso;
			prom = acum/counter;
			System.out.println("Promedio de la vuelta -> " + prom);
			System.out.println("Counter de la vuelta -> " + counter);
			
		} while (prom < 20);
	
		System.out.println("Promedio es igual a: " + prom);
		System.out.println("Acumulado es igual a: " + acum);
		System.out.println("Cantidad de valores leídos: " + counter);
		
	input.close();
	}

}
