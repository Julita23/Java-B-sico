/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente*/
package EjerciciosFaciles;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio22VyM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
       int vector [];
       vector = new int [100];
       int entero=101;
       String suma="";
       
       for (int i=1;i<=100;i++){
          vector[i-1]=entero-i;
          suma=vector[i-1]+ ";";
          
          if (i%10==0){
              
              suma="\n";
          } 
       }
         System.out.println("Numeros del 1 al 100 descendentes "+suma);
    }
}
