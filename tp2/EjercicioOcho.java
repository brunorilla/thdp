package tp2;

import java.util.Scanner;

public class EjercicioOcho {
	private static Scanner input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		
		System.out.println("Ingrese un n�mero del 1 al 7 para saber a qu� d�a corresponde");
		
		int dia = input.nextInt();
		
		switch(dia) {
			case 1:
				System.out.println("Eligi� el d�a Domingo");
				break;
			case 2:
				System.out.println("Eligi� el d�a Lunes");
				break;
			case 3:
				System.out.println("Eligi� el d�a Martes");
				break;
			case 4:
				System.out.println("Eligi� el d�a Mi�rcoles");
				break;
			case 5:
				System.out.println("Eligi� el d�a Jueves");
				break;
			case 6:
				System.out.println("Eligi� el d�a Viernes");
				break;
			case 7:
				System.out.println("Eligi� el d�a Domingo");
				break;
			default: 
					System.out.println("El d�a ingresado no es v�lido");
		}
		
		input.close();

	}

}
