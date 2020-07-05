package tp2;

import java.util.Scanner;

public class EjercicioDiez {

	private static final int HORA_APERTURA = 10;
	private static final int HORA_CIERRE = 18;
	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				input = new Scanner(System.in);
			
			System.out.println("Hola, gracias por visitar el estacionamiento. Ingrese la hora actual por favor: ");
			
			int horaUser = input.nextInt();
			
			boolean isOpen;
			
			// Mensajes para el usuario
			
			String notValid = "Hora no válida, ingrese un valor entre 0 y 24";
			String open = "Estacionamiento abierto. Bienvenido";
			String closed = "Estacionamiento cerrado. Regrese de 10hs a 18hs";
			
			while (horaUser >= 24 || horaUser <= 0) { 
				System.out.println(notValid);
				horaUser = input.nextInt();
			} 
			if ( (horaUser >=  HORA_APERTURA) && (horaUser <= HORA_CIERRE)) {
				isOpen = true;
				System.out.println(open);
			} else {
				isOpen = false;
				System.out.println(closed);
			}
			input.close();
	}
}
