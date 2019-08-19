package tp1;

import java.util.Scanner;


public class LimpiarUnString {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entre 1 y 10");
		
		int num1 = input.nextInt();
		
		System.out.println("Ingrese otro número");
		input.nextLine(); // Limpieza del buffer
		
		char letra = input.next().charAt(0);
		System.out.println("Su letra fue " + letra);
		
		System.out.println("Ingrese una palabra");
		input.nextLine();
		String prueba = input.nextLine();
		System.out.println("Su palabra elegida fue: " + prueba);
		
		input.close();
		
	}

}
