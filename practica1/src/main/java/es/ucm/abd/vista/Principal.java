package es.ucm.abd.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;

public class Principal extends JFrame{
	private static DefaultTableModel tableModel;
	private JTable table;
	private JLabel lblNick, lblAnios, lblPuntos, lblAvatar;
	private JTabbedPane tabbedPane;
	private JPanel tabCrucigrama, tabAmigos, tabPeticiones;
	private Object[][] contenido;
	private String[] nombreColumnas;
	private JScrollPane sc;
	private JButton btnAniadir;
	private JButton btnEliminar;
	private JButton btnDescartar;
	
	public Principal() {
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.setSize(370, 460);
    	this.setResizable(false);
		
		lblNick = new JLabel("New label");
		lblNick.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNick.setHorizontalAlignment(SwingConstants.CENTER);
		lblNick.setBounds(93, 11, 178, 14);
		getContentPane().add(lblNick);
		
		lblAnios = new JLabel("New label");
		lblAnios.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnios.setBounds(93, 36, 178, 14);
		getContentPane().add(lblAnios);
		
		lblPuntos = new JLabel("New label");
		lblPuntos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPuntos.setForeground(Color.ORANGE);
		lblPuntos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntos.setBounds(93, 61, 178, 14);
		getContentPane().add(lblPuntos);
		
		lblAvatar = new JLabel("New label");
		lblAvatar.setBounds(35, 11, 50, 64);
		getContentPane().add(lblAvatar);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 86, 344, 335);
		getContentPane().add(tabbedPane);
		
		tabCrucigrama = new JPanel();
		tabbedPane.addTab("Crucigrama", null, tabCrucigrama, null);
		
		JButton btnAbrir = new JButton("Abrir crucigrama");
		tabCrucigrama.add(btnAbrir);
		
		JButton btnBusqueda = new JButton("busqueda de crucigramas");
		tabCrucigrama.add(btnBusqueda);
		
		tabPeticiones = new JPanel();
		tabbedPane.addTab("Peticiones de ayuda", null, tabPeticiones, null);
		
		JButton btnAceptar = new JButton("Abrir crucigrama");
		tabPeticiones.add(btnAceptar);
		
		btnDescartar = new JButton("Descartar peticion");
		tabPeticiones.add(btnDescartar);
		
		tabAmigos = new JPanel();
		tabbedPane.addTab("Amigos", null, tabAmigos, null);
		
		btnAniadir = new JButton("Añadir amigo");
		tabAmigos.add(btnAniadir);
		
		btnEliminar = new JButton("Eliminar");
		tabAmigos.add(btnEliminar);
	}
}
