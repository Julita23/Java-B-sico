/* Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
            int num1,num2,num3,num4;
            int i,j;
            
            System.out.println("Ingrese 4 numeros del 1 al 20");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            num3 = leer.nextInt();
            num4 = leer.nextInt();
            int asterisco=num1;

                   
            for (i=0; i<4; i++){
                
                System.out.print("" + asterisco);
                
                for (j=0; j<asterisco; j++){
                     System.out.print("*");
                }
                System.out.println("");
              
                switch(i){
                    case 0: 
                        
                        asterisco=num2;
                        break;
                    case 1:
                        
                        asterisco=num3;
                        break;
                    case 2:
                        
                        asterisco=num4;
                        break;
                    

                }
                 
            }   
 
                
               }
            
}

