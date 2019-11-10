package ejercicio2;

public class TarjetaDeCredito {
	private String numero;
	private String titular;
	private double limiteDeCompra;
	private double disponible;
	
	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
		super();
		this.setNumero(numero);
		this.setTitular(titular);;
		this.setLimiteDeCompra(limiteDeCompra);
		this.disponible = this.getLimiteDeCompra();
	}

	private Boolean puedoComprar(double monto) {
		boolean answer = true;
		if(monto > this.limiteDeCompra || monto > this.disponible) {
			answer = false;
		}
		return answer;
	}
	
	public Boolean realizarCompra(double monto) {
		boolean exito;
		double disponible;
		exito = this.puedoComprar(monto);
		if(exito) {
			disponible = this.getDisponible();
			disponible = disponible - monto;
			this.setDisponible(disponible);
		}
		return exito;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}
	public void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}
	public double getDisponible() {
		return disponible;
	}
	public void setDisponible(double disponible) {
		this.disponible = disponible;
	}
	public void actualizarLimite(double nuevoLim){
		double actualLim = this.getLimiteDeCompra();
		double actualDis = this.getDisponible();
		double auxDisponible;
			if (nuevoLim < actualLim) {
				auxDisponible = nuevoLim - (actualLim - actualDis);
				if (auxDisponible < 0) {
					auxDisponible = 0;
				}
				this.setDisponible(auxDisponible);
				this.setLimiteDeCompra(nuevoLim);
			}
			
	}
	
	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + this.numero + ", titular=" + this.titular + ", limiteDeCompra=" + this.limiteDeCompra
				+ ", disponible=" + this.disponible + "]";
	}
	
}
