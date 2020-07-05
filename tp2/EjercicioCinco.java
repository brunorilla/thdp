package tp2;

import java.util.Scanner;



public class EjercicioCinco {
	
	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		System.out.println("Hola, por favor ingrese dos números enteros");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		if(num2 != 0) {
			  double resultado = (double) num1/num2;
			  System.out.println(num1 + " / " + num2 + " = " + resultado);
		} else {
			System.out.println("No se puede dividir por cero");
		}
		
		
		input.close();
	}

}
