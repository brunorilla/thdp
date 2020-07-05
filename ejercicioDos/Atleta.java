package ejercicioDos;


public class Atleta {
	private String nombre;
	private int dni;
	private double tiempo;
	private Disciplina disc;

	
	
	Atleta(int dni){
		this.nombre = "sin nombre";
		this.tiempo = 99999;
		this.dni = dni;
	}
	
	Atleta(String nombre, int dni){
		this.nombre = nombre;
		this.tiempo = 99999;
		this.dni = dni;
	}
	
	Atleta(String nombre, double tiempo, int dni){
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public Disciplina getDisc() {
		return disc;
	}

	public void setDisc(Disciplina disc) {
		this.disc = disc;
	}
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public void solicitarInscripcion() {
		
	}
	


	
}
