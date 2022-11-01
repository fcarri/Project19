
import javax.swing.*;
import java.awt.event.*;

public class Peliculas extends JFrame {
	
	private JPanel contentPane;
	
	public static void main(String[]args) {
		Peliculas peli = new Peliculas();
		
		
	}

	public Peliculas() {
		
		setTitle("Peliculas");
		setBounds(400,200,600,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel etiqueta = new JLabel("Escribe el título de una película");
		etiqueta.setBounds(80, 60, 200, 20);
		contentPane.add(etiqueta);
		
		JLabel etiqueta2 = new JLabel("Películas");
		etiqueta2.setBounds(300, 60, 200, 20);
		contentPane.add(etiqueta2);
		
		JComboBox jcb1 = new JComboBox();
		jcb1.setBounds(300, 100, 200, 25);
		contentPane.add(jcb1);		
		
		JButton boton1 = new JButton("Añadir");
		boton1.setBounds(80,160,89,23);
		contentPane.add(boton1);
		
		//texto
		JTextField textField = new JTextField();
		textField.setBounds(80,100,186,26);
		contentPane.add(textField);	
				
		boton1.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {				
				jcb1.addItem(textField.getText());
			}
		});
		
		setVisible(true);
		
	}
	

}
