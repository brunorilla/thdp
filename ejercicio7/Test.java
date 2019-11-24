package ejercicio7;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil bmw = new Automovil("BMW", "M3", "AB0934");
		bmw.setCantidadCombustible(20);
		bmw.setCapacidadTotalCombustible(40);
		bmw.setKmPorLitro(10);
		
		bmw.viajar(200);
		System.out.println(bmw.toString());
		bmw.cargarCombustible(11);
		
		System.out.println(bmw.toString());
		bmw.cargarCombustible(13);

		System.out.println(bmw.toString());
		bmw.viajar(23);
		System.out.println(bmw.toString());
		bmw.cargarCombustible(40);
		System.out.println(bmw.toString());
	}

} 
