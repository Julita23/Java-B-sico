/* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere 
el límite inicial. */
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        
        int limite,numeros;
        int suma =0;
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero limite positivo");
        limite = leer.nextInt();
        
        do{
        System.out.println("Ingrese un numero a sumar");
        numeros = leer.nextInt();
        
        suma=suma+numeros;
      
        
        
        }while (suma<limite);{
        System.out.println("La suma total es: " +suma);
    }
    }
}