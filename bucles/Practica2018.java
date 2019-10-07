package bucles;

import java.util.Scanner;

public class Practica2018 {
	
	final static String MSG_ERR = "Formato inválido. Por favor ingrese nuevamente";
	final static String MSG_ERR_BIL = "Ingrese una denominación de billetes existente";
	final static String MSG_ING = "Ingrese el tipo de billete a calcular o 0 para terminar el programa";
	
	
	final static int BIL_10 = 10;
	final static int BIL_20 = 20;
	final static int BIL_50 = 50;
	final static int BIL_100 =100;
	
	public static void mostrar(String msg) {
		System.out.println(msg);
	}
	
	public static double ObtenerPorcentaje(int num, int div) {
		while (div == 0) {
			mostrar("No se puede dividir por cero. Ingrese el divisor nuevamente");
			div = input.nextInt();
		}
		double aux = 0;
		aux = ((double) num)*100 / (double) div;
		return aux;
	}
	
	public static int validarIngreso(String msg) {
		int ingreso;
		mostrar(msg);
		ingreso = input.nextInt();
		while(ingreso < 0) {
			mostrar(MSG_ERR);
			ingreso = input.nextInt();
		}
		
		return ingreso;
		
	}
	
	public static int validarIngBillete(String msg) {
		int ingreso;
		
		mostrar(msg);
		ingreso = input.nextInt();
		if (ingreso != 0) {
			while (ingreso != BIL_10 && ingreso != BIL_20 && ingreso != BIL_50 && ingreso != BIL_100) {
				mostrar(MSG_ERR);
				ingreso = input.nextInt();
			}
		}
		return ingreso;
	}
	
	
	public static int calcularTotal(int cantidad, int valor_billete) {
		int total = 0;

		total = cantidad  * valor_billete;
		
		return total;
		
	}
	
	public static int SumarTipoBil(int tipo_bil, int comparador) {
		int counter = 0;
		if (tipo_bil == comparador) {
			counter++;
		}
		return counter;
	}
	
	public static int acumTipoBillete(int ingreso, int cantidad, int  tipo_billete) {
		int acum = 0;
		if(ingreso == tipo_billete) {
			acum = cantidad;
		}
		return acum;
	}
	
	public static int obtenerMayor(int num1, int num2) {
		int mayor;
		if(num1 > num2) {
			mayor = num1;
		} else {
			mayor = num2;
		}
		return mayor;
	}
	
	public static int mayorDenominador(int cant_bil_10, int cant_bil_20, int cant_bil_50, int cant_bil_100) {
		int mayor;
		int mayor_denom;
		mayor = obtenerMayor(obtenerMayor(cant_bil_10, cant_bil_20), obtenerMayor(cant_bil_50, cant_bil_100));
		
		if (mayor == cant_bil_10) {
			mayor_denom = BIL_10;
		} else if (mayor == cant_bil_20) {
			mayor_denom = BIL_20;
		} else if (mayor == cant_bil_50){
			mayor_denom = BIL_50;
		} else {
			mayor_denom = BIL_100;
		}
		
		return mayor_denom;
	}
	
	public static void  mostrarResults(int total_recaudado, double por_bil10, double por_bil20, double por_bil50, double por_bil100, int mayor_denom, int cant_mayor_denom) {
		mostrar("\t RESULTADOS \n" +
				"El total recaudado es de: $" + total_recaudado + "\n"
				+ "El porcentaje de billetes por denominación es el siguiente:" + "\n"
				+ "Billetes de $100: %" + por_bil100 + "\n"
				+ "Billetes de $50: %" + por_bil50 + "\n"
				+ "Billetes de $20: %" + por_bil20 + "\n"
				+ "Billetes de $10: %" + por_bil10 + "\n"
				+ "La denominación con mayor cantidad acumulada es " + mayor_denom + " (" +cant_mayor_denom + ") \n"
				);
	}
	
	
	private static Scanner input;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		int tot_bil_10 = 0, tot_bil_20 = 0, tot_bil_50 = 0, tot_bil_100 = 0, tot_bil = 0, mayor_denom = 0, tipo_bil = 0, ing_tip_bill = 0, ing_cant_bill = 0, tot_val_10 = 0, tot_val_20 = 0, tot_val_50 = 0, tot_val_100 = 0, total_recaudado = 0, cant_mayor_denom = 0;
		@SuppressWarnings("unused")
		double por_bil10 = 0 , por_bil20 = 0, por_bil50 = 0, por_bil100 = 0;
		int aux_tot_bil_10 = 0;
		int aux_tot_bil_20 = 0;
		int aux_tot_bil_50 = 0;
		int aux_tot_bil_100 = 0;
		
		input = new Scanner(System.in);
		ing_tip_bill = validarIngBillete(MSG_ING);
		while (ing_tip_bill != 0) {
			
			ing_cant_bill = validarIngreso("Ingrese la cantidad de billetes de " + ing_tip_bill  + " que quiere guardar");
			
			tot_bil += ing_cant_bill;
		
			// reset total por billete
			
			tot_bil_10 = 0;
			tot_bil_20 = 0;
			tot_bil_50 = 0;
			tot_bil_100 = 0;
			
			tot_bil_10 += acumTipoBillete(ing_tip_bill, ing_cant_bill, BIL_10);
			tot_bil_20 += acumTipoBillete(ing_tip_bill, ing_cant_bill, BIL_20);
			tot_bil_50 += acumTipoBillete(ing_tip_bill, ing_cant_bill, BIL_50);
			tot_bil_100 += acumTipoBillete(ing_tip_bill, ing_cant_bill, BIL_100);
		
			aux_tot_bil_10  += tot_bil_10;
			aux_tot_bil_20  += tot_bil_20;
			aux_tot_bil_50  += tot_bil_50;
			aux_tot_bil_100  += tot_bil_100;
			
			tot_val_10 += calcularTotal(tot_bil_10, BIL_10);
			tot_val_20 += calcularTotal(tot_bil_20, BIL_20);
			tot_val_50 += calcularTotal(tot_bil_50, BIL_50);
			tot_val_100 += calcularTotal(tot_bil_100, BIL_100);
			
			ing_tip_bill = validarIngBillete(MSG_ING);
		
		}
		
		cant_mayor_denom = obtenerMayor(obtenerMayor(aux_tot_bil_10, aux_tot_bil_20), obtenerMayor(aux_tot_bil_50,aux_tot_bil_100));
		mayor_denom = mayorDenominador(aux_tot_bil_10, aux_tot_bil_20, aux_tot_bil_50, aux_tot_bil_100);
		
		
		
		total_recaudado = tot_val_10 + tot_val_20 + tot_val_50 + tot_val_100;
		
		por_bil10 = ObtenerPorcentaje(aux_tot_bil_10, tot_bil);
		por_bil20 = ObtenerPorcentaje(aux_tot_bil_20, tot_bil);
		por_bil50 = ObtenerPorcentaje(aux_tot_bil_50, tot_bil);
		por_bil100 = ObtenerPorcentaje(aux_tot_bil_100, tot_bil);
		
		mostrarResults( total_recaudado,  por_bil10,  por_bil20, por_bil50,  por_bil100,  mayor_denom, cant_mayor_denom);
		input.close();
		
	}

}
