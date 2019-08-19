package tp2;
import java.util.Scanner;

public class EjercicioSiete {
	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Ingrese 3 números enteros");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("El número más grande es el " + num1);
		} else if (num2 > num1 && num2 > num3){
			System.out.println("El número más grande es el " + num2);
		} else if(num3 > num1 && num3 > num2) {
			System.out.println("El número más grande es el " + num3);
		} else {
			System.out.println("Los 3 números son iguales");
		}
		
		input.close();
	}
}
