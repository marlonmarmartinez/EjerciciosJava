
package prueba;


public class Suma {
    private int v1,v2,r;
   public Suma(int valor1, int valor2) {
        
       this.v1=valor1;
       this.v2=valor2;
       
    }
   public void operaciones(){
       r=v1+v2;
   }
   public void imprimir(){
       operaciones();
       System.out.println("el resultado es "+r);
   }
    
}
