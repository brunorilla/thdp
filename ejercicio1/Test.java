package ejercicio1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Bruno","Rilla","Libertador");
		Persona p2 = new Persona("Juan", "Carabargui", "Segurola y Habana");
		System.out.println(p1.toString());
		
		System.out.println(p1.getNombre());
		p1.getDireccion();
		p1.getApellido();
	}

}
