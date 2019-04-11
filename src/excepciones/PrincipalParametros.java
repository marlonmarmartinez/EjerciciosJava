package excepciones;

public class PrincipalParametros {

    public static void main(String[] args) {
        HilosConParametros hilo1 = new HilosConParametros(" hilo1");
        HilosConParametros hilo2 = new HilosConParametros(" hilo2");
        HilosConParametros hilo3 = new HilosConParametros(" hilo3");

        hilo1.valorCondicion(3);
        hilo2.valorCondicion(5);
        hilo2.valorCondicion(2);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
}
