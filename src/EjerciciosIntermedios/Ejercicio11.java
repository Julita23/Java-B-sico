/*. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase,letra;
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una palabra o frase para validar si la primer letra es la A");
        
        frase = leer.next();
        letra = frase.substring(0,1);
        
        if (letra.equals("A")){
            
            System.out.println("Correcto, la primer letra ingresada es A");
        }
        
        else {
            System.out.println("No se encontro la primer letra, intente nuevamente"); }
    }
}
