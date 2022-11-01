package ta19_3;

import javax.swing.*;
import java.awt.event.*;

public class Ta19_3 extends JFrame{
	
	private JPanel contentPane;
	ButtonGroup bgroup = new ButtonGroup(); 
	
	enum SOp {Linux, Mac, Windows}
	enum Esp {Programación, Diseño_grafico, Administración, NONE}
	
	boolean sel_rb1;
	boolean sel_rb2;
	boolean sel_rb3;
	boolean sel_chb1;
	boolean sel_chb2;
	boolean sel_chb3;
	SOp sop;
	Esp esp1;
	Esp esp2;
	Esp esp3;
	int c1;
	int c2;
	int c3;
	
	public static void main(String[]args) {
				
		Ta19_3 ta19_3 = new Ta19_3();
		ta19_3.execucio();
	}
	
	public Ta19_3() {
		
		this.sel_rb1 = true;
		this.sel_rb2 = false;
		this.sel_rb3 = false;	
		this.sel_chb1 = false;
		this.sel_chb2 = false;
		this.sel_chb3 = false;
		this.sop = SOp.Linux;
		this.esp1 = Esp.NONE;
		this.esp2 = Esp.NONE;
		this.esp3 = Esp.NONE;
		this.c1 = 1;
		this.c2 = 1;
		this.c3 = 1;
		
	}
	
	public void execucio() {
					
		setTitle("Encuesta");
		setBounds(400,200,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel etiqueta = new JLabel("Elige un sistema operativo");
		etiqueta.setBounds(80, 60, 200, 20);
		contentPane.add(etiqueta);
		
		JLabel etiqueta2 = new JLabel("Elige tu especialidad");
		etiqueta2.setBounds(300, 60, 200, 20);
		contentPane.add(etiqueta2);
		
		JLabel etiqueta3 = new JLabel("Horas dedicadas");
		etiqueta3.setBounds(200, 230, 200, 20);
		contentPane.add(etiqueta3);
		
		//RadioButton
		
		JRadioButton rb1 = new JRadioButton("Linux",sel_rb1);
		rb1.setBounds(80,100,200,20);
		contentPane.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Mac",sel_rb1);
		rb2.setBounds(80,140,200,20);
		contentPane.add(rb2);
		
		JRadioButton rb3 = new JRadioButton("Windows",sel_rb3);
		rb3.setBounds(80,180,200,20);
		contentPane.add(rb3);
				
		bgroup.add(rb1);
		bgroup.add(rb2);
		bgroup.add(rb3);	
						
		//JCheckBox
		
		JCheckBox chb1 = new JCheckBox("Programación",sel_chb1);
		chb1.setBounds(300, 100, 200, 20);
		contentPane.add(chb1);
		
		JCheckBox chb2 = new JCheckBox("Diseño grafico",sel_chb2);
		chb2.setBounds(300, 140, 200, 20);
		contentPane.add(chb2);
		
		JCheckBox chb3 = new JCheckBox("Administración",sel_chb3);
		chb3.setBounds(300, 180, 200, 20);
		contentPane.add(chb3);
		
		sel_chb1 = chb1.isSelected();
		sel_chb2 = chb2.isSelected();
		sel_chb3 = chb3.isSelected();
		
		//slider
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);  	
		slider.setBounds(150, 270, 200, 60);		 
						  
		slider.setMinorTickSpacing(2);  
		slider.setMajorTickSpacing(10);  
		slider.setPaintTicks(true);  
		slider.setPaintLabels(true);  	
		slider.setVisible(true);
		
		contentPane.add(slider);
		
		
		//boto
		
		JButton boton1 = new JButton("Datos");
		boton1.setBounds(200,360,89,23);
		contentPane.add(boton1);
		boton1.setVisible(true);
		
		boton1.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {									
				
				bgroup.getSelection().getActionCommand();
				JOptionPane.showMessageDialog(null,"Horas "+slider.getValue( )+"\n\r"
				+"Sistema operativo: "+sop +"\n\r"
				+"Especialidad: "+esp1+" "
				+esp2+" "+esp3);	
												
			}
		});
		
		//radioButton check
		rb1.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {														
				sel_rb1 = true;	
				sel_rb2 = false;
				sel_rb3 = false;
				sop = SOp.Linux;
			}
		});
		rb2.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {														
				sel_rb1 = false;
				sel_rb2 = true;
				sel_rb3 = false;	
				sop = SOp.Mac;
			}
		});
		rb3.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {														
				sel_rb1 = false;
				sel_rb2 = false;
				sel_rb3 = true;	
				sop = SOp.Windows;
			}
		});
		
		//jchechBox check
		chb1.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {														
								
				c1++;
				System.out.println("c1 "+c1);
				if (c1 % 2 == 0) {
					sel_chb1 = true;					
					esp1 = Esp.Programación;
				}else {
					esp1 = Esp.NONE;
				
;					sel_chb1 = false;
				
				}
				System.out.println("c1 "+c1+sel_chb1);
				
			}
		});
		chb2.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {																		
								
				c2++;
				System.out.println("c2 "+c2);
				if (c2 % 2 == 0) {
					sel_chb2 = true;	
					esp2 = Esp.Diseño_grafico;
				}else {
					esp2 = Esp.NONE;
					sel_chb2 = false;
				
				}
				System.out.println("c2 "+c2+sel_chb2);
				
			}
		});
		chb3.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {																	
						
				c3++;				
				if (c3 % 2 == 0) {
					sel_chb3 = true;	
					esp3 = Esp.Administración;
				}else {
					esp3 = Esp.NONE;
					sel_chb3 = false;
				
				}
				System.out.println("c3 "+c3+sel_chb3);
				
			}
		});
		
		
	}


	
	

	

}
