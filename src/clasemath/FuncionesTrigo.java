
package clasemath;


public class FuncionesTrigo {
    
    public static void main(String[] args) {
        double r=0;
        double angulogrados=45;
        double anguloradianes=Math.toRadians(angulogrados);
        
        r=Math.sin(anguloradianes);
        System.out.println(r);
        
        r=Math.cos(anguloradianes);
        System.out.println(r);
        
        r=Math.tan(anguloradianes);
        System.out.println(r);
    }
}
