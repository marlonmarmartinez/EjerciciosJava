
package estadosdehilos;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal {
   
    public static void main(String[] args) {
        try {
            HiloProceso hilo1=new HiloProceso();
            HiloProceso hilo2=new HiloProceso();
            
            hilo1.start();
            
            hilo1.sleep(1000);
            
            hilo2.start();
            hilo2.stop();//matamos el proceso del hilo
            hilo2.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
