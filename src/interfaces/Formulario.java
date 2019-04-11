
package interfaces;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener{
    private JTextField tf;
    private JLabel l;
    private JButton b;
    
    public Formulario(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        l=new JLabel("mensaje");
        l.setBounds(15,10,100,30);
        add(l);
        
        tf=new JTextField();
        tf.setBounds(80,16,190,20);
        add(tf);
        
        b=new JButton("mostrar");
        b.setBounds(10, 60, 100, 30);
        add(b);
        b.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            String cadena=tf.getText();
            JOptionPane.showMessageDialog(null, cadena);
        }
    }
    
    public static void main(String[] args) {
        Formulario f=new Formulario();
        f.setBounds(0,0,300,150);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }
    
}
