package ejercicioUnoyDos;

public class Vendedor extends Subcontratado {
	private float porcentaje;
	
	Vendedor(){
		super();
		this.porcentaje = 0.0f;
	}
	
	Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje){
		super(nombre, edad, cantHoras, precioHora);
		setPorcentaje(porcentaje);
	}
	
	public float calcularPago() {
		float result = super.calcularPago();
		if (getPorcentaje() > 0.0f || getPorcentaje() <= 100) {
			result = result + (result * getPorcentaje());
		} else {
			System.out.println("El vendedor no realizó ventas este mes o el porcentaje de comisión está mal cargado. Su porcentaje de comisión es " + getPorcentaje());
			
		}
		return result;
	}

	@Override
	public String toString() {
		return super.toString() + " porcentaje=" + porcentaje + ", cantHoras=" + cantHoras + ", precioHora=" + precioHora + "]";
	}

	public float getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		if(porcentaje < 0 || porcentaje > 100) {
			System.out.println("Por favor vuelva a ingresar un valor entre 0 y 100");
		} else {
			this.porcentaje = porcentaje / 100;	
		}
		
	}
	
	
	
}
