package agenciaAutos;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agencia branaAutos = new Agencia(10, 5, 200);

		for (int i = 0; i < 200; i++) {
			Auto aux = new Auto(i * 10000f);
			branaAutos.agregarAuto(aux);
		}

		/*
		 * Auto auto1 = new Auto(80000); System.out.println(auto1.toString());
		 * branaAutos.agregarAuto(auto1);
		  
		  for(int i = 0; i < branaAutos.getVecAutos().length; i++) {
		  branaAutos.calcularPrecioFinal(branaAutos.getVecAutos()[i]); }
		 */

		branaAutos.generarTotVtas();
		branaAutos.mostrarTotVtas();
	}

}
