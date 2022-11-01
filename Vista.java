package swing;
import javax.swing.*;
import java.awt.event.*;

public class Vista extends JFrame{
	
	private JPanel contentPane;
	
	public static void main(String[]args) {
		Vista ventana = new Vista();
		
		
	}
	
	public Vista() {
	
		setTitle("Saludador");
		setBounds(400,200,300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//componentes
		JLabel etiqueta = new JLabel("Escribe un nombre para saludar");
		etiqueta.setBounds(60, 20, 200, 20);
		contentPane.add(etiqueta);
		
		//texto
		JTextField textField = new JTextField();
		textField.setBounds(80,67,130,26);
		contentPane.add(textField);		
		
		JButton boton1 = new JButton("Saludar");
		boton1.setBounds(98,133,89,23);
		contentPane.add(boton1);
		
		boton1.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Hola "+textField.getText());
			}
		});
		
		setVisible(true);
		
	}
	
}
