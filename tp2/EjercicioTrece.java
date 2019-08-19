package tp2;

import java.util.Scanner;



public class EjercicioTrece {
	// Valor de las horas-trabajo
	final static int STD_HOUR = 16;
	final static int EXT_HOUR =  STD_HOUR + 20;
	
	private static Scanner input;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Hora estándar
		System.out.println("\t CALCULADORA DE SALARIO SEMANAL \n");
		
		Thread.sleep(1000);
		
		System.out.println("Por favor ingrese a continuación la cantidad de horas enteras trabajadas durante la semana \n");
		
		int horasFinales;
		
		input = new Scanner(System.in);
		
		int horasTrabajadas = input.nextInt();
		int salarioTotal;
		
		if (horasTrabajadas > 40) {
			int horasExtras = horasTrabajadas - 40;
			int salarioParcial = 40 * STD_HOUR;
			int salarioExtra = horasExtras * EXT_HOUR;
			salarioTotal = salarioParcial + salarioExtra;		
		} else {
			salarioTotal = horasTrabajadas * STD_HOUR;
		}
		
		input.close();
	
		System.out.println("El salario a percibir por esta semana de trabajo será: $" + salarioTotal );
	}

}
