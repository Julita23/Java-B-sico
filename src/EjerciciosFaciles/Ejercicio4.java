/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. Nota: investigar la función toUpperCase() y 
toLowerCase() en Java*/

package EjerciciosFaciles;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author julib
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir Variables
        
        String frase;
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" Ingrese su nombre completo");
        
        frase = leer.nextLine();
        
        String mayuscadena = toUpperCase(frase);
        String minuscadena = toLowerCase(frase);

        System.out.println("su nombre completo en mayuscula es "+ mayuscadena);
        System.out.println("su nombre completo en mayuscula es "+ minuscadena);
       
    }
    
}
