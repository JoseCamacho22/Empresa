package src;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormRegistro extends JFrame {

	JPanel contentPane;
	JTextField textNik;
	JTextField textNombre;
	JTextField textApel;
	JTextField textEmail;
	JPasswordField textCon;
	JPasswordField passwordField;
	JButton btnNewButton;
	TablaGraphics t;
	/**
	 * Launch the application.
	 */
	///
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormRegistro frame = new FormRegistro();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(188, 143, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNick = new JLabel("Nick");
		lblNick.setFont(new Font("Chalkduster", Font.PLAIN, 13));
		
		textNik = new JTextField();
		textNik.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Chalkduster", Font.PLAIN, 13));
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setFont(new Font("Chalkduster", Font.PLAIN, 13));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Chalkduster", Font.PLAIN, 13));
		
		textApel = new JTextField();
		textApel.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setFont(new Font("Chalkduster", Font.PLAIN, 13));
		
		JLabel lblRepiteContrasea = new JLabel("Repite Contraseña");
		lblRepiteContrasea.setFont(new Font("Chalkduster", Font.PLAIN, 13));
		
		textCon = new JPasswordField();
		
		passwordField = new JPasswordField();
		
		
		
		
		btnNewButton = new JButton("Añadir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t=new TablaGraphics();
				
				//inicializamos la tabla
				DefaultTableModel modelo = (DefaultTableModel) t.getTablePer().getModel();
				//inicializamos el array y le decimos que tiene dos filas
				String[] fila = new String[6];
				//cogemos los datos con el get
				fila[0] = textNik.getText();
				fila[1] = textNombre.getText();
			    fila[2] = textApel.getText();
				fila[3] = textEmail.getText();
			  	fila[4] = passwordField.getText();
			    fila[5] = textCon.getText();
				// y los añadimos a la tabla
				modelo.addRow(fila);
				// le hacemos un set para que esten los campos vacios
				t.getTablePer().setModel(modelo);
				//textClave.setText("");
				//textValor.setText("");
				//controlaceptar();			
				t.setVisible(true);
				FormRegistro.this.dispose();
			}

			
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNick)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(lblEmail)
						.addComponent(lblContrasea)
						.addComponent(lblRepiteContrasea))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(textApel, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(textEmail, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
									.addComponent(textCon, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
									.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
								.addGap(23)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textNik, Alignment.LEADING)
								.addComponent(textNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
							.addGap(23))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(161)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(146, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNick)
						.addComponent(textNik, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(textApel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEmail)
						.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblContrasea)
						.addComponent(textCon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRepiteContrasea))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}



	public JTextField getTextNik() {
		return textNik;
	}

	public void setTextNik(JTextField textNik) {
		this.textNik = textNik;
	}

	public JTextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(JTextField textNombre) {
		this.textNombre = textNombre;
	}

	public JTextField getTextApel() {
		return textApel;
	}

	public void setTextApel(JTextField textApel) {
		this.textApel = textApel;
	}

	public JTextField getTextEmail() {
		return textEmail;
	}

	public void setTextEmail(JTextField textEmail) {
		this.textEmail = textEmail;
	}

	public JPasswordField getTextCon() {
		return textCon;
	}

	public void setTextCon(JPasswordField textCon) {
		this.textCon = textCon;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

}
