package tp2;

import java.util.Scanner;
import java.util.Random;



public class EjercicioOnce {

	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
		Random rand = new Random();
		String ticketDate;
		int n = rand.nextInt(500000);
		n += 1;
		
		System.out.println("Bienvenido al sistema \n Ingrese la fecha de su compra en el formato YYYYMMDD");
		
		ticketDate = input.nextLine();
		System.out.println("Ingrese su nombre y apellido");
		String customerName = input.nextLine();
		System.out.println("Ingrese el producto a comprar");
		String productName = input.nextLine();
		System.out.println("Ingrese cantidad de productos solicitados");
		int productQuant = input.nextInt();
		System.out.println("Ingrese el precio del producto");
		double productPrice = input.nextDouble();
		
		double finalPrice = (int) productQuant * productPrice;
		
		System.out.println("\n JSON S.A \n"
				+ "\t Número de ticket: " + n + "\n"
				+ "\t Fecha: " + ticketDate + "\n"
				+ "\t Nombre del cliente: " + customerName + "\n"
				+ "\t Producto solicitado: " + productName + "\n"
				+ "\t Cantidad solicitada: " + productQuant + "\n"
				+ "\t Precio unitario: " + productPrice + "\n"
				+ "\t Total a pagar: $" + finalPrice);
		
		
		input.close();
		
	}

}
