/*Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma.
 */
package EjerciciosFaciles;

import java.util.Scanner;


/**
 *
 * @author julib
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear variables
        int num1,num2;
        
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese 2 numeros enteros para sumarlos");
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        int suma = num1+num2;
    
        System.out.println("suma: "+suma);
    }
    
}
