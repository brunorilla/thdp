package datacenter;

public class Actualizacion extends Actividad {
	private String versionFirmaVirus;// actualizacion firma virus

	public Actualizacion(String fecha, String hora, char es, String desc, String versionFirmaVirus) {
		super(fecha, hora, es, desc);
		setVersionFirmaVirus(versionFirmaVirus);
	}

	public void setVersionFirmaVirus(String valor) {
		this.versionFirmaVirus = valor;
	}

	public String getVersionFirmaVirus() {
		return versionFirmaVirus;
	}

	public void mostrar() {

		super.mostrar();
		System.out.println("La version de la firma del virus es =[ " + getVersionFirmaVirus() + " ]");
	}

	@Override
	public String showTipo() {
		return "Actualizacion";
	}
}