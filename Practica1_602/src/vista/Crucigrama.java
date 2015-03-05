package vista;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Crucigrama extends JFrame{
	private JTextField tfPalabra;

	public Crucigrama() {

		getContentPane().setLayout(null);
		
		JLabel lblNumLetras = new JLabel("New label");
		lblNumLetras.setBounds(10, 407, 46, 14);
		getContentPane().add(lblNumLetras);
		
		tfPalabra = new JTextField();
		tfPalabra.setBounds(66, 404, 86, 20);
		getContentPane().add(tfPalabra);
		tfPalabra.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(162, 403, 71, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnEnviar = new JButton("Enviar a amigo");
		btnEnviar.setBounds(243, 403, 107, 23);
		getContentPane().add(btnEnviar);
		
		JLabel lblImagen = new JLabel("New label");
		lblImagen.setBounds(10, 331, 46, 14);
		getContentPane().add(lblImagen);
		
		JTextArea taEnunciado = new JTextArea();
		taEnunciado.setEditable(false);
		taEnunciado.setBounds(66, 326, 288, 67);
		getContentPane().add(taEnunciado);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(370, 460);
		this.setResizable(false);
	}
}
