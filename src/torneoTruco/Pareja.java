package torneoTruco;

public class Pareja {

	private Jugador[] jugadores;
	private int par_jugados;

	public Pareja() {
		// TODO Auto-generated constructor stub
		this.jugadores = new Jugador[2];
		this.par_jugados = 0;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	public int getPar_jugados() {
		return par_jugados;
	}

	public void setPar_jugados(int par_jugados) {
		this.par_jugados = par_jugados;
	}

}
