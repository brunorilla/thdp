package guarderiaBarcos;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Guarderia barcos = new Guarderia();
			Embarcacion e = new Embarcacion("jj");
			System.out.println(barcos.estacionar(e));
		
		System.out.println();

		
		System.out.println(barcos.lugaresLibres());
		System.out.println(barcos.toString());
	}

}
