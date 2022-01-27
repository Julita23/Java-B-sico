/*. Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.*/
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir variables
        
        int num1, num2, opcion, suma, resta, multiplicacion;
        double division;
        String salir;
        salir="N";
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros enteros");
         num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        do {
          
            System.out.println("MENU");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");         
            System.out.println("4.Division");
            System.out.println("5.Salir");
            
            
             System.out.println("Elija una de las opciones del menu");
            opcion = leer.nextInt();
            
             
            switch (opcion){
                
                case 1:
                    suma=num1+num2;
                    System.out.println("La suma de ambos numeros es igual a" +suma);
                    break;
                    
                case 2:
                    resta=num1-num2;
                    System.out.println("La resta de ambos numeros es igual a" +resta);
                    break;
                case 3:
                   multiplicacion=num1*num2;
                   System.out.println("La multiplicacion de ambos numeros es igual a" +multiplicacion);
                   break;
                case 4:
                    division=(double)num1/num2;
                    System.out.println("La division de ambos numeros es igual a" +division);
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa? (S/N)");
                    salir = leer.next();
                    salir=salir.toUpperCase();
                    
                    if (salir.equals("S")){
                        continue;
                    }
                    else if (salir.equals("N")){
                        break;
                    }
                default:
                    System.out.println("Valor incorrecto");
                    break;
            }
    }
        while (salir.equals("N"));{
        System.out.println("ha salido del programa");
    }
   }
}
    
