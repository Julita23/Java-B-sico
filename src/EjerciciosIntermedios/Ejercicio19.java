/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* *  
* *
* *
* * */
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        System.out.println("Ingrese el tamano del lado");
        int lado = leer.nextInt();
        int i,j;
        
        for (i = 1; i <= lado; i++){
            for (j = 1; j<= lado; j++){
                
                if ((i==1) | (i==lado)| (j==1)|(j==lado)){
                     System.out.print(" * ");
                }
                else {
                     System.out.print("   ");
                }
            }System.out.println("");
            
           
            
        }
        
        
    }
    
}
