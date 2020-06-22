package recorrerPila;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage monroe = new Garage();
		String[] autos = {"Ford","Chevrolet","MB","VolksWagen","Audi","Fiat","Alfa Romeo","Subaru","Lada","Honda","Hyundai","SsangYong"};
		int index = 0;
		
		Auto aux;
		while(index < autos.length) {
			aux = new Auto(autos[index]);
			monroe.setLugares(aux);
			index++;
		}
		System.out.println("Tamaño pila de autos Monroe" + monroe.getLugares().size());
		monroe.recorrerAutos();
		System.out.println("Tamaño pila de autos Monroe" + monroe.getLugares().size());

		Auto encontrado = monroe.sacarAuto("MB");
		System.out.println("Tamaño pila de autos Monroe" + monroe.getLugares().size());
		System.out.println(encontrado.getMarca());
	}
	
	
	
	

}
