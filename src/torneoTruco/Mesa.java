package torneoTruco;

import java.util.Stack;

public class Mesa {

	private Identificador_mesa id;
	private Stack<Pareja> l_parejas;

	public Mesa(Identificador_mesa id) {
		this.id = id;
		this.l_parejas = new Stack<Pareja>();
		// TODO Auto-generated constructor stub
	}

	public Identificador_mesa getId() {
		return id;
	}

	public void setId(Identificador_mesa id) {
		this.id = id;
	}

	public Stack<Pareja> getL_parejas() {
		return l_parejas;
	}

	public void setL_parejas(Stack<Pareja> l_parejas) {
		this.l_parejas = l_parejas;
	}

}
