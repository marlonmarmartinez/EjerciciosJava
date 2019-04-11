
package interfaces;


public class ListasPilas {
    private NodoPilas ultimovaloringresado;
    public static void main(String[] args) {
        //analizador sintactico
        
    }
    public ListasPilas(){
        ultimovaloringresado=null;
    }
    public void insertar(char valor){
        NodoPilas nuevo=new NodoPilas();
        nuevo.informacion=valor;
        
        if(ultimovaloringresado==null){
            nuevo.siguiente=null;
            ultimovaloringresado=nuevo;
        }else{
            nuevo.siguiente=ultimovaloringresado;
            ultimovaloringresado=nuevo;
        }
    }
    public char extraer(){
        if (ultimovaloringresado !=null) {
            char info=ultimovaloringresado.informacion;
            ultimovaloringresado=ultimovaloringresado.siguiente;
            return info;
        } else {
            return Character.MAX_VALUE;
        }
    }
    public boolean pilaVacia(){
        return ultimovaloringresado==null;
    }
}
