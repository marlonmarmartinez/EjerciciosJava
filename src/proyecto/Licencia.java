
package proyecto;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Licencia extends JFrame implements ActionListener,ChangeListener{
      private JLabel l1,l2;
      private JCheckBox c1;
      private JButton b1,b2;
      private JScrollPane s1;
      private JTextArea t1;
      String nombre="";

	public Licencia(){
            setLayout(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle("licencia de uso");
	    //setIconImage(new ImageIcon(getClass().getResource("ruta")).getImage());
	    Bienvenida b=new Bienvenida();
	    nombre=b.texto;
	    
	l1=new JLabel("terminos y condiciones");
	l1.setBounds(215,3,200,30);
	l1.setFont(new Font("Andale Mono",1,14));
	l1.setForeground(new Color(0,0,0));
 	add(l1);

	t1=new JTextArea();
	t1.setEditable(false);
	t1.setFont(new Font("Andale Mono",0,9));
	t1.setText("\n\n          terminos y condiciones"+
		   "\n\n  aassssssssss"+
		    "\n\n aaaaaaaaaa");
	s1=new JScrollPane(t1);
	s1.setBounds(10,40,575,200);
	add(s1);

	c1=new JCheckBox("yo "+nombre+" acepto");
	c1.setBounds(10,250,300,30);
	c1.addChangeListener(this);
	add(c1);

	b1=new JButton("continuar");
	b1.setBounds(10,290,100,30);
	b1.addActionListener(this);
	b1.setEnabled(false);
	add(b1);	
 
	b2=new JButton("cancelar");
	b2.setBounds(120,290,100,30);
	b2.addActionListener(this);
	b2.setEnabled(true);
	add(b2);

	//ImageIcon imagen=new ImageIcon("ruta");
	l2=new JLabel();//(imagen);
	l2.setBounds(315,135,300,300);
	add(l2);
        }
  public void stateChanged(ChangeEvent e){
  	if(c1.isSelected()==true){
		b1.setEnabled(true);
		b2.setEnabled(false);
	}else{
		b1.setEnabled(false);
		b2.setEnabled(true);
	}
  }
  public void actionPerformed(ActionEvent e){
	if(e.getSource()==b1){
		Principal v=new Principal();
		v.setBounds(0,0,640,535);
		v.setVisible(true);
		v.setResizable(false);
		v.setLocationRelativeTo(null);
		this.setVisible(false);
	}else if(e.getSource()==b2){
		Bienvenida v=new Bienvenida();
	    	v.setBounds(0,0,350,450);
	    	v.setVisible(true);
	    	v.setResizable(false);
	    	v.setLocationRelativeTo(null);
		this.setVisible(false);
	}
  }
public static void main(String args[]){
	Licencia ventanalicencia=new Licencia();
	ventanalicencia.setBounds(0,0,600,360);
	ventanalicencia.setVisible(true);
	ventanalicencia.setResizable(false);
	ventanalicencia.setLocationRelativeTo(null);
}

    
}
