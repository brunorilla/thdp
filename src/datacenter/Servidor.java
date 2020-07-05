package datacenter;

public class Servidor {
	private int numero;
	private String SO;
	private Cola<Actividad> actividades;
	private Pila<Actividad> actualizaciones;

	public Servidor(int numero, String SO) {

		setNumero(numero);
		setSO(SO);
		actividades = new Cola<Actividad>();
		actualizaciones = new Pila<Actividad>();
	}

	public int getNumero() {
		return numero;
	}

	@SuppressWarnings("unused")
	public void setSO(String SO) {
		if (SO.isEmpty() || SO.equals("")) {
			throw new IllegalArgumentException("Ingrese un nombre válido para el SO");
		} else if (SO == null) {
			throw new NullPointerException();
		}
		this.SO = SO;
	}

	public void setNumero(int numero) {
		if (numero < 0 || numero > 1000) {
			throw new IllegalArgumentException("El numero del Sistema Operativo no puede ser menor a 0 o mayor a 1000");
		}
		this.numero = numero;
	}

	public String getSO() {
		return SO;
	}

	public void agregarActividad(Actividad act) {
		actividades.add(act);
		if (act instanceof Actualizacion)
			actualizaciones.push(act);
	}

	// 5 - Mostrar todas las Actividades para cada servidor
	public void mostrarActividad() {
		// TODO - Completar
		Actualizacion centinela = new Actualizacion("-1", "-1", '@', "-1", "-1");
		Actividad aux = getActividades().pool();
		getActividades().add(centinela);
		while (aux.getE_S() != centinela.getE_S()) {
			if (aux instanceof Actualizacion) {
				((Actualizacion) aux).mostrar();
			}
			if (aux instanceof Analisis) {
				((Analisis) aux).mostrar();
			}

			if (aux instanceof EnvioAnalisis) {
				((EnvioAnalisis) aux).mostrar();
			}

			getActividades().add(aux);
			aux = getActividades().pool();
		}

	}

	public void mostrarActualizaciones3(int n) {

		System.out.println("Ultimas " + n + "actualizaciones del servidor");
		int counter = 1;
		Actividad aux;
		Pila<Actividad> auxiliar = new Pila<Actividad>();
		while (counter <= n && !getActualizaciones().isEmpty()) {
			aux = getActualizaciones().pop();
			if (aux instanceof Actualizacion) {
				((Actualizacion) aux).mostrar();

			}
			if (aux instanceof Analisis) {
				((Analisis) aux).mostrar();

			}
			if (aux instanceof EnvioAnalisis) {
				((EnvioAnalisis) aux).mostrar();
			}
			counter++;
		}
		while (!auxiliar.isEmpty()) {
			aux = auxiliar.pop();
			getActualizaciones().push(aux);
		}

	}

	public void correrEstadistica1() {

		Actualizacion centinela = new Actualizacion("-1", "-1", '@', "-1", "-1");
		Actividad aux = getActividades().pool();
		getActividades().add(centinela);
		while (aux.getE_S() != centinela.getE_S()) {
			if (aux instanceof EnvioAnalisis) {
				System.out.println("Nombre: ");
				System.out.println(aux.getClass().getSimpleName());
				System.out.println("El tipo del virus es:");
				System.out.println(((EnvioAnalisis) aux).getTipoVirus());
				System.out.println("El tamaño del virus es:");
				System.out.println(((EnvioAnalisis) aux).getTamanio());
			}
			getActividades().add(aux);
			aux = getActividades().pool();
		}

	}

	@Override
	public String toString() {
		return "Servidor:" + numero + ", S.O. " + SO;
	}

	public Cola<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(Cola<Actividad> actividades) {
		this.actividades = actividades;
	}

	public Pila<Actividad> getActualizaciones() {
		return actualizaciones;
	}

	public void setActualizaciones(Pila<Actividad> actualizaciones) {
		this.actualizaciones = actualizaciones;
	}

}