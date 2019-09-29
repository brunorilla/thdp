package bucles;

import java.util.Scanner;

public class EjercicioOnce {
	private static Scanner input;
	
	public static final  String MSG_INICIAL = "Por favor ingrese dos números enteros. El base y las veces que quiera que se multiplique el mismo";
	public static int devolverProducto(int num1, int num2) {
		int aux;
		int result = 0;
		int i;

		if(validarMayor(num1,num2)) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		 
		for (i = 1; i <= num2; i++) {
			result += num1;
		 }
		 return result;
	}
	
	public static void Mostrar(String msg) {
		System.out.println(msg);
	}
	public static boolean validarMayor(int num1, int num2) {
		boolean mayor = false;

		if(num2 > num1) {
			mayor = true;
		}
		return mayor;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		int aux;
		int result = 0;
		
		Mostrar(MSG_INICIAL);
		
		input = new Scanner(System.in);	
		
			num1 = input.nextInt();
			num2 = input.nextInt();

			result = devolverProducto(num1,num2);
			
			System.out.println("EL RESULTADO DE LAS SUMAS SUCESIVAS de " +num1 +  " ("+num2+" veces) es de " +  result);
		
		input.close();
	
	}

}
