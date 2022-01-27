/* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla.
 */
package EjerciciosFaciles;

import java.util.Scanner;

public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     String nombre;
     
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    System.out.println(" Ingrese su nombre completo");
    
    nombre = leer.next();
    
    System.out.println("su nombre completo es "+nombre);
    
    }
    
}
