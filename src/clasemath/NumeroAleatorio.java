
package clasemath;

import java.util.Random;

public class NumeroAleatorio {
    
    public static void main(String[] args) {
        int aleatorio=0;
        
        aleatorio=(int) (Math.random()*100);
        System.out.println("el numero aleatorio "+aleatorio);
        
        int al=0;
        Random r=new Random();
        al=(int)(r.nextDouble()*100);
        System.out.println("aleatorio "+al);
    }
}
