/*. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java.*/
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir variables
        
        String contrasena;
        
        contrasena = "eureka";
        
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese contrasena");
        
       contrasena = leer.next();
        
        
        if (contrasena.equals("eureka")){
            
        System.out.println("La palabra ingresada es correcta");
            
        }
        
        else {
            System.out.println("La palabra ingresada es incorrecta");
            
        }
               
    }
    
}
