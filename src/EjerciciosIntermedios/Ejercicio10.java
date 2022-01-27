/*. Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java*/
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir variables
        
        String frase;
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una palabra o frase");
        
        frase = leer.nextLine();
        int longitud = frase.length();
        
        if (longitud!=8){
        
        System.out.println("La frase ingresada es incorrecta, intente nuevamente");
        
        } 
        else {
        
        System.out.println("La frase ingresada es correcta");
        
        }
     
    } 
}
