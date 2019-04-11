package interfaces;

import javax.swing.JOptionPane;

public class PrincipalPila {

    public static void main(String[] args) {
        int opcion = 0, nodo = 0;
        Pila p = new Pila();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de opciones\n\n"
                        + "1. insertar un nodo\n"
                        + "2. eliminar un nodo\n"
                        + "3. la pila esta vacia\n"
                        + "4. cual es el ultimo valor ingresado en la pila\n"
                        + "5. cuantos nodos tiene la pila\n"
                        + "6. vaciar pilas\n"
                        + "7. mostrar contenido de la pila\n"
                        + "8. salir\n\n"));

                switch (opcion) {
                    case 1:
                        nodo=Integer.parseInt(JOptionPane.showInputDialog(null," por favor ingresa el valor a guardar en el nodo"));
                        p.insertarNodo(nodo);
                        break;
                    case 2:
                            if(!p.pilaVacia()){
                                JOptionPane.showMessageDialog(null, "se ha eliminado un nodo con el valor "
                                +p.eliminarNodo());
                            }else{
                                JOptionPane.showMessageDialog(null, "la pila esta vacia");
                            }
                        break;
                    case 3:
                            if(p.pilaVacia()){
                                JOptionPane.showMessageDialog(null, "la pila esta vacia");
                            }else{
                                JOptionPane.showMessageDialog(null, "la pila no esta vacia");
                            }
                        break;
                    case 4:
                            if(!p.pilaVacia()){
                                JOptionPane.showMessageDialog(null, "el ultimo valor ingresado en la pila es :"
                                +p.mostrarUltimoValorIngresado());
                            }else{
                                JOptionPane.showMessageDialog(null, "la pila esta vacia");
                            }
                        break;
                    case 5:
                            JOptionPane.showMessageDialog(null, "la pila contiene "+p.tamañoPila()+" nodos");
                        break;
                    case 6:
                            if(!p.pilaVacia()){
                                p.vaciarPila();
                                JOptionPane.showMessageDialog(null, "se ha vaciado la pila");
                            }else{
                                JOptionPane.showMessageDialog(null, "la pila esta vacia");
                            }
                        break;
                    case 7:
                            p.mostrarValores();
                        break;
                    case 8:
                            opcion=8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion no disponible pruebe otra");
                        break;
                }

            } catch (NumberFormatException e) {

            }
        } while (opcion != 8);
    }
}
