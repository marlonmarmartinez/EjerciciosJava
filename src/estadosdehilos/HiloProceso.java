
package estadosdehilos;

import java.util.logging.Level;
import java.util.logging.Logger;


public class HiloProceso extends Thread{
    
    @Override
    public void run(){
        for (int i = 0; i <=5; i++) {
            System.out.println(i+" "+getName());
            try {
                HiloProceso.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloProceso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
 
    }
}
