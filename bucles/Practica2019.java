package bucles;

import java.util.Scanner;

public class Practica2019 {
	
	private static Scanner input;

	public static final String MSG_NONE = "No se ha ingresado ninguna venta.";
	public static final String MSG_ERROR = "Formato no válido. Ingrese nuevamente";
	
	public static final String NOM_CIUDAD = "Boleta Ciudad";
	public static final int TIP_CIUDAD = 1;
	public static final int MIN_CIUDAD = 50;
	public static final int MAX_CIUDAD = 120;
	
	public static final String NOM_PROV = "Boleta Provincia";
	public static final int TIP_PROV = 2;
	public static final int MIN_PROV = 50;
	public static final int MAX_PROV = 160;;

	public static final char S = 's';
	public static final char N = 'n';

	
	public static char validarChar( char a_validar, char b_validar) {
		char valor;
		
		valor = input.next().charAt(0);
		while(valor != a_validar && valor != b_validar) {
			mostrar(MSG_ERROR);
			valor = input.next().charAt(0);
		}
		return valor;
	}
	
	public static int validar2Int( int a_validar, int b_validar) {
		int valor;		
		valor = input.nextInt();
		while(valor != a_validar && valor != b_validar) {
			mostrar(MSG_ERROR);
			valor = input.nextInt();
		}
		return valor;
	}
	
	public static int validarMinMax( int min, int max) {
		int valor;		
		valor = input.nextInt();
		while(valor < min ||  valor > max) {
			mostrar(MSG_ERROR);
			valor = input.nextInt();
		}
		return valor;
	}
	
	public static void mostrar(String msg) {
		System.out.println(msg);
	}
	
	public static int validarMonto(int tipo_bol) {
		int monto = 0;
		switch(tipo_bol) {
			case 1:
				mostrar("Ingrese el monto, mayor a " + MIN_CIUDAD + " y menor a " + MAX_CIUDAD);
				monto = validarMinMax(MIN_CIUDAD, MAX_CIUDAD);
				break;
			case 2:
				mostrar("Ingrese el monto, mayor a " + MIN_PROV + " y menor a " + MAX_PROV);
				monto = validarMinMax(MIN_PROV, MAX_PROV);
				break;
		}
		return monto;
	}
	
	public static int sumarTipoBol(int tipo_bol, int comparador) {
		int count = 0;
		if(tipo_bol == comparador) {
			count ++;
		}
		
		return count;
		
	}
	
	public static int sumarMontoTipBol(int tipo_bol, int monto, int comparador ) {
		int aux  = 0;
		if(tipo_bol == comparador) {
			aux = monto;
		}
		
		return aux;
		
	}
	
	public static double obtenerPromedio(int numerador, int divisor){
		int aux = 0;
		aux = numerador/divisor;
		return aux;
	}
	
	
	public static int validarInt(String msg) {
		int number;
		mostrar(msg);
		number = input.nextInt();
		while(number < 0) {
			mostrar(MSG_ERROR);
			number = input.nextInt();
		}
		return number;
	};
	
	public static int guardarMayor(int nuevo, int mayor) {
		if(nuevo > mayor) {
			mayor = nuevo;
		}
		return mayor;
	}
	
	public static boolean flagMayor(int nuevo, int mayor) {
		boolean flag = false;
		if (nuevo > mayor) {
			flag = true;
		}
		return flag;
	}
	
	public static int guardarMayorTipo(boolean flag, int tip_bol, int mayor_actual) {
		int mayor;
		if(flag) {
			mayor = tip_bol;
		} else {
			mayor = mayor_actual;
		}
		return mayor;
	}
	
	public static void mostrarResults(int cantidad_tipo_1, int cantidad_tipo_2, int total_recaudado, int promedio_monto_bol_1, int tipo_boleta_mayor, int monto_boleta_mayor, int counter_ventas) {
		@SuppressWarnings("unused")
			String boleta_mayor = null;
			if (counter_ventas > 0) {

			switch (tipo_boleta_mayor) {
				case 1:
						boleta_mayor = NOM_CIUDAD;
						break;
				case 2:
						boleta_mayor = NOM_PROV;
						break;
			}
			mostrar("+´+´+ COMPROBANTE DE FACTURACIÓN+´+´+´+" + "\n"
							+ "\t" + "TOTAL RECAUDADO: $" + total_recaudado + "\n"
							+ "\t" + "CANTIDAD DE " + NOM_CIUDAD + " "+ cantidad_tipo_1 + "\n"
							+ "\t" + "CANTIDAD DE " + NOM_PROV +" " + cantidad_tipo_2 + "\n"
							+ "\t" + "Boleta vendida con mayor monto: tipo  " + tipo_boleta_mayor  +" Nombre: " + boleta_mayor + "\n"
							+ "\t" + "Monto de la mayor boleta vendida: $" + monto_boleta_mayor + "\n"
							+ "\t" + "Promedio del monto obtenido por boletas tipo 1: $" + promedio_monto_bol_1
					);
			} else {
				mostrar("No se ha realizado ninguna venta");
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		int dni, tip_bol, tot_rec = 0, prom_tot_bol1 = 0, mayor_monto= 0, mayor_tip_bol = 0, tot_bol = 0, tot_bol1 = 0, tot_bol2 = 0, monto, counter_ventas = 0, mon_bol_tip1 = 0, mon_bol_tip2 = 0;
		boolean mayor;
			input = new Scanner(System.in);
			
			mostrar("¿Desea cargar una venta? 's' para cargar, 'n' para salir");
			char valor = validarChar(S, N);
			while(valor == S) {
				counter_ventas ++;
				// ingreso DNI
				dni = validarInt("Ingrese su número de DNI");
				// Ingreso tipo de boleta
				mostrar("Ingrese el tipo de boleta");
				tip_bol = validar2Int(TIP_CIUDAD,TIP_PROV);
				// Ingreso del monto de la boleta
				monto = validarMonto(tip_bol);
				// Guardar mayores
				mayor = flagMayor(monto, mayor_monto);
				mayor_tip_bol = guardarMayorTipo(mayor, tip_bol, mayor_tip_bol);
				
				mayor_monto = guardarMayor(monto, mayor_monto);
				
				tot_rec += monto;
				
				
				tot_bol++;
				tot_bol1 += sumarTipoBol(tip_bol, 1);
				mon_bol_tip1 += sumarMontoTipBol(tip_bol, monto, 1);
				mon_bol_tip2 += sumarMontoTipBol(tip_bol, monto, 2);
				tot_bol2 += sumarTipoBol(tip_bol, 2);
				
				prom_tot_bol1 = (int) obtenerPromedio(mon_bol_tip1, tot_bol1);
				mostrar("¿Desea cargar una nueva venta?");
				valor = validarChar(S,N);
			}
			mostrarResults(tot_bol1, tot_bol2, tot_rec, prom_tot_bol1, mayor_tip_bol, mayor_monto, counter_ventas);
			
			input.close();
	}

}
