
package cajeroautomatico;


public class ClaseHijaRetiro extends ClasePadreAbstracta{

    @Override
    public void transacciones() {
        System.out.print("cuanto deseas retirar : ");
        retiro();
        if(retiro<=getSaldo()){
            transacciones=getSaldo();
            setSaldo(transacciones-retiro);
            System.out.println("---------------------------");
            System.out.println("retiraste : "+retiro);
            System.out.println("tu saldo actual es : "+getSaldo());
            
        }else{
            System.out.println("------------------");
            System.out.println("saldo insuficiente");
            System.out.println("-------------------");
        }
    }
    
}
