package ejercicio3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superheroe superHeroe1 = new Superheroe("Batman", 97, 80, 0);
		Superheroe superHeroe2 = new Superheroe("Superman", 95, 60, 70);
		
		String juego = superHeroe1.jugar(superHeroe2);
		System.out.println(juego);
	}

}
