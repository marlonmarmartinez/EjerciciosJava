
package polimorfismo;


public class Principal {
    
    public static void main(String[] args) {
        Operaciones_CPadre mensajero=new Suma_Ch();
        mensajero.pedirDatos();
        mensajero.operaciones();
        System.out.print("el resultado de la suma es : ");
        mensajero.mostrarResultado();
        System.out.println("");
        
        Operaciones_CPadre m=new Resta_Ch();
        m.pedirDatos();
        m.operaciones();
        System.out.print("el resultado de la resta es : ");
        m.mostrarResultado();
    }
}
