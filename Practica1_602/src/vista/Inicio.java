package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Inicio extends JFrame{
	
	private JLabel lblUsuario, lblPass;
	private JTextField tfUsuario;
	private JButton btnAceptar, btnNuevoUsuario;
	private JPasswordField tfPass;
	
	public Inicio() {
		getContentPane().setLayout(null);
        this.setTitle("Bienvenido");
        
        lblUsuario = new JLabel("Nombre de usuario");
    	lblUsuario.setBounds(38, 38, 103, 20);
    	getContentPane().add(lblUsuario);
    	
    	lblPass = new JLabel("Constraseña");
    	lblPass.setBounds(38, 69, 103, 20);
    	getContentPane().add(lblPass);
    	
    	tfUsuario = new JTextField();
    	tfUsuario.setBounds(151, 38, 175, 20);
    	tfUsuario.setColumns(10);
    	getContentPane().add(tfUsuario);
    	
    	tfPass = new JPasswordField();
    	tfPass.setBounds(151, 69, 175, 20);
    	tfPass.setColumns(10);
    	getContentPane().add(tfPass);
    	
    	btnAceptar = new JButton("Aceptar");
    	btnAceptar.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			new Principal().setVisible(true);
    			dispose();
    		}
    	});
    	btnAceptar.setBounds(75, 130, 86, 20);
    	getContentPane().add(btnAceptar);
    	
    	btnNuevoUsuario = new JButton("Nuevo usuario");
    	btnNuevoUsuario.setBounds(197, 130, 103, 20);
    	getContentPane().add(btnNuevoUsuario);
    	
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.setSize(350, 200);
    	this.setResizable(false);
    	
        
/*
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfUsuario)
                            .addComponent(tfPass, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevoUsuario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnNuevoUsuario))
                .addContainerGap(20, Short.MAX_VALUE))
        );*/
    }
}
