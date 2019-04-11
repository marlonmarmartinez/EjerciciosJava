
package estadosdehilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PrincipalSincronizacion {
    
    public static void main(String[] args) {
        try {
            sincronizaciondehilos1 h1=new sincronizaciondehilos1();
            sincronizaciondehilo2 h2=new sincronizaciondehilo2();
            sincronizaciondehilo3 h3=new sincronizaciondehilo3();
            sincronizaciondehilo4 h4=new sincronizaciondehilo4();
            
            h1.start();
            h1.sleep(10);
            
            h2.start();          
            h2.sleep(10);
            
            h3.start();
            h3.sleep(10);
            
            h4.start();
            h4.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(PrincipalSincronizacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
