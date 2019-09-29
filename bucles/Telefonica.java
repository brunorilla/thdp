package bucles;

import java.util.Scanner;

public class Telefonica {
	private static Scanner input;

	
	public static void main(String[] args) {
		int cod_cliente;
		int call_length;
		int calls;
		
		input = new Scanner(System.in);
		
		System.out.println("Ingrese el número de cliente");
		
		
		do {
			cod_cliente = input.nextInt();
			while(cod_cliente < 1001 || cod_cliente > 99999) {
				System.out.println("Ingrese un número de cliente según el formato esperado");
				cod_cliente = input.nextInt();
			}
			System.out.println("Continúo el programa");
		} while (cod_cliente != 0);

		System.out.println("Devuelvo todos los resultados");
		
		
		input.close();
	}
}
