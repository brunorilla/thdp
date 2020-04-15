package ejercicioDos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juegos olim = new Juegos("Cabeza", 2020);
		Carrera car = new Carrera(Disciplina.C_100);
		Atleta atl = new Atleta("Braulio", 345939393);
		atl.setDisc(Disciplina.C_100);
		System.out.println(atl.getDisc());
		
		olim.anotarAtletaEnCarrera(atl, atl.getDisc());

	}

}
