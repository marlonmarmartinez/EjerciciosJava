
package polimorfismo;

import java.util.Scanner;


public abstract class Operaciones_CPadre {
    
    protected int v1,v2,r;
    
    Scanner e=new Scanner(System.in);
    public void pedirDatos(){
        System.out.println("dame el primer valor : ");
        v1=e.nextInt();
        System.out.println("dame el segundo valor : ");
        v2=e.nextInt();
    }
    public abstract void operaciones();
    
    public void mostrarResultado(){
        System.out.print(r);
    }
    
}
