
package herencia;

import java.util.Scanner;


public class ClasePadre {
    protected int v1,v2,r;
    Scanner entrada=new Scanner(System.in);
    
    public void pedirDatos(){
        System.out.print("dame el primer valor ");
        v1=entrada.nextInt();
        System.out.print("dame el segundo valor");
        v2=entrada.nextInt();
    }
    public void mostrarResultado(){
        System.out.println(r);
    }
}
