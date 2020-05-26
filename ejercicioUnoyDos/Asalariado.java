package ejercicioUnoyDos;

public class Asalariado extends Empleado {
	float sueldo;
	public final static float SALARIO_MINIMO_OBLIGATORIO = 16.875f;
	
	Asalariado(){
		super();
		this.sueldo = 0.0f;
		
	}
	
	Asalariado(String nombre, int edad, float sueldo){
		super(nombre, edad);
		this.sueldo = sueldo;
		
	}

	@Override
	public String toString() {
		return super.toString() + "Asalariado [sueldo=" + sueldo + "]";
	}

	public float calcularPago() {
		
		if(getSueldo() < SALARIO_MINIMO_OBLIGATORIO) {
			System.out.println("El sueldo es menor al SMVO, regularizar la situación del empleado.");
			return getSueldo();
		}
		
		return getSueldo();
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	
	
	
}
