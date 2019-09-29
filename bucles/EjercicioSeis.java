package bucles;

import java.util.Scanner;

public class EjercicioSeis {
	private static Scanner lector;

	
	public static void returnMsg(String valor) {
		System.out.println("Ingrese el " + valor + " del alumno \n");
	}
	
	public static void main(String[] args) {
		String name_stdnt;
		double avg_stdnt = 0;
		int entries_counter = 0;
		double avg_max = 0;
		String name_maxavg = null;
		
		
		lector = new Scanner(System.in);
		
		/* while(entries_counter < 10) */ 
		for (int i = 0; i < 10; i++) {
			returnMsg("nombre");
			name_stdnt = lector.nextLine();
			returnMsg("promedio");
			avg_stdnt = lector.nextInt();
			lector.nextLine();
			
			if (avg_stdnt > avg_max) {
				avg_max = avg_stdnt;
				name_maxavg = name_stdnt;
			}
		}

		System.out.println("El mayor promedio es el de " + name_maxavg + "\n" +
									"El promedio de " + name_maxavg + " es " + avg_max);
		
		lector.close();
	}
}
