package bucles;

import java.util.Scanner;


public class EjercicioCinco {
	private static Scanner lector;
	public static void main(String[] args) {

		int counter = 0 ;
		int userInput;
		int prom = 0;
		int entries = 0;

		System.out.println("Ingrese n�meros enteros");
		
		lector = new Scanner(System.in);
			
		
		do {
			userInput = lector.nextInt();
			counter += userInput;
			entries ++;
			prom = counter/entries;
			System.out.println("Intentos: " + entries + "\n" + "Promedio: " + prom);
		} while(prom <= 20);
		
		System.out.println("El promedio alcanz� o super� 20. \n Total de valores le�dos: " + entries);
		lector.close();
		
	}
	
}
