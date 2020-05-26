package ejercicioUnoyDos;

public class Subcontratado extends Empleado {
	float cantHoras;
	float precioHora;
	public static final float HORA_LEGAL_JORNALIZADA = 84.37f;

	public Subcontratado() {
		super();
		this.cantHoras = 0.0f;
		this.precioHora = 0.0f;
	}

	public Subcontratado(String nombre, int edad, float cantHoras, float precioHora) {
		super(nombre, edad);
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}


	public float calcularPago() {
		float salario;
		if (!(getCantHoras() <= 0)) {
			if (getPrecioHora() < HORA_LEGAL_JORNALIZADA) {
				System.out.println(
						"Este empleado está en situación irregular. La hora de salario es menor al legal. Regularizar");
			}
			salario = getPrecioHora() * getCantHoras();

		} else {
			System.out.println("El empleado no tiene horas trabajadas este mes");
			salario = 0;
		}
		return salario;
	}

	public float getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(float cantHoras) {
		this.cantHoras = cantHoras;
	}

	public float getPrecioHora() {
		return precioHora;
	}

	public void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}
	
	@Override
	public String toString() {
		return super.toString() + " cantHoras=" + cantHoras + ", precioHora=" + precioHora + "]";
	}


}
