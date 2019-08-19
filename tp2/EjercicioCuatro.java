package tp2;

import java.util.Scanner;

public class EjercicioCuatro {
	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Hola, por favor ingrese dos números enteros");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int suma = num1 + num2;
		
		input.close();
		
		
		
		System.out.println("La suma entre " + num1 + " y  " + num2 + " da como resultado: " + suma );
		
	}
}
