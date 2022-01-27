/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de 
una matriz A se denota por A
T y se obtiene cambiando sus filas por columnas (o 
viceversa).*/
package EjerciciosIntermedios;

import java.util.Scanner;



/**
 *
 * @author julib
 */
public class Ejercicio26VyM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int n;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el orden de la matriz");
        n=leer.nextInt();
        int matriz[][]=new int [n][n];
        int matrizT[][]=new int [n][n];
        int cont=0;
        
        System.out.println("Ingrese los elementos de la matriz: ");
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                matriz[i][j]=leer.nextInt();
                
            }
          
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                matrizT[i][j]=matriz[j][i];
                System.out.print("["+matrizT[i][j]+"]");
                
                if(-matrizT[i][j]==matriz[i][j]){
                    cont=cont+1;
                }
                
            }
            System.out.println("");
        }
        if(cont==n*n){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz no es antisimetrica");
        }
        
    }
    
}
