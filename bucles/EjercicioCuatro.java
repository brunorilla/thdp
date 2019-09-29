package bucles;

import java.util.Scanner;

public class EjercicioCuatro {
	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Ingrese dos n�meros enteros. El primero mayor o igual al segundo");
		
		num1 = input.nextInt();
		
		System.out.println("Ingrese el otro n�mero");
	
		num2 = input.nextInt();
		while(num2 > num1) {
			System.out.println("Ingrese un n�mero menor al primero");
			num2 = input.nextInt();
		}
		
		// Secuencia incluyendo los n�meros
		System.out.println("Secuencia incluyendo los n�meros");
		for(int i = num2; i <= num1; i++) {
			System.out.println(i);
		}
		
		System.out.println("Secuencia excluyendo los n�meros");
		
		for (int i = num2 +1; i <= num1 -1; i++) {
			System.out.println(i);
		}
		
		
		
		input.close();
		
	}

}
