
package estadosdehilos;

import java.util.logging.Level;
import java.util.logging.Logger;


public class sincronizaciondehilo3 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.print("e");
            try {
                sincronizaciondehilo3.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(sincronizaciondehilos1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
