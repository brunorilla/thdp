package juegoMesa;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juego j = new Juego();
		Operacion o = new Operacion(4, TipoOp.ELIM, 3);
		j.mostrarCartasMazo(4);
		j.addOperacion(o);
		j.arrancarJuego();

		j.mostrarCartasMazo(4);
		
		
		
	}

}
