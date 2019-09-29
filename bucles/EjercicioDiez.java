package bucles;

import java.util.Scanner;

public class EjercicioDiez {

	private static Scanner input;
	
	public static int devolverSegundos(int hours, int mins, int secs) {
		int seconds = 0;
		int aux_hours = hours * 3600;
		int aux_mins = mins * 60;

		seconds  = aux_hours + aux_mins + secs;
		return seconds;

	}
	
	public static boolean masRapido(int fastest_secs, int actual_secs) {
		boolean valid = false;
		if (actual_secs > fastest_secs) {
			valid = true;
		}
		return valid;
	}
	
	public static int validarTiempo( String msg) {
		int num;
		do {
			Mostrar("Ingrese" + msg + " que tardó el corredor");
			num = input.nextInt();
		} 	while (num > 60);
		
		return num;
	}
	
	public static int inTiempoRunner() {
		int tiempoRunner;
		int horas;
		int minutos;
		int segundos;
		

		horas = validarTiempo(" las horas");
		minutos = validarTiempo(" los minutos");
		segundos = validarTiempo(" los segundos");
		tiempoRunner = devolverSegundos(horas,minutos,segundos);
		
		return tiempoRunner;
		
	}
	
	public static boolean masDeUnaHora(int actual_secs) {
		boolean valid = false;
		if (actual_secs > 3600) {
			valid = true;
		}
		return valid;
	}
	
	public static double getProm(int num, int div) {
		double prom = num / div;
		return prom;
	}
	
	public static double getPercent(int total, int num) {
		double percent;
		percent = (num * 100) / total;
		return percent;
	}
	
	public static void Mostrar(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static void MostrarDatos(int num, int secs, double prom, double percent ) {
		Mostrar("El corredor más rapido es " + num + "\n" +
				"Con un tiempo de " + secs + "\n" 
				+ "El promedio de tiempo de todos los corredores es " + prom + "\n"
				+ "El porcentaje de corredores que demoraron más de una hora es " + percent + "%");
	}
	
	public static void main(String[] args) {
		
		int runner;
		int fastest_num = 0;
		int fastest_secs = 0;
		int actual_num = 0;
		int actual_secs = 0;
		int counter_runners = 0;
		int counter_mas_hora = 0;
		int total_secs = 0;
		double prom_runners = 0;
		double prom_mas_hora = 0;

		
		
		// TODO Auto-generated method stub
		
		input = new Scanner(System.in);
		
		// INICIO
		
		Mostrar("Ingrese el número de corredor o 0 para terminar el programa");
		runner = input.nextInt();
		if(runner == 0) {
			System.out.println("Programa terminado");
			System.exit(1);
		}
		while (runner > 0) {
			counter_runners ++;
			actual_secs = inTiempoRunner();
			total_secs = total_secs + actual_secs;
			if (masRapido(fastest_secs, actual_secs)) {
				fastest_secs = actual_secs;
				fastest_num = runner;
			}
			if (masDeUnaHora(actual_secs)) {
				counter_mas_hora ++;
			}
			Mostrar("Ingrese el siguiente corredor o 0 para terminar el programa");
			runner = input.nextInt();
		}
		input.close();	
		prom_runners = getProm(total_secs, counter_runners);
		
		prom_mas_hora = getPercent(counter_runners, counter_mas_hora);
		
		MostrarDatos(fastest_num, fastest_secs, prom_runners, prom_mas_hora);
	}

}
