package tp2;

import java.util.Scanner;



public class EjercicioNueve {
	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		
		System.out.println("Por favor ingrese el nombre y capital de las 3 personas que conforman la sociedad");
	
		System.out.println("Ingrese el nombre de la persona");
		String persona1 = input.nextLine();
		System.out.println("Ingrese el capital");
		int capital1 = input.nextInt();

		input.nextLine(); // Limpieza del buffer	
		
		System.out.println("Ingrese los datos de la segunda persona");
		System.out.println("Ingrese el nombre");		
		String persona2 =  input.nextLine();
		System.out.println("Ingrese el capital aportado");
		int capital2 = input.nextInt();
		input.nextLine(); // Limpieza del buffer		

		System.out.println("Ingrese los datos de la tercer persona");

		System.out.println("Ingrese el nombre");
		String persona3 = input.nextLine();
		System.out.println("Ingrese el capital aportado");
		int capital3 = input.nextInt();

		input.nextLine(); // Limpieza del buffer		

		double capitalTotal = capital1 + capital2 + capital3; 

		// Cálculo de porcentajes
		
		double porcentaje1 = (capital1 * 100) / capitalTotal; 		
		double porcentaje2 = (capital2 * 100) / capitalTotal; 		
		double porcentaje3 = (capital3 * 100) / capitalTotal; 		
		
		System.out.println("Datos de la sociedad:" +  '\n' 
									+ '\t'	+ "Integrantes" + '\n'
									+ '\t' +'\t' + "Nombre: " + persona1 + '\n'
									+ '\t' +'\t' + "Capital aportado: $" + capital1 + '\n'
									+ '\t' +'\t' + "Porcentaje del capital: " + porcentaje1 +"%" + '\n' + '\n'
									+ '\t' +'\t' + "Nombre: " + persona2 + '\n'				
									+ '\t' +'\t' + "Capital aportado: $" + capital2 + '\n'
									+ '\t' +'\t' + "Porcentaje del capital: " + porcentaje2 +"%" + '\n' + '\n'
									+ '\t' +'\t' + "Nombre: " + persona3 + '\n'
									+ '\t' +'\t' + "Capital aportado: $" + capital3 + '\n'
									+ '\t' +'\t' + "Porcentaje del capital: " + porcentaje3 + "%" + '\n' +'\n' +
									"Capital total de la sociedad:  $" + capitalTotal);		
	}

}
