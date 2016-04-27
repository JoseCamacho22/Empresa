package src;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class VentanaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textUser;
	private JButton btnLogIn;
	private JButton btnSignIn;
	private JButton btnLogOut;
	private JPasswordField textPass;
	/**
	 * Launch the application.
	 */
	//
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
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
	public VentanaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(188, 143, 143));
		contentPane.setForeground(new Color(139, 69, 19));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Chalkduster", Font.PLAIN, 13));
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Chalkduster", Font.PLAIN, 13));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Chalkduster", Font.PLAIN, 13));
		
		textUser = new JTextField();
		textUser.setForeground(new Color(192, 192, 192));
		textUser.setColumns(10);
		
		btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=textUser.getText();
				String pass=textPass.getText();
				if(user.equals(pass)){
							FormRegistro f=new FormRegistro();
							f.setVisible(true);
							VentanaLogin.this.dispose();
						}else{
							JOptionPane.showMessageDialog(null,"Vuelva a loguearse");
						}				

			}

			
		});
		btnLogIn.setBackground(new Color(169, 169, 169));
		
		btnSignIn = new JButton("Sign In");
		
		btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		textPass = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(180, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(182))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUsername)
						.addComponent(lblPassword))
					.addPreferredGap(ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textPass)
						.addComponent(textUser))
					.addContainerGap(89, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(btnLogIn)
					.addGap(36)
					.addComponent(btnSignIn)
					.addGap(41)
					.addComponent(btnLogOut)
					.addContainerGap(78, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsername)
						.addComponent(textUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(textPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogIn)
						.addComponent(btnSignIn)
						.addComponent(btnLogOut))
					.addGap(19))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
