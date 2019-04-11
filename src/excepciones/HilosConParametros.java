
package excepciones;


public class HilosConParametros extends Thread{
    int num;
    
    public HilosConParametros(String nombrehilo){
        super(nombrehilo);
    }
    
    @Override
    public void run(){
        
        for (int i = 0; i <=num; i++) {
            System.out.println(i+" "+this.getName());
        }
        System.out.println("");
    }
    public void valorCondicion(int valor){
        this.num=valor;
    }
}
