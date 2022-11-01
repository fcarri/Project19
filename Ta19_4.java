package project19;

import javax.swing.*;
import java.awt.event.*;

public class Ta19_4 extends JFrame {

	private JPanel contentPane;
	Double op1;
	Double op2;
	int oper;
	
	public static void main(String[]args) {
		
		Ta19_4 ta19_4 = new Ta19_4();
		ta19_4.execucio();
	}
	
	public Ta19_4() {
		
		this.op1 = 0.0;
		this.op2 = 0.0;
		this.oper = 0;
		
	}
	
	public void execucio() {
	
		setTitle("Mini calculadora");
		setBounds(400,200,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
			
		//JLabel
		JLabel etiqueta = new JLabel("Operando 1");
		etiqueta.setBounds(100, 60, 200, 20);
		contentPane.add(etiqueta);
		
		JLabel etiqueta2 = new JLabel("Operando 2");
		etiqueta2.setBounds(320, 60, 200, 20);
		contentPane.add(etiqueta2);
		
		JLabel etiqueta3 = new JLabel("Resultado");
		etiqueta3.setBounds(210, 160, 200, 20);
		contentPane.add(etiqueta3);					
		
		//text
		JTextField textField = new JTextField();
		textField.setBounds(80,100,106,26);
		contentPane.add(textField);	
		
		
		JTextField textField2 = new JTextField();
		textField2.setBounds(300,100,106,26);
		contentPane.add(textField2);	
		
		
		//text no editable
		JTextField textField3 = new JTextField();
		textField3.setBounds(190,200,106,26);
		contentPane.add(textField3);
		textField3.setEditable(false);
							
		
		//Buttons		
		JButton boton1 = new JButton("+");
		boton1.setBounds(100,280,50,23);
		contentPane.add(boton1);		
		
		JButton boton2 = new JButton("-");
		boton2.setBounds(180,280,50,23);
		contentPane.add(boton2);
		
		JButton boton3 = new JButton("*");
		boton3.setBounds(260,280,50,23);
		contentPane.add(boton3);
		
		JButton boton4 = new JButton("/");
		boton4.setBounds(340,280,50,23);
		contentPane.add(boton4);
		
		JButton boton5 = new JButton("About");
		boton5.setBounds(120,360,80,23);
		contentPane.add(boton5);
		
		JButton boton6 = new JButton("Salir");
		boton6.setBounds(280,360,80,23);
		contentPane.add(boton6);
				
		
		//Button action		
	
		boton1.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {	
				try {
					oper = 1;
					operacio(textField, textField2, textField3, oper);	
				}catch(Exception ex) {
					message();
				}
			}
		});
		
		boton2.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {	
				try {
					oper = 2;
					operacio(textField, textField2, textField3, oper);	
				}catch(Exception ex) {
					message();
				}
			}
		});
		
		boton3.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {	
				try {
					oper = 3;
					operacio(textField, textField2, textField3, oper);
				}catch(Exception ex) {
					message();
				}
			}
		});
		
		boton4.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				try {
					oper = 4;
					operacio(textField, textField2, textField3, oper);
				}catch(Exception ex) {
					message();
				}
			}
		});
		

		
		boton5.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {		
				JOptionPane.showMessageDialog(null,"Mini calculadora");
			}
		});
		
		boton6.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {						 
				 System.exit(0);
			}
		});
		
	
								
	}
	
	public void message() {
		JOptionPane.showMessageDialog(null,"Introducir sólo números");
	}
	

	public void operacio(JTextField textField, JTextField textField2, JTextField textField3, 
			int oper) {
		
		Double r = 0.0;
		op2 = Double.parseDouble(textField2.getText());
		op1 = Double.parseDouble(textField.getText());
		
		switch (oper) {
		case 1:
			r = op1 + op2;
			break;
		case 2:
			r = op1 - op2;
			break;
		case 3:
			r = op1 * op2;
			break;
		case 4:
			r = op1 / op2;
			break;
		}
		
		String re = Double.toString(r);  
		textField3.setText(re);
		
	}
	
	
}
