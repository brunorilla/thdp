package ejercicio2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TarjetaDeCredito p1 = new TarjetaDeCredito("4145414122221111", "Juan Pérez", 10000);
		System.out.println(p1.getNumero());
		System.out.println(p1.realizarCompra(4000));
		// System.out.println(p1.realizarCompra(2000)); 
		System.out.println(p1.toString());
		p1.actualizarLimite(3000);
		System.out.println(p1.toString());
	}

}
