package constructor;

import java.util.Scanner;

public class ConConstructor {

    public ConConstructor() {
        Scanner m = new Scanner(System.in);
        String nombre = "";
        
        System.out.print("cual es tu nombre ");
        nombre=m.nextLine();
        System.out.println("tu nombre es "+nombre);
    }

}
