/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir Variables
        
        int nota;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        do{
            System.out.println("Ingrese una nota entre 1 y 10");
            nota = leer.nextInt();
            
            if (nota>=1 && nota<=10){
                System.out.println("La nota ingresada es correcta");
            }
            else {
                System.out.println("La nota ingresada es incorrecta, intente nuevamente");
                break;
            }
        }while (nota<=1 || nota>=10);
    }
    
}
