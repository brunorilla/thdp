package bucles;

import java.util.Scanner;

public class EjercicioNueve {
	
public static void Mostrar(String mensaje) {
	System.out.println(mensaje);
}
	
 private static Scanner input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		
		int acum = 0;
		int counter;
		int ingreso;
		double prom;
		int i = 0;
		int j = 0;
		
		for ( i = 1; i <= 5; i++) {
			for ( j = 1; j <= 3; j++) {
				Mostrar("Ingrese un número entero");
				ingreso = input.nextInt();
				acum = acum + ingreso;
			}
			prom = acum / j;
			acum = 0;
			Mostrar("Juego " + i);
			Mostrar("El promedio de su juego es " + prom);
		}
		
		input.close();
	}

}
