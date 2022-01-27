/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals()*/
package EjerciciosIntermedios;

import java.util.Scanner;

/**
 *
 * @author julib
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir variables
        
        String cadena,salir;
        String letra1,letra2;
        int contcorrecto,contincorrecto,largo;
        contcorrecto=0;
        contincorrecto=0;
        salir="";
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

             do{
                System.out.println("Ingrese una cadena de 5 caracteres, para salir ingrese &&&&&");
                cadena = leer.nextLine();
                cadena=cadena.toLowerCase();
                largo=cadena.length();
                letra1=cadena.substring(0,1);
                letra2=cadena.substring(largo-1,largo);
             
                 
                 if (largo==5 && letra1.equals("x") && letra2.equals("o")){
                     
                     contcorrecto++;
                     System.out.println("Los caracteres y la cadena ingresados son correctos");
                    
                 }
                 else {
                     contincorrecto++;
                     System.out.println("Los caracteres ingresados son incorrectos, intente nuevamente");
                     
                 }
             }while (!cadena.equals("&&&&&"));
             
            System.out.println("Se ha ingresado la secuencia especial &&&&& para salir");
            System.out.println("La cantidad de secuencias correctas fueron " + contcorrecto);
            System.out.println("La cantidad de secuencias incorrectas fueron " + contincorrecto);
             
             }
    }
    

