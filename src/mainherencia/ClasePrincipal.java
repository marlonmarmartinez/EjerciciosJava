package mainherencia;

import herencia.ClaseHijaResta;
import herencia.ClaseHijaSuma;

public class ClasePrincipal {

    public static void main(String[] args) {

        ClaseHijaSuma sum = new ClaseHijaSuma();
        sum.pedirDatos();
        sum.sumar();
        System.out.print("el resultado es  ");
        sum.mostrarResultado();
        
        ClaseHijaResta res=new ClaseHijaResta();
        res.pedirDatos();
        res.restar();
        System.out.println("el resultado es ");
        res.mostrarResultado();
    }
}
