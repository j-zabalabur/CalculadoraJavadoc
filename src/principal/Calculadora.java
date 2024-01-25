package principal;
import java.util.logging.Level;
import java.util.logging.Logger;

import menu.Menu;
import operaciones.Operaciones;
/**
 * Esta es la clase principal que une todas las demas clases
 * Hace llamadas a la clase Menu para que el usuario introduzca numeros y la operacion a realizar.
 * Tambien llama a la clase Operaciones, donde se efectuan las operaciones matematicas.
 */
public class Calculadora{
	private static final Logger LOGGER = Logger.getLogger("Nombre del logger");
    public static void main(String[] args) {   
        LOGGER.setLevel(Level.ALL);

        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            
            if (operacion.equalsIgnoreCase("+")){
                resultado = operaciones.sumar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
                LOGGER.log(Level.INFO,"Se ha hecho una suma");
            } else if (operacion.equalsIgnoreCase("-")){
                resultado = operaciones.restar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("*")){
                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("/")){
                resultado = operaciones.dividir(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("%")){
                resultado = operaciones.resto(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
            } else {
                System.out.println ("Operaci�n no v�lida");
            }
        }   while (menu.repetir());
    }
}