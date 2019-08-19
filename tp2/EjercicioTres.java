package tp2;

import java.util.Scanner;

public class EjercicioTres {

	private static Scanner input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		
		System.out.println("Hola! Por favor ingrese su nombre");
		
		String nombre = input.nextLine();
		
		System.out.println("Hola " + nombre + " ¿Cómo estás?");
		
		input.close();
		
	}

}
