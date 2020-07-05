package tp2;

import java.util.Scanner;


public class EjercicioQuince {

	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean estaEnA;
		boolean estaEnB;
		boolean estaEnAmbos;
		boolean noEstaEnNinguno;
		
		input = new Scanner(System.in);
		
		int counter = 0;
		
		while(counter < 5) {
			
			System.out.println("Ingrese un número" + "\n");	
			
			int num = input.nextInt();
			// Checkear si está en A (Es de un dígito)
			if(num < 10 && num > -10) {
				estaEnA = true;
				System.out.println("Su número es de un sólo dígito" + "\n" );
			} else {
				estaEnA = false;
				System.out.println("Su número es de más de un dígito" + "\n");
			}
			if(num % 2 == 0) {
				estaEnB = true;
				System.out.println("Su número es par" + "\n");
			} else {
				estaEnB = false;
				System.out.println("Su número es impar" + "\n");
			}
			if(estaEnA && estaEnB) {
				estaEnAmbos = true;
				System.out.println("Su número está en el grupo A y B" + "\n");
			} else if (!estaEnA && !estaEnB) {
				noEstaEnNinguno = true;
				System.out.println("Su número no está en ningún grupo" + "\n");
			}
			
			counter ++;
		}
		System.out.println("######################");
		System.out.println("Gracias por utilizar el sistema");
		System.out.println("######################");
		input.close();
		
	}

}
