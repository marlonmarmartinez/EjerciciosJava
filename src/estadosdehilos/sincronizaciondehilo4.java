
package estadosdehilos;

import java.util.logging.Level;
import java.util.logging.Logger;


public class sincronizaciondehilo4 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println("k");
            try {
                sincronizaciondehilo4.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(sincronizaciondehilos1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
