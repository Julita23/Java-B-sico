/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos). */
package EjerciciosIntermedios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio24VyM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random= new Random();
        
        System.out.print("Ingrese el tamaño del vector: ");
        int tamanio=leer.nextInt();
        
        int[] vector= new int[tamanio];
        
        for (int i=0; i<tamanio; i++){
            vector [i]=random.nextInt((10000-0)+0);  //random.nextInt((maximo - min) + min)
        }
        
        System.out.print("El vector creado es: ");
        String auxiliar="";
        
        for(int elemento:vector){
            auxiliar=auxiliar + "["+elemento+"]";
            System.out.print(" ");
        }
        System.out.print(auxiliar);
        
        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        
        for(int i=0; i<tamanio;i++){
            
            if(vector[i]<10){
            cont1=cont1+1;
            }
            if(vector[i]<100){
            cont2=cont2+1;
            }  
            if (vector[i]<1000){
            cont3=cont3+1;
            }
            if (vector[i]<10000){
            cont4=cont4+1;
            }
            if (vector[i]<100000){
            cont5=cont5+1;
            }
        }
        System.out.print("Los numeros de 1 digito son: "+cont1);
        System.out.print(" ");
        System.out.print("Los numeros de 2 digito son: "+cont2);
        System.out.print(" ");
        System.out.print("Los numeros de 3 digito son: "+cont3);
        System.out.print(" ");
        System.out.print("Los numeros de 4 digito son: "+cont4);
        System.out.print(" ");
        System.out.print("Los numeros de 5 digito son: "+cont5); 
        System.out.print(" ");
    }
    
}
