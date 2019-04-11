
package proyecto;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{
  private JTextField tf1;
  private JLabel l1,l2,l3,l4;
  private JButton b1;
  public static String texto="";

	public Bienvenida(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bienvenida");
		getContentPane().setBackground(new Color(255,0,0));
                /*setIconImage(new ImageIcon(getClass().getResource("ruta imagen")).getImage());
                ImageIcon imagen=new ImageIcon("ruta imagen");*/
		l1=new JLabel();//(imagen);
		l1.setBounds(25,15,300,150);
		add(l1);

		l2=new JLabel("Sitema de control vacacional");
		l2.setBounds(35,135,300,30);
		l2.setFont(new Font("Andale Mono",3, 18));
		l2.setForeground(new Color(255,255,255));
		add(l2);

		l3=new JLabel("ingese su nombre");
		l3.setBounds(45,212,200,30);
		l3.setFont(new Font("Andale Mono",1, 12));
		l3.setForeground(new Color(255,255,255));
		add(l3);

		l4=new JLabel("2017 company");
		l4.setBounds(85,375,300,30);
		l4.setFont(new Font("Andale Mono",1, 12));
		l4.setForeground(new Color(255,255,255));
		add(l4);

		tf1=new JTextField();
		tf1.setBounds(45,240,255,25);
		tf1.setBackground(new Color(224,224,224));
		tf1.setFont(new Font("Andale Mono",1, 14));
		tf1.setForeground(new Color(255,0,0));
		add(tf1);

		b1=new JButton("ingresar");
		b1.setBounds(125,280,100,30);
		b1.setBackground(new Color(255,255,255));
		b1.setFont(new Font("Andale Mono",1,14));
		b1.setForeground(new Color(255,0,0));
		b1.addActionListener(this);
		add(b1);
         }

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
		    texto=tf1.getText().trim();
		     	if(texto.equals("")){
				JOptionPane.showMessageDialog(null,"debes ingresar tu nombre");
			
			}else{
				Licencia ventanalicencia=new Licencia();
				ventanalicencia.setBounds(0,0,600,360);
				ventanalicencia.setVisible(true);
				ventanalicencia.setResizable(false);
				ventanalicencia.setLocationRelativeTo(null);
				this.setVisible(false);
			}
                 }
         }
	
	public static void main(String []args){
            Bienvenida v=new Bienvenida();
	    v.setBounds(0,0,350,450);
	    v.setVisible(true);
	    v.setResizable(false);
	    v.setLocationRelativeTo(null);
	   
        }

}
