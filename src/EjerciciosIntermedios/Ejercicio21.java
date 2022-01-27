/*Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es: 
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 € */
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el monto en euros para convertirlo");
        int euros = leer.nextInt();
        
        System.out.println("A que moneda desea convertir este monto?");
        String TipoMoneda = leer.next();
        
        conversion(euros, TipoMoneda);
        
    }
    
    public static void conversion(int eurosA, String TipoMonedaA){
        
        if (TipoMonedaA.equalsIgnoreCase("Libra")){
       //equalsIgnoreCase-Compara la cadena de texto contra un objeto ignorando 
       //mayúsculas y minúsculas. Devolverá true si las cadenas comparadas son iguales. 
       //En caso contrario devolverá false.
            
         double ConversLibra=eurosA*0.86;
         System.out.println(eurosA+ " son " +ConversLibra+" Libras");
        }
        
        if (TipoMonedaA.equalsIgnoreCase("Dolar")){
        
        double ConversDolar=eurosA* 1.28611;
        System.out.println(eurosA+ " son " +ConversDolar +" Dolares");
        }
        
        if (TipoMonedaA.equalsIgnoreCase("Yen")){
            
        double ConversYen=eurosA*129.852;
        System.out.println(eurosA+ "son " +ConversYen +" Dolares");   
            
        }
    }
    
}
