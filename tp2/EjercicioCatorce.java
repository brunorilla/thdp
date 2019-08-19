package tp2;

import java.util.Scanner;

public class EjercicioCatorce {
	
	private static Scanner input;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("\t ORT CALCULATOR");
		
		System.out.println("\n �Qu� operaci�n desea realizar?");
		Thread.sleep(20);
		System.out.println("Ingrese: \n" + "s -> para sumar \n" + "r -> para restar \n" + "p -> para multiplicar \n" + "d -> para dividir");

		input = new Scanner(System.in);

		boolean validOperation = true;
		
		char operacion = input.next().charAt(0);
		operacion = Character.toLowerCase(operacion);
		
		// Validaci�n de operador:
		
		if (!(operacion == 'p' || operacion == 's' || operacion == 'r' || operacion == 'd')) {
			System.out.println("Ingrese un operador v�lido");
			System.exit(1);
		}

		int resultado = 0;
				
		System.out.println("Ingrese el primer n�mero");
		int firstNum = input.nextInt();
		System.out.println("Ingrese el segundo n�mero");
		int secondNum = input.nextInt();
		
		// Calculos:
		
		switch (operacion) {
		case 's':
			resultado = firstNum + secondNum;
			operacion = '+';
			break;
		case 'r':
			resultado = firstNum - secondNum;
			operacion = '-';
			break;
		case 'p':
			resultado = firstNum * secondNum;
			operacion = '*';
			break;
		case 'd':
			if(secondNum == 0) {
				System.out.println("No se puede dividir ning�n n�mero por cero"); 
				validOperation = false;
				break;
			}
			resultado = firstNum / secondNum;
			operacion = '/';
			break;
		}		
		
		// Si la operaci�n es v�lida:
		
			if(validOperation) {
				System.out.println("\n" + "Calculando...");
				Thread.sleep(300);
				System.out.println("\n" + "....");
				Thread.sleep(300);
				System.out.println("\n" + "..." + "\n");
				Thread.sleep(300);
				// Devuelvo resultado:			
				System.out.println(firstNum + " " + operacion + " " + secondNum  + " = "+ resultado );
			
			}
			
			input.close();
		
	}
}
