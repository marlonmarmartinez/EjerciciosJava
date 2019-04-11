
package clasemath;

public class Conversiones {
    
    public static void main(String[] args) {
        double angulogrados=45;
        
        double anguloradianes=Math.toRadians(angulogrados);
        System.out.println("deg a rad "+anguloradianes);
        
        angulogrados=Math.toDegrees(anguloradianes);
        System.out.println("rad a deg :"+angulogrados);
    }
}
