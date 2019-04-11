
package proyecto;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Principal extends JFrame implements ActionListener{
 private JMenuBar mb;
 private JMenu menuop,menucal,menuacerca,menucolorfondo;
 private JMenuItem micalculo,mirojo,minegro,mimorado,micreador,misalir,minuevo;
 private JLabel llogo,lbienvenido,ltitulo,lnombre,lpaterno,lmaterno,ldepartamento,lantiguedad,lresultado,lpie;
 private JTextField tfnom,tfpaterno,tfmaterno;
 private JComboBox combodepartamento,comboantiguedad;
 private JScrollPane s1;
 private JTextArea t1;
 String nombre="";

public Principal(){
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("pantalla principal");
	getContentPane().setBackground(new Color(255,0,0));
	//setIconImage(new ImageIcon(getClass().getResource("ruta")).getImage());
	Bienvenida b=new Bienvenida();
	nombre=b.texto;

	mb=new JMenuBar();
	mb.setBackground(new Color(255,0,0));
	setJMenuBar(mb);

	menuop=new JMenu("opciones");
	menuop.setBackground(new Color(255,0,0));
	menuop.setFont(new Font("Andale Mono",1,14));
	menuop.setForeground(new Color(255,255,255));
	mb.add(menuop);
	
	menucal=new JMenu("calcular");
	menucal.setBackground(new Color(255,0,0));
	menucal.setFont(new Font("Andale Mono",1,14));
	menucal.setForeground(new Color(255,255,255));
	mb.add(menucal);

	menuacerca=new JMenu("acerca de");
	menuacerca.setBackground(new Color(255,0,0));
	menuacerca.setFont(new Font("Andale Mono",1,14));
	menuacerca.setForeground(new Color(255,255,255));
	mb.add(menuacerca);

	menucolorfondo=new JMenu("color fondo");
	menucolorfondo.setBackground(new Color(255,0,0));
	menucolorfondo.setFont(new Font("Andale Mono",1,14));
	menucolorfondo.setForeground(new Color(255,255,255));
	menuop.add(menucolorfondo);

	micalculo=new JMenuItem("calculo");
	micalculo.setFont(new Font("Andale Mono",1,14));
	micalculo.setForeground(new Color(255,255,255));
	menucal.add(micalculo);
	micalculo.addActionListener(this);
	
	mirojo=new JMenuItem("rojo");
	mirojo.setFont(new Font("Andale Mono",1,14));
	mirojo.setForeground(new Color(255,255,255));
	menucolorfondo.add(mirojo);
	mirojo.addActionListener(this);

	minegro=new JMenuItem("negro");
	minegro.setFont(new Font("Andale Mono",1,14));
	minegro.setForeground(new Color(255,255,255));
	menucolorfondo.add(minegro);
	minegro.addActionListener(this);

	mimorado=new JMenuItem("morado");
	mimorado.setFont(new Font("Andale Mono",1,14));
	mimorado.setForeground(new Color(255,255,255));
	menucolorfondo.add(mimorado);
	mimorado.addActionListener(this);

	minuevo=new JMenuItem("nuevo");
	minuevo.setFont(new Font("Andale Mono",1,14));
	minuevo.setForeground(new Color(255,255,255));
	menuop.add(minuevo);
	minuevo.addActionListener(this);

	micreador=new JMenuItem("creador");
	micreador.setFont(new Font("Andale Mono",1,14));
	micreador.setForeground(new Color(255,255,255));
	menuacerca.add(micreador);
	micreador.addActionListener(this);

	misalir=new JMenuItem("salir");
	misalir.setFont(new Font("Andale Mono",1,14));
	misalir.setForeground(new Color(255,255,255));
	menuop.add(misalir);
	misalir.addActionListener(this);

	//ImageIcon image=new ImageIcon("ruta");
	llogo=new JLabel();//(image);
	llogo.setBounds(5,5,250,100);
	add(llogo);

	lbienvenido=new JLabel("bienvenido "+nombre);
	lbienvenido.setBounds(280,30,300,50);
	lbienvenido.setFont(new Font("Andale Mono",1,32));
	lbienvenido.setForeground(new Color(255,255,255));
	add(lbienvenido);

	ltitulo=new JLabel("datos del trabajador");
	ltitulo.setBounds(25,120,300,40);
	ltitulo.setFont(new Font("Andale Mono",1,24));
	ltitulo.setForeground(new Color(255,255,255));
	add(ltitulo);

	lnombre=new JLabel("nombre completo");
	lnombre.setBounds(25,190,150,25);
	lnombre.setFont(new Font("Andale Mono",1,14));
	lnombre.setForeground(new Color(255,255,255));
	add(lnombre);

	tfnom=new JTextField();
	tfnom.setBounds(25,213,150,25);
	tfnom.setBackground(new java.awt.Color(25,224,224));
	tfnom.setFont(new java.awt.Font("Andale Mono",1,14));
	tfnom.setForeground(new java.awt.Color(255,0,0));
	add(tfnom);

	lpaterno=new JLabel("apellido");
	lpaterno.setBounds(25,248,180,25);
	lpaterno.setFont(new Font("Andale Mono",1,14));
	lpaterno.setForeground(new Color(255,255,255));
	add(lpaterno);

	tfpaterno=new JTextField();
	tfpaterno.setBounds(25,270,150,25);
	tfpaterno.setBackground(new java.awt.Color(25,224,224));
	tfpaterno.setFont(new java.awt.Font("Andale Mono",1,14));
	tfpaterno.setForeground(new java.awt.Color(255,0,0));
	add(tfpaterno);
	
	lmaterno=new JLabel("apellido");
	lmaterno.setBounds(25,308,180,25);
	lmaterno.setFont(new Font("Andale Mono",1,14));
	lmaterno.setForeground(new Color(255,255,255));
	add(lmaterno);	

	tfmaterno=new JTextField();
	tfmaterno.setBounds(25,334,150,25);
	tfmaterno.setBackground(new java.awt.Color(25,224,224));
	tfmaterno.setFont(new java.awt.Font("Andale Mono",1,14));
	tfmaterno.setForeground(new java.awt.Color(255,0,0));
	add(tfmaterno);
	
	ldepartamento=new JLabel("departamento");
	ldepartamento.setBounds(220,188,180,25);
	ldepartamento.setFont(new Font("Andale Mono",1,14));
	ldepartamento.setForeground(new Color(255,255,255));
	add(ldepartamento);	

	combodepartamento=new JComboBox();
	combodepartamento.setBounds(220,213,220,25);
	combodepartamento.setBackground(new java.awt.Color(25,224,224));
	combodepartamento.setFont(new java.awt.Font("Andale Mono",1,14));
	combodepartamento.setForeground(new java.awt.Color(255,0,0));
	add(combodepartamento);
	combodepartamento.addItem("");
	combodepartamento.addItem("atencion al cliente");
	combodepartamento.addItem("depatamento logistica");
	combodepartamento.addItem("departamento gerencia");

	lantiguedad=new JLabel("antiguedad");
	lantiguedad.setBounds(220,248,180,25);
	lantiguedad.setFont(new Font("Andale Mono",1,14));
	lantiguedad.setForeground(new Color(255,255,255));
	add(lantiguedad);	

	comboantiguedad=new JComboBox();
	comboantiguedad.setBounds(220,273,220,25);
	comboantiguedad.setBackground(new java.awt.Color(25,224,224));
	comboantiguedad.setFont(new java.awt.Font("Andale Mono",1,14));
	comboantiguedad.setForeground(new java.awt.Color(255,0,0));
	add(comboantiguedad);
	comboantiguedad.addItem("");
	comboantiguedad.addItem("1 año de servicio");
	comboantiguedad.addItem("de 2 a 6 años de servicio");
	comboantiguedad.addItem("mas de 7 años de servicio");

	lresultado=new JLabel("resultado calculo");
	lresultado.setBounds(220,307,180,25);
	lresultado.setFont(new Font("Andale Mono",1,14));
	lresultado.setForeground(new Color(255,255,255));
	add(lresultado);

	t1=new JTextArea();
	t1.setEditable(false);
	t1.setBackground(new Color(224,224,224));
	t1.setFont(new Font("Andale Mono",1,11));
	t1.setForeground(new Color(255,0,0));
	t1.setText("\n aqui aparece el resultado del calculo de vacas");
	s1=new JScrollPane(t1);
	s1.setBounds(220,333,385,90);
	add(s1);

	lpie=new JLabel("2017 company derechos reservados");
	lpie.setBounds(135,445,500,30);
	lpie.setFont(new java.awt.Font("Andale Mono",1,12));
	lpie.setForeground(new java.awt.Color(255,255,255));
	add(lpie);
}
 @Override
 public void actionPerformed(ActionEvent e){
	if(e.getSource()==micalculo){
	String nt=tfnom.getText();
	String ap=tfpaterno.getText();
	String am=tfmaterno.getText();
	String dep=combodepartamento.getSelectedItem().toString();
	String anti=comboantiguedad.getSelectedItem().toString();
		if(nt.equals("") || ap.equals("") || am.equals("") || dep.equals("") || anti.equals("")){
			JOptionPane.showMessageDialog(null,"debes llenar todos los campos");
		}else{
			if(dep.equals("atencion al cliente")){
			   if(anti.equals("1 año de servicio")){
			      t1.setText("\n el trabajador "+nt+" "+ap+" "+am+
				         "\n quien labora en "+dep+" con "+anti+
					 "\n recibe 6 dias de vacaciones"); 
			   }
			 if(anti.equals("de 2 a 6 años de servicio")){
			      t1.setText("\n el trabajador "+nt+" "+ap+" "+am+
				         "\n quien labora en "+dep+" con "+anti+
					 "\n recibe 14 dias de vacaciones"); 
			   }
			 if(anti.equals("mas de 7 años de servicio")){
			      t1.setText("\n el trabajador "+nt+" "+ap+" "+am+
				         "\n quien labora en "+dep+" con "+anti+
					 "\n recibe 20 dias de vacaciones"); 
			   }
			}
			
			if(dep.equals("departamento logistica")){
			   if(anti.equals("1 año de servicio")){
			      t1.setText("\n el trabajador "+nt+" "+ap+" "+am+
				         "\n quien labora en "+dep+" con "+anti+
					 "\n recibe 10 dias de vacaciones"); 
			   }
			 if(anti.equals("de 2 a 6 años de servicio")){
			      t1.setText("\n el trabajador "+nt+" "+ap+" "+am+
				         "\n quien labora en "+dep+" con "+anti+
					 "\n recibe 16 dias de vacaciones"); 
			   }
			 if(anti.equals("mas de 7 años de servicio")){
			      t1.setText("\n el trabajador "+nt+" "+ap+" "+am+
				         "\n quien labora en "+dep+" con "+anti+
					 "\n recibe 22 dias de vacaciones"); 
			   }
			}

			if(dep.equals("departamento gerencia")){
			   if(anti.equals("1 año de servicio")){
			      t1.setText("\n el trabajador "+nt+" "+ap+" "+am+
				         "\n quien labora en "+dep+" con "+anti+
					 "\n recibe 10 dias de vacaciones"); 
			   }
			 if(anti.equals("de 2 a 6 años de servicio")){
			      t1.setText("\n el trabajador "+nt+" "+ap+" "+am+
				         "\n quien labora en "+dep+" con "+anti+
					 "\n recibe 18 dias de vacaciones"); 
			   }
			 if(anti.equals("mas de 7 años de servicio")){
			      t1.setText("\n el trabajador "+nt+" "+ap+" "+am+
				         "\n quien labora en "+dep+" con "+anti+
					 "\n recibe 25 dias de vacaciones"); 
			   }
			}
		}
	}
	if(e.getSource()==mirojo){
		getContentPane().setBackground(new Color(255,0,0));
	}
	if(e.getSource()==minegro){
		getContentPane().setBackground(new Color(0,0,0));
	}
	if(e.getSource()==mimorado){
		getContentPane().setBackground(new Color(51,0,51));
	}
	if(e.getSource()==minuevo){
		tfnom.setText("");
		tfpaterno.setText("");
		tfmaterno.setText("");
		combodepartamento.setSelectedIndex(0);
		comboantiguedad.setSelectedIndex(0);
		t1.setText("\n aqui aparece el resultado del calculo de vacaciones");

	}
	if(e.getSource()==misalir){
		Bienvenida v=new Bienvenida();
	    	v.setBounds(0,0,350,450);
	    	v.setVisible(true);
	    	v.setResizable(false);
	   	v.setLocationRelativeTo(null);
		this.setVisible(false);
	}
	if(e.getSource()==micreador){
		JOptionPane.showMessageDialog(null,"desarrollado por el capitan");

	}
}
public static void main(String []agrs){
	Principal v=new Principal();
	v.setBounds(0,0,640,535);
	v.setVisible(true);
	v.setResizable(false);
	v.setLocationRelativeTo(null);
}
 
}
