
package lavadora_1;
import java.util.Scanner;
import lfunciones.LLFunciones;

public class Lavadora_1 {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("la ropa es blanca o de color");
        System.out.println("presiona 1 - ropa blanca / 2 - ropa de color");
        int tiporopa=entrada.nextInt();
        System.out.println("cuantos kilos de ropa");
        int kilos=entrada.nextInt();
        
        LLFunciones mensajero=new LLFunciones(kilos,tiporopa);
        //mensajero.setTiporopa(2);
        //System.out.println("el tipo de ropa es "+mensajero.getTiporopa());
        mensajero.cicloFinalizado();
    }
  
}
