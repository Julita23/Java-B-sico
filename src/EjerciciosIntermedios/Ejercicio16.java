/* Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break*/
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear variables
        
        int numeros,suma,contador;
        
        suma=0;
        contador=0;
        
        do {
             Scanner leer = new Scanner(System.in).useDelimiter("\n");
             System.out.println("Ingrese numeros para conocer la suma de los mismos");
             numeros = leer.nextInt();
             
              if (numeros==0){
                System.out.println("Se capturo el numero 0");
                break;
              }
             
             if (numeros>0){
                contador=contador+1;
                suma=suma+numeros;  
             }
             else{
                System.out.println("Los numeros negativos no se suman");
                
             }
             }
        while (numeros!=0 && contador<20);{
        System.out.println("Los numeros ingresados son: " +contador);
        System.out.println("La suma de los numeros ingresados es igual a "+suma);
            }
            }
        
        }
            
               
    
    

