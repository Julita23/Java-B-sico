/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido.
 */
package EjerciciosFaciles;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio23VyM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
      System.out.print("Ingrese el tamaño del vector: ");
      int tamanio=leer.nextInt();
      
      System.out.print("Que numero desea encontrar? ");
      int numero=leer.nextInt();
      
      int contador=0;
      numero=numero+1;
      
      int [] vector= new int [tamanio];
      
      for (int i = 0; i < numero; i++) {
           //La función Math.random() retorna un punto flotante, 
          //un número pseudo-aleatorio dentro del rango [0, 1).
            vector[i]= (int) (Math.random() * 100);
            System.out.print(vector[i]+",");
      }
            
      for ( int i=0; i<numero; i++){ 
          if (vector[i]==numero){
              
              System.out.print("/n");
              System.out.println("Se encontro el número ");
               System.out.println(vector[i]+" en la posición "+i);
               
            } else{
              contador++;
          }
          if (contador==numero){
            System.out.println("No se encontro el número en el arreglo");
   
          }
                  
        }
    }
}

