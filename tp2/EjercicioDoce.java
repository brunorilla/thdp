package tp2;

import java.util.Scanner;
import java.util.Random;

public class EjercicioDoce {
	private static Scanner input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		input = new Scanner(System.in);
		Random rand = new Random();
		
		int counter = 0;
		
		// Primer lanzamiento:
		
		System.out.println("Bienvenido al juego \n \t \t Apriete enter para lanzar el primer dado");
		input.nextLine();
		int firstThrow = rand.nextInt(6);
		firstThrow +=  1;
		
		if (firstThrow == 6) {
			counter ++;
		}
		
		System.out.println("Primer lanzamiento: " + firstThrow);

		// Segundo lanzamiento:
		
		System.out.println("Apriete enter para el segundo lanzamiento");
		input.nextLine();
		int secondThrow = rand.nextInt(6);
		secondThrow += 1;
		System.out.println("Segundo lanzamiento: " + secondThrow);
		
		if(secondThrow == 6) {
			counter ++;
		}
		
		// Tercer lanzamiento
		
		System.out.println("Apriete enter para realizar el último lanzamiento");
		input.nextLine();
		int thirdThrow = rand.nextInt(6);
		thirdThrow += 1;
		System.out.println("Tercer lanzamiento:  " + thirdThrow);

		if(thirdThrow == 6) {
			counter ++;
		}
		
		input.close();
		
		System.out.println("\nSu calificación: ");
		// Output
		switch (counter) {
		case 1: 
			System.out.println("Regular");
			break;
		case 2:
			System.out.println("Muy Bien");
			break;
		case 3:
			System.out.println("EXCELENTE");
			break;
		default:
			System.out.println("Insuficiente");
		}
		
	}

}
