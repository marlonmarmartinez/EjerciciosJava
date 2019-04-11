
package cajeroautomatico;


public class ClasePrincipal {
    
    public static void main(String[] args) {
        ClasePadreAbstracta m=new ClseHijaConsulta();
        m.setSaldo(500);
        m.operaciones();
    }
}
