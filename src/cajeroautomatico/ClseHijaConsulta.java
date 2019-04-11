
package cajeroautomatico;


public class ClseHijaConsulta extends ClasePadreAbstracta{

    @Override
    public void transacciones() {
        System.out.println("------------------------------");
        System.out.println("tu saldo actual es : "+getSaldo());
        
    }
    
}
