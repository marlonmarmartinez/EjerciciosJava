
package interfaces;

import javax.swing.JOptionPane;


public class PrincipalCola {
    public static void main(String[] args) {
        int opcion=0,nodoinfo=0;
        ListasColas c=new ListasColas();
        
        do {
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Menu de opciones\n\n"
                        +"1. insertar un nodo\n"
                        +"2. extraer un nodo\n"
                        +"3. mostrar contenido\n"
                        +"4. salir.\n\n"));
                
                switch (opcion){
                    case 1: 
                        nodoinfo=Integer.parseInt(JOptionPane.showInputDialog(null,"por favor ingrese el valor a guardar en el nodo"));
                        c.insertarCola(nodoinfo);
                        break;
                    case 2: 
                        if (!c.colaVacia()) {
                            JOptionPane.showMessageDialog(null, "se extrajo un nodo con el valor : "+c.extraerCola());
                        } else {
                            JOptionPane.showMessageDialog(null, "la cola esta vacia");
                        }
                        break;
                    case 3: 
                        c.mostrarContenido();
                        break;
                    case 4: 
                        opcion=4;
                        break;
                    default: 
                        JOptionPane.showMessageDialog(null, "la opcion no esta disponible");
                        break;
                }
                
            } catch (NumberFormatException e) {
            }
            
        } while (opcion !=4);
        
    }
}
