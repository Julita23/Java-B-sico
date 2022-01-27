/* Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla.
 */
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir variables
        
        int numero1,numero2;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para conocer el mayor");
        
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        
        if (numero1==numero2){
        
            System.out.println("Los dos numeros son iguales ");
        
        } else if (numero1<numero2){
            System.out.println("El segundo numero es mayor que el primero ");
                    
        } else if (numero1>numero2){
            System.out.println("El primer numero es mayor que el segundo ");
        }
    }
    
}
