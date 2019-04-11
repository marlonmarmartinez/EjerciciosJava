
package prueba;

import java.util.Scanner;

public class CadenaInvertida {
    
    public static void main(String[] args) {
        String palabra="",palabrainvertida="";
        int longitud=0;
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese la cadena : ");
        palabra=entrada.nextLine();
        longitud=palabra.length();
        
        /*while(longitud!=0){
        palabrainvertida+=palabra.substring(longitud-1,longitud);
        longitud--;
        }*/
        for (int i=longitud;i!=0; i--) {
            palabrainvertida+=palabra.substring(i-1,i);
        }
        System.out.print(palabrainvertida);
    }
}
