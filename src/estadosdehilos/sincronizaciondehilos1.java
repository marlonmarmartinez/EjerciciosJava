
package estadosdehilos;

import java.util.logging.Level;
import java.util.logging.Logger;


public class sincronizaciondehilos1 extends Thread{
    
    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.print(i+": g");
            try {
                sincronizaciondehilos1.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(sincronizaciondehilos1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
