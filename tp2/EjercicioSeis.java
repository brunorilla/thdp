package tp2;
import java.util.Scanner;

public class EjercicioSeis {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Ingrese por favor un número entero mayor que 0");
		
		int ingresoUser = input.nextInt();

		if(ingresoUser <= 0) {
			System.out.println("El número debería haber sido mayor a cero. Perdiste");
		} else if (ingresoUser % 2 == 0){
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}

		
		input.close();
	}
}