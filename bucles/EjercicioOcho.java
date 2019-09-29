package bucles;

public class EjercicioOcho {

	public static Boolean esMultiplo(int num1, int num2) {
		double result = num1 % num2;
		if (result == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("5 es múltiplo de 3? " + esMultiplo(5,3) );
		System.out.println("15 es múltiplo de 5? " + esMultiplo(15,5) );
	}

}
