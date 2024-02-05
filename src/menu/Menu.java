package menu;

import java.util.Scanner;

/**
 * Esta clase se utiliza para que el usuario introduzca numeros, operaciones y
 * para indicar si quiere seguir usando la calculadora.
 * 
 */
public class Menu {
	private static Scanner teclado = new Scanner(System.in);

	/**
	 * Pide al usuario que introduzca dos numeros por el teclado
	 * 
	 * @return Dos numeros introducidos por el usuario
	 */
	public int[] pedirNumeros() {
		int[] ret = new int[2];
		System.out.print("Operando 1: ");
		ret[0] = teclado.nextInt();
		System.out.print("Operando 2: ");
		ret[1] = teclado.nextInt();
		return ret;

	}
	

	/**
	 * Pide al usuario que introduzca por teclado la operacion a realizar
	 * 
	 * @return La operacion a realizar
	 */
	public String menuOpciones() {
		String ret = "";
		do {
			System.out.print("Operaciones [+, -, *, /, %]: ");
			ret = teclado.next();
		} while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) || (ret.equalsIgnoreCase("*"))
				|| (ret.equalsIgnoreCase("/")) || (ret.equalsIgnoreCase("%"))));
		return ret;
	}

	/**
	 * Pregunta al usuario si quiere hacer una operacion mas
	 * 
	 * @return Un boolean indicando si el usuario quiere seguir (true) o no (false)
	 */
	public boolean repetir() {
		boolean ret = false;
		String respuesta;
		do {
			System.out.print("�Desea continuar trabajando con la calculadora? [s / n]");
			respuesta = teclado.next();
		} while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))));

		if (respuesta.equalsIgnoreCase("s")) {
			ret = true;
		}
		return ret;
	}
}