package datacenter;

public class EnvioAnalisis extends Actividad {
	private float tamanio;
	private String tipoVirus;

	public EnvioAnalisis(String fecha, String hora, char es, String desc, float tamanio, String tipoVirus) {

		super(fecha, hora, es, desc);
		this.tamanio = tamanio;
		this.tipoVirus = tipoVirus;
	}

	public float getTamanio() {
		return tamanio;
	}

	public String getTipoVirus() {
		return tipoVirus;
	}

	public void mostrar() {

		super.mostrar();
		System.out
				.println("El tamaño del virus es =[" + getTamanio() + "]  | y su tipo es = [ " + getTipoVirus() + " ]");
		;
	}

	@Override
	public String showTipo() {
		return "EnvioAnalisis";
	}
}