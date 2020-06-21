package whileQueue;

import java.util.LinkedList;
import java.util.Queue;

public final class Test {

	private static Queue<Persona> cola = new LinkedList<Persona>();
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		Persona p1 = test.new Persona("Braulio");
		Persona p2 = test.new Persona("Josefo");
		Persona p3 = test.new Persona("Robertus");
		Persona p4 = test.new Persona("Josefus");
		
		Test.cola.add(p1);
		Test.cola.add(p2);
		Test.cola.add(p3);
		Test.cola.add(p4);
		
		recorrerCola(cola);
	}
	
	public static void recorrerCola(Queue<Persona> cola) {
		// Recorrer una cola con método Centinela
		Persona centinela = new Test().new Persona("-1");
		Persona aux = cola.poll();
		cola.add(centinela);
		while(!(centinela.getNombre().equals(aux.getNombre()))) {
			System.out.println(aux.getNombre());
			cola.add(aux);
			aux = cola.poll();
			
		}
		System.out.println("size de cola= " + cola.size());
	}

	
	public class Persona {
		private String nombre;
		
		Persona(String nombre){
			this.nombre = nombre;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
	}
}
