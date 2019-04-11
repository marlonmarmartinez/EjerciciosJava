
package cajeroautomatico;

import java.util.Scanner;

public abstract class ClasePadreAbstracta {
    
    protected int transacciones,retiro,deposito;
    private static int saldo;
    Scanner e=new Scanner(System.in);
    
    public void operaciones(){
        int bandera=0;
        int seleccion=0;
        
        do{
        do {
            System.out.println("por favor seleccione una opcion : ");
            System.out.println("    1. consulta de saldo");
            System.out.println("    2.retiro de efectivo");
            System.out.println("    3. deposito de efectivo");
            System.out.println("    4. salir");
            seleccion=e.nextInt();
            
            if(seleccion>=1 && seleccion<=4){
                bandera=1;
            }else{
                System.out.println("--------------------------------------");
                System.out.println("opcion no disponible vuelva a intentar");
                
            }
        } while (bandera==0);
        
            switch (seleccion) {
                case 1:
                    ClasePadreAbstracta m=new ClseHijaConsulta();
                    m.transacciones();
                    break;
                case 2:
                    ClasePadreAbstracta me=new ClaseHijaRetiro();
                    me.transacciones();
                    break;
                case 3:
                    ClasePadreAbstracta men=new ClaseHijaDeposito();
                    men.transacciones();
                    break;
                case 4:
                    System.out.println("-----------------------");
                    System.out.println("gracias vuelva pronto");
                    bandera=2;
                    break;
                default:
                    break;
            }
        
        }while(bandera !=2);
    }
    public void retiro(){
        retiro=e.nextInt();
    }
    public void deposito(){
        deposito=e.nextInt();
    }
    public abstract void transacciones();

    public  int getSaldo() {
        return saldo;
    }

    public  void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
}

