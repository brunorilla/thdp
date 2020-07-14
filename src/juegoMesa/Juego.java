package juegoMesa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public final class Juego {

	private Mazo[] mazos;
	private Queue<Operacion> operaciones;
	private static final int CANT_MAZOS = 4;
	private static final int NUM_MAX_ELIM = 3;

	public Juego() {
		// TODO Auto-generated constructor stub
		setMazos(generarMazos());
		this.operaciones = new LinkedList<Operacion>();
	}

	private final class Mazo {
		private Stack<Carta> cartas;

		Mazo() {
			setCartas();

		}

		public Stack<Carta> getCartas() {
			return cartas;
		}

		public void setCartas() {
			cartas = generarCartas();
		}

		public Stack<Carta> generarCartas() {
			Stack<Carta> cartas = new Stack<Carta>();
			int index = 0;
			Carta aux;
			while (index < 26) {
				aux = new Carta();
				cartas.push(aux);
				index++;
			}
			return cartas;

		}

		public Carta getCarta() {
			Carta ret = null;
			if (!getCartas().isEmpty()) {
				ret = getCartas().pop();
			} else {
				System.out.println("No hay más cartas en el mazo");
			}
			return ret;

		}

		public void meterCarta(Carta c) {
			getCartas().push(c);
		}

		public void mostrarCartas() {
			Stack<Carta> pila_aux = new Stack<Carta>();
			Carta c;
			while (!getCartas().isEmpty()) {
				c = getCartas().pop();
				System.out.println("Letra: " + c.getLetra());
				pila_aux.push(c);
			}
			while (!pila_aux.isEmpty()) {
				getCartas().push((pila_aux.pop()));
			}
		}

		private final class Carta {

			private char letra;

			Carta() {
				Random rnd = new Random();
				char c = (char) ('a' + rnd.nextInt(26));
				setLetra(c);

			}

			public char getLetra() {
				return letra;
			}

			public void setLetra(char letra) {
				this.letra = letra;
			}

		}

	}

	public Mazo[] generarMazos() {
		Mazo[] mazos = new Mazo[CANT_MAZOS];
		Mazo aux;
		for (int i = 0; i < CANT_MAZOS; i++) {
			aux = new Mazo();
			mazos[i] = aux;
			System.out.println("Creando mazo: " + i);
		}
		return mazos;
	}

	/* OPERACIONES */

	// ELIMINAR
	public boolean eliminarNcartas(int cant, int mazo) {
		boolean success = false;
		if (cant <= NUM_MAX_ELIM && cant > 0) {
			if (!getMazo(mazo).getCartas().isEmpty()) {
				int counter = 1;
				while (counter <= cant && !getMazo(mazo).getCartas().isEmpty()) {
					getMazo(mazo).getCartas().pop();
					counter++;
				}
				success = true;
			} else {
				System.out.println("No hay cartas en el mazo.");
			}
		} else {
			System.out.println("No se pueden eliminar más de 3 cartas.");
		}
		return success;
	}

	// MOVER
	public int mover(int cant, int mazo, TipoOp opTipoOp) {
		int cartasMovidas = 0;
		// Repito la cantidad de veces que quiero realizar la operación:
		for (int i = 1; i <= cant; i++) {
			// Obtengo la carta que quiero mover
			juegoMesa.Juego.Mazo.Carta c = getMazo(mazo).getCarta();

			int target = 0;
			// ¿mover a izquierda o derecha?:
			if (opTipoOp == TipoOp.DER) {
				target = derecha(mazo);
			} else if (opTipoOp == TipoOp.IZQ) {
				target = izquierda(mazo);
			}

			// Muevo la carta
			if (target > -1) {
				getMazo(target).meterCarta(c);
				cartasMovidas++;
			} else {
				System.out.println("Operación cancelada");
			}
		}
		return cartasMovidas;

	}

	// MOVER A LA IZQUIERDA
	public int izquierda(int mazo) {
		if (mazo > 0 && mazo <= 4) {
			if (mazo == 1) {
				mazo = 4;
			} else {
				mazo = mazo - 1;
			}
		} else {
			System.out.println("No existe ese mazo. Operación inválida");
			mazo = -1;
		}
		return mazo;
	}

	// MOVER A LA DERECHA
	public int derecha(int mazo) {
		if (mazo == 4) {
			mazo = 1;
		} else {
			mazo = mazo + 1;
		}
		return mazo;
	}

	// GET MAZO
	public Mazo getMazo(int num_mazo) {
		Mazo ret = null;
		if (num_mazo <= CANT_MAZOS && num_mazo > 0) {
			ret = getMazos()[num_mazo - 1];
		} else {
			System.out.println("No existe ese número de mazo");

		}
		return ret;

	}

	// AÑADIR UNA OPERACIÓN
	public void addOperacion(Operacion op) {
		getOperaciones().add(op);
	}

	// EJECUTAR OPERACION

	public boolean ejecutarOp(Operacion op) {
		boolean result = false;

		if (op.getTipo() == TipoOp.DER || op.getTipo() == TipoOp.IZQ) {
			int movidos = mover(op.getCant(), op.getNum(), op.getTipo());
			if (movidos > 0) {
				System.out.println("Cartas movidas = " + movidos);
				result = true;
			}

		} else if (op.getTipo() == TipoOp.ELIM) {
			result = eliminarNcartas(op.getCant(), op.getNum());
		}

		return result;
	}

	public void arrancarJuego() {
		// CICLO DE OBTENER OPERACIONES Y EJECUTARLAS
		boolean ejecutadoOK = true;

		while (!getOperaciones().isEmpty() && ejecutadoOK) {
			ejecutadoOK = ejecutarOp(getOperaciones().poll());
		}

	}

	// Mostrar cartas de Mazo

	public void mostrarCartasMazo(int num) {
		System.out.println("Mazo " + num );
		getMazo(num).mostrarCartas();
	}

	public Queue<Operacion> getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(Queue<Operacion> operaciones) {
		this.operaciones = operaciones;
	}

	public Mazo[] getMazos() {
		return mazos;
	}

	public void setMazos(Mazo[] mazos) {
		this.mazos = mazos;
	}

	public static int getCantMazos() {
		return CANT_MAZOS;
	}

}
