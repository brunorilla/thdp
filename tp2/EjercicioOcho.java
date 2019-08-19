package tp2;

import java.util.Scanner;

public class EjercicioOcho {
	private static Scanner input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		
		System.out.println("Ingrese un número del 1 al 7 para saber a qué día corresponde");
		
		int dia = input.nextInt();
		
		switch(dia) {
			case 1:
				System.out.println("Eligió el día Domingo");
				break;
			case 2:
				System.out.println("Eligió el día Lunes");
				break;
			case 3:
				System.out.println("Eligió el día Martes");
				break;
			case 4:
				System.out.println("Eligió el día Miércoles");
				break;
			case 5:
				System.out.println("Eligió el día Jueves");
				break;
			case 6:
				System.out.println("Eligió el día Viernes");
				break;
			case 7:
				System.out.println("Eligió el día Domingo");
				break;
			default: 
					System.out.println("El día ingresado no es válido");
		}
		
		input.close();

	}

}
