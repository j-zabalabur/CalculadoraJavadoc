package operaciones;

/**
 * En esta clase se realizan las operaciones matematicas
 */
public class Operaciones {
	/**
	 * Realiza una suma con los dos valores recibidos
	 * 
	 * @param valor1 Numero introducido en Menu.pedirNumeros por el usuario
	 * @param valor2 Numero introducido en Menu.pedirNumeros por el usuario
	 * @return La suma de ambos valores
	 */
	public int sumar(int valor1, int valor2) {
		int numero;
		numero = valor1 + valor2;
		return numero;
	}

	/**
	 * Realiza una resta con los dos valores recibidos
	 * 
	 * @param valor1 Numero introducido en Menu.pedirNumeros por el usuario
	 * @param valor2 Numero introducido en Menu.pedirNumeros por el usuario
	 * @return El resultado de restar (valor1-valor2)
	 */
	public int restar(int valor1, int valor2) {
		int numero;
		numero = valor1 - valor2;
		return numero;
	}

	/**
	 * Realiza una multiplicacion con los dos valores recibidos
	 * 
	 * @param valor1 Numero introducido en Menu.pedirNumeros por el usuario
	 * @param valor2 Numero introducido en Menu.pedirNumeros por el usuario
	 * @return El resultado de multiplicar ambos valores
	 */
	public int multiplicar(int valor1, int valor2) {
		int numero;
		numero = valor1 * valor2;
		return numero;
	}

	/**
	 * Realiza una division con los dos valores recibidos
	 * 
	 * @param valor1 Numero introducido en Menu.pedirNumeros por el usuario
	 * @param valor2 Numero introducido en Menu.pedirNumeros por el usuario
	 * @return El resultado de dividir (valor1/valor2)
	 */
	public int dividir(int valor1, int valor2) {
		int numero;
		numero = valor1 / valor2;
		return numero;
	}

	/**
	 * Calcula el resto usando los dos valores recibidos
	 * 
	 * @param valor1 Numero introducido en Menu.pedirNumeros por el usuario
	 * @param valor2 Numero introducido en Menu.pedirNumeros por el usuario
	 * @return El resultado del resto (valor1%valor2)
	 */
	public int resto(int valor1, int valor2) {
		int numero;
		numero = valor1 % valor2;
		return numero;
	}
}