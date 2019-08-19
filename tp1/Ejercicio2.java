package tp1;

import java.util.Scanner;

public class Ejercicio2 {
	
	private static Scanner input;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		
		System.out.println("Ingrese un número entre 1 y 10");
		
		int num1 = input.nextInt();
		
		System.out.println("Ingrese otro número cualquiera");
		
		
		int num2 = input.nextInt();
		
		int suma = num1 + num2;
		
		System.out.println("El resultado de la suma es: " + suma );
		
		input.close();
	}

}
