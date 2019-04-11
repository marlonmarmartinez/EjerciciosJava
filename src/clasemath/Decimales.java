
package clasemath;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class Decimales {
    
    public static void main(String[] args) {
        double numero=2;
        double raiz=Math.sqrt(numero);
        System.out.println("la raiz cuadrada es "+raiz);
        
        DecimalFormat df=new DecimalFormat("#.00");
        System.out.println("la raiz es : "+df.format(raiz));
        
        System.out.println("la raiz es : "+ String.format("%.2f", raiz));
        
        System.out.println("la raiz es : "+(double)Math.round(raiz*100d)/100);
        
        BigDecimal bd=new BigDecimal(raiz);
        bd=bd.setScale(2,RoundingMode.HALF_UP);
        System.out.println("la raiz es :"+bd.doubleValue());
    }
}
