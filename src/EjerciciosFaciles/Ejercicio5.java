/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package EjerciciosFaciles;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir variables
        
        int grados,F;
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" Ingrese sus grados para pasarlos a Fahrenheit");
        
        grados = leer.nextInt();
        
        F = 32 + (9 * grados / 5);
        
      System.out.println("Grados en Fahrenheit: "+F);  
        
        
    }
    
}
