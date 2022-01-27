/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre traspuesta. ¿Que es una matriz traspuesta? */
package EjerciciosFaciles;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio25VyM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random aleatorio = new Random ();
        
        int [][] matriz = new int [4][4];
        int [][] traspuesta = new int [4][4];
        
        System.out.print("La matriz original es: ");
        
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                
                matriz [i][j]=aleatorio.nextInt(10);
                System.out.print("[ "+matriz[i][j]+" ]");
                
            }
            System.out.println("");
        }
        System.out.print("La matriz traspuesta es: ");
        
        for(int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                
                traspuesta [i][j]= matriz [j][i];
                System.out.print("[ "+traspuesta[i][j]+" ]");
            }
             System.out.println("");
        }
        
    }
    
}
