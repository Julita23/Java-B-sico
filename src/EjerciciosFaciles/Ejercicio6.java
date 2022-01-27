/* Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt().
 */
package EjerciciosFaciles;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir variables
        
        int numero;
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero entero");
        
        numero = leer.nextInt();
        
        double raiz = Math.sqrt(numero);
        
        System.out.println("El doble del numero ingresado es "+numero*2);
        System.out.println("El triple del numero ingresado es: "+numero*3);
        System.out.println("La raiz cuadrada del numero ingresado es: "+Math.sqrt(numero));
        
        
        
    }
    
}
