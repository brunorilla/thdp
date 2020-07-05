package datacenter;

public class Analisis extends Actividad {

	public enum Resultado {
		OK, INFECTADO
	};

	private Resultado resultAnalisis;

	public Analisis(String fecha, String hora, char es, String desc, Resultado resultAnalisis) {

		super(fecha, hora, es, desc);
		setResultAnalisis(resultAnalisis);
	}

	public Resultado getResultAnalisis() {
		return resultAnalisis;
	}

	public void setResultAnalisis(Resultado resultAnalisis) {
		this.resultAnalisis = resultAnalisis;
	}

	public void mostrar() {

		super.mostrar();
		System.out.println("El resultado del análisis es" + getResultAnalisis());
	}

	@Override
	public String showTipo() {
		return "Analisis";
	}
}
