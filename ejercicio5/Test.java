package ejercicio5;


public class Test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hotel hilton = new Hotel("Hilton", "CABA", 200, 15);
		
		
		System.out.println("Ocupar 18 habitaciones | chequear que no se pueda realizar dicha acción.");
		
		hilton.ocuparHabitaciones(18);
		  
		System.out.println(hilton.toString());
		
		System.out.println("ocupar 3 + habitaciones | chequear que resten 12 habitaciones disponibles. ");
		
		hilton.ocuparHabitaciones(3);
			
		System.out.println(hilton.toString());
		
		System.out.println("desocupar 10 habitaciones | chequear que resten 22 habitaciones disponibles.");
		
		hilton.desocuparHabitaciones(10);
		
		System.out.println(hilton.toString());
		
	}

}
