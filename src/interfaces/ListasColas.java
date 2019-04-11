
package interfaces;

import javax.swing.JOptionPane;


public class ListasColas {
    private NodoColas iniciocola,fnalcola;
    String Cola="";
    
    public ListasColas(){
        iniciocola=null;
        fnalcola=null;
    }
    public boolean colaVacia(){
        if (iniciocola==null) {
            return true;
        } else {
            return false;
        }
    }
    public void insertarCola(int info){
        NodoColas nuevo=new NodoColas();
        nuevo.informacion=info;
        nuevo.siguiente=null;
        
        if (colaVacia()) {
            iniciocola=nuevo;
            fnalcola=nuevo;
        } else {
            fnalcola.siguiente=nuevo;
            fnalcola=nuevo;
        }
    }
    public int extraerCola(){
        if (!colaVacia()) {
            int info=iniciocola.informacion;
            
            if (iniciocola==fnalcola) {
                iniciocola=null;
                fnalcola=null;
            } else {
                iniciocola=iniciocola.siguiente;
                
            }
            return info;
            
        } else {
            return Integer.MAX_VALUE;
        }
    }
    public void mostrarContenido(){
        NodoColas recorrido=iniciocola;
        String colaInvertida="";
        
        while(recorrido!=null){
            Cola +=recorrido.informacion+" ";
            recorrido=recorrido.siguiente;
        }
        String cadena[]=Cola.split(" ");
        
        for (int i = cadena.length-1; i >=0; i--) {
            colaInvertida +=" "+cadena[i];
        }
        JOptionPane.showMessageDialog(null, colaInvertida);
        Cola="";
    }
}
