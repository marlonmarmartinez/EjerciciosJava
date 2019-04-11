
package interfaces;

import javax.swing.JOptionPane;


public class Pila {
    private NodoPila ultimovaloringresado;
    int tamaño=0;
    String lista="";
    
    public Pila(){
        ultimovaloringresado=null;
        tamaño=0;
    }
    
    public boolean pilaVacia(){
        return ultimovaloringresado==null;
    }
    public void insertarNodo(int nodo){
        NodoPila nuevo_nodo=new NodoPila(nodo);
        nuevo_nodo.siguiente=ultimovaloringresado;
        ultimovaloringresado=nuevo_nodo;
        tamaño++;
    }
    public int eliminarNodo(){
        int auxiliar=ultimovaloringresado.informacion;
        ultimovaloringresado=ultimovaloringresado.siguiente;
        tamaño--;
        return auxiliar;
    }
    public int mostrarUltimoValorIngresado(){
        return ultimovaloringresado.informacion;
    }
    public int tamañoPila(){
        return tamaño;
    }
    public void vaciarPila(){
        while(!pilaVacia() ){
            eliminarNodo();
        }
    }
    public void mostrarValores(){
        NodoPila recorrido=ultimovaloringresado;
        while(recorrido !=null){
            lista +=recorrido.informacion + "\n";
            recorrido=recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, lista);
        lista="";
    }
}
