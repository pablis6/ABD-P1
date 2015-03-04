package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal extends JFrame{
	private JTable table;
	public Principal() {
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.setSize(370, 460);
    	this.setResizable(false);
		
		JLabel lblNick = new JLabel("New label");
		lblNick.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNick.setHorizontalAlignment(SwingConstants.CENTER);
		lblNick.setBounds(93, 11, 178, 14);
		getContentPane().add(lblNick);
		
		JLabel lblAnios = new JLabel("New label");
		lblAnios.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnios.setBounds(93, 36, 178, 14);
		getContentPane().add(lblAnios);
		
		JLabel lblPuntos = new JLabel("New label");
		lblPuntos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPuntos.setForeground(Color.ORANGE);
		lblPuntos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntos.setBounds(93, 61, 178, 14);
		getContentPane().add(lblPuntos);
		
		JLabel lblAvatar = new JLabel("New label");
		lblAvatar.setBounds(35, 11, 50, 64);
		getContentPane().add(lblAvatar);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 86, 344, 335);
		getContentPane().add(tabbedPane);
		
		JPanel tabCrucigrama = new JPanel();
		tabbedPane.addTab("Crucigrama", null, tabCrucigrama, null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Título", "Fecha"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tabCrucigrama.add(table);
		
		JPanel tabAmigos = new JPanel();
		tabbedPane.addTab("Amigos", null, tabAmigos, null);
		
		JPanel tabPeticiones = new JPanel();
		tabbedPane.addTab("Peticiones de ayuda", null, tabPeticiones, null);
	}
}
