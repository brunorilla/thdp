package bucles;

import java.util.Scanner;

public class EjercicioDoce {

	private static Scanner input;
	public static final char SUM_OP = '+';
	public static final String SUM_W = "SUMAR";

	public static final char SUB_OP = '-';
	public static final String SUB_W = "RESTAR";

	
	public static final char MUL_OP = '*';
	public static final String MUL_W = "MULTIPLICAR";

	public static final char DIV_OP = '/';
	public static final String DIV_W = "DIVIDIR";

	public static final char MOD_OP = '%';
	public static final String MOD_W = "RESTO";

	public static final char END_OP = 'f';
	public static final String END_W = "finalizar";

	public static final String END_MSG = "Chau chinwenwencha";
	
	public static final String MSG_ERROR = "Formato de datos ingresado incorrecto. Por favor ingrese nuevamente.";

	public static final String MSG_NUM = "Ingrese un número entero";

	
	public static final String MSG_OP = "Ingrese el tipo de operación que desea realizar  \n" +
															SUM_OP + " para " + SUM_W + "\n" +
															SUB_OP + " para " + SUB_W + "\n" +
															MUL_OP + " para "  + MUL_W + "\n" +
															DIV_OP + " para "  + DIV_W + "\n" +
															MOD_OP + " para  obtener el "  + MOD_W + "\n" +
															END_OP + " para "  + END_W + "\n";
	
	public static final String MSG_OP2 = "Ingrese operador para nuevo cálculo o " + END_OP + " para finalizar";
	
	public final static String MSG_ERROR_DIV = "No se puede dividir por cero";

	
	
	public static void mostrar(String msg) {
		System.out.println(msg);
	}
	public static char ingresoOperador(String msg, boolean first) {
		char op;
		if(first) {
			mostrar(MSG_OP);
		} else {
			mostrar(MSG_OP2);
		}		
		op = input.next().charAt(0);
		while ( !(op == MUL_OP || op == DIV_OP || op == MOD_OP || op == SUM_OP || op == END_OP || op == SUB_OP  )) {
			mostrar(MSG_ERROR);
			op = input.next().charAt(0);
		}
		
		return op;
	}
	
	public static int ingresoNum() {
		int num;
		
		mostrar(MSG_NUM);
		num = input.nextInt();
		while(num != (int)num) {
			mostrar(MSG_ERROR);
			num = input.nextInt();
		}
		return num;
	}
	
	public static int realizarOperacion(char op) {
		int result, num1, num2;

		num1 = ingresoNum();
		num2 = ingresoNum();
		
		result= calcular(num1,num2,op);
		
		return result;
	}
	
	public static int calcular(int num1, int num2, char op) {
		int result = 0;
		switch (op) {
		case '+':
			result = sum(num1, num2);
			break;
		case '-':
			result = sub(num1, num2);
			break;
		case '*':
			result = multiply(num1, num2);
			break;
		case '/':
			result = (int) divide(num1, num2);
			break;
		case '%':
			result = (int) mod(num1, num2);
			break;
		}
		return result;
	}
	
	public static int multiply(int num1, int num2) {
		int result;
		result = num1*num2;
		return result;
	}
	
	public static double divide(int num1, int num2) {
		int result;
		if(esCero(num2)) {
			
			System.exit(0);
			
		}
		result = num1/num2;
		return result;
	}
	
	public static int sum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}

	public static int sub(int num1, int num2) {
		int result;
		result = num1 - num2;
		return result;
	}
	
	public static int rest(int num1, int num2) {
		int result;
		result = num1 % num2;
		return result;
	}
	
	public static int mod(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	public static boolean esCero(int num2) {
		if(num2 == 0) {
			mostrar("No se puede dividir por cero");
			return true;
		}
		return false;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input = new Scanner(System.in);
			int result;
			char op;
			boolean first = true;
			op = ingresoOperador(MSG_OP, first);
			while(op != END_OP) {
				first = false;
				result = realizarOperacion(op);
				mostrar("resultado " + result);
				op = ingresoOperador(MSG_OP2, first);
			}
			mostrar(END_MSG);
			input.close();
	}

}
