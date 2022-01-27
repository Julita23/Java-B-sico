/*Crear un programa que dado un numero determine si es par o impar.*/
package EjerciciosIntermedios;

import java.util.Scanner;
/**
 *
 * @author julib
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
    // Definir variables
        
        int numero;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es par o impar");
        
        numero = leer.nextInt();
        
        if (numero==0){
            System.out.println("El numero ingresado es incorrecto, vuelva a intentar");
        
        } 
        else if (numero%2==0)
            System.out.println("El número es par");
        
        else 
            System.out.println("El número es impar");
        }
    
    }
            


