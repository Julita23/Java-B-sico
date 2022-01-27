/* Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
por una E*/
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir variables
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        int numero=999;
        int i,j;
        String conversor;
        
       for (i = 0; i <= numero; i++) {
           
           conversor= String.valueOf(i);
           
           if (i<10){
                System.out.println("Contador: 00"+ conversor.replace("3","E"));
            } else if (i<100){
                System.out.println("Contador: 0"+ conversor.replace("3","E"));
           } else if (i<1000) {
                System.out.println("Contador: "+conversor.replace("3","E"));
            }
       }
            
    }
}
