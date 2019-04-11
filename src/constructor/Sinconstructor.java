
package constructor;

import java.util.Scanner;


public class Sinconstructor {
    private final Scanner m=new Scanner(System.in);
    String nombre="";
    
    public void pedirNombre(){
        System.out.print("cual es tu nombre : ");
        nombre=m.nextLine();
    }
    public void imprimir(){
        System.out.println("tu nombre es "+nombre);
    }
}
