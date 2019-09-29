	package bucles;
	
	import java.util.Scanner;
	
	public class EjercicioSiete {
		private static Scanner input;
	
		public static String pedirDato(String mensaje) {
			System.out.println("Ingrese su " + mensaje);
			String dato = input.nextLine();
			return dato;
		}
	
		public static boolean validar(String nombre, String pass) {
			String ingreso_nombre;
			String ingreso_pass;
			
			ingreso_nombre = input.nextLine();
			ingreso_pass = input.nextLine();
			
			if (ingreso_nombre.equals(nombre) && ingreso_pass.equals(pass)) {
				return true;
			} else {
				System.out.println("Ingreso inv�lido. Intente nuevamente");
				return false;
			}
		}
	
		public static boolean chequearDatos(String nombre, String pass) {
			int counter = 1;
			boolean isValid = validar(nombre, pass);
			while (!isValid && counter < 3) {
				counter++;
				isValid = validar(nombre, pass);
			}
			return isValid;
		}
	
		public static void main(String[] args) {

			input = new Scanner(System.in);
	
			String nombre;
			String pass;
	
			System.out.println("Por favor genere su usuario y contrase�a");
	
	
			nombre = pedirDato("nombre de usuario");
			pass = pedirDato("Password");
			
			System.out.println("Inicio de sesi�n \n Ingrese su nombre de usuario y contrase�a");
			boolean respuesta = chequearDatos(nombre, pass);
	
			if (!respuesta) {
				System.out.println("USUARIO BLOQUEADO");
			} else {
				System.out.println("INGRESO EXITOSO");
			}
	
	
	
			input.close();
		}
	
	}
