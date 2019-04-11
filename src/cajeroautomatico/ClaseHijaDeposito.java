
package cajeroautomatico;


public class ClaseHijaDeposito extends ClasePadreAbstracta{

    @Override
    public void transacciones() {
        System.out.println("cuanto deseas depositar : ");
        deposito();
        
        transacciones=getSaldo();
        setSaldo(transacciones+deposito);
        System.out.println("-----------------------------");
        System.out.println("depositastes : "+deposito);
        System.out.println("tu saldo actual es : "+getSaldo());
        System.out.println("-------------------------------");
    }
    
}
