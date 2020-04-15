package ejercicioUno;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grupo cabeza = new Grupo();
		cabeza.agregarIntegrante("bruno");
		cabeza.agregarIntegrante("juan");
		System.out.println(cabeza.getCantidadIntegrantes());
		cabeza.obtenerIntegrante(1);
		cabeza.obtenerIntegrante(2);
		System.out.println(cabeza.buscarIntegrante("bruno"));
		cabeza.agregarIntegrante("Cholga");
		System.out.println(cabeza.getCantidadIntegrantes());
		cabeza.vaciar();
		System.out.println(cabeza.getCantidadIntegrantes());
		
	}

}
