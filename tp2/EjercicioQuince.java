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
			
			System.out.println("Ingrese un n�mero" + "\n");	
			
			int num = input.nextInt();
			// Checkear si est� en A (Es de un d�gito)
			if(num < 10 && num > -10) {
				estaEnA = true;
				System.out.println("Su n�mero es de un s�lo d�gito" + "\n" );
			} else {
				estaEnA = false;
				System.out.println("Su n�mero es de m�s de un d�gito" + "\n");
			}
			if(num % 2 == 0) {
				estaEnB = true;
				System.out.println("Su n�mero es par" + "\n");
			} else {
				estaEnB = false;
				System.out.println("Su n�mero es impar" + "\n");
			}
			if(estaEnA && estaEnB) {
				estaEnAmbos = true;
				System.out.println("Su n�mero est� en el grupo A y B" + "\n");
			} else if (!estaEnA && !estaEnB) {
				noEstaEnNinguno = true;
				System.out.println("Su n�mero no est� en ning�n grupo" + "\n");
			}
			
			counter ++;
		}
		System.out.println("######################");
		System.out.println("Gracias por utilizar el sistema");
		System.out.println("######################");
		input.close();
		
	}

}
