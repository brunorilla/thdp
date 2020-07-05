package guarderiaBarcos;

public interface Estacionamiento {
	public boolean estacionar(Embarcacion e);
	public Embarcacion retirar(String id);
	public int lugaresLibres();
}
