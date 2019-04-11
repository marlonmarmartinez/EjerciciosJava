
package excepciones;


public class Hilos {
    public static void main(String[] args) {
        for (int i = 0; i <=5; i++) {
            System.out.println("proceso 1");
        }
        System.out.println("-----------");
        for (int i = 0; i <=5; i++) {
            System.out.println("proceso 2");
        }
    }
}
