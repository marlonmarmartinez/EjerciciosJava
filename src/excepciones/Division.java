
package excepciones;

import java.util.Scanner;


public class Division {
    
    public static void main(String[] args) {
        try{
        
        int v1,v2,r;
        Scanner e=new Scanner(System.in);
        System.out.println("dame el primer valor : ");
        v1=e.nextInt();
        System.out.println("dame el segundo valor : ");
        v2=e.nextInt();
        
        r=v1/v2;
        System.out.println("la division es "+ r);
        }catch(Exception e){
            System.out.println("la division entre 0 no es permitida "+e);
        }finally{
            System.out.println("operacion concluida");
        }
    }
}
