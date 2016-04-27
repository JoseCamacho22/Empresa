package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TablaGraphics extends JFrame {

	private JPanel contentPane;
	private JTable tablePer;
	FormRegistro f;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TablaGraphics frame = new TablaGraphics();
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
	public TablaGraphics() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 550, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(188, 143, 143));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnBorrar = new JButton("Borrar");
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel modelo = (DefaultTableModel) tablePer.getModel();
				tablePer.setValueAt(f.textNombre.getText(),tablePer.getSelectedRow(), 0);
				tablePer.setValueAt(f.textApel.getText(), tablePer.getSelectedRow(), 1);
			}
		});
		
		JButton btnAadir = new JButton("Añadir");
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//inicializamos la tabla
				
				//textClave.setText("");
				//textValor.setText("");
				//controlaceptar();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNombre = new JLabel("Nombre");
		
		JLabel lblApellido = new JLabel("Apellido");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(48)
							.addComponent(btnAadir, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(btnModificar)
							.addGap(18)
							.addComponent(btnBorrar, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(58)
							.addComponent(lblNombre)
							.addGap(160)
							.addComponent(lblApellido))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(29)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(73)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 383, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(128, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(15)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(lblApellido))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAadir)
						.addComponent(btnModificar)
						.addComponent(btnBorrar))
					.addContainerGap())
		);
		
		tablePer = new JTable();
		tablePer.setModel(new DefaultTableModel(new Object [][]{
		}, new String []{
				"Nick","Nombre","Apellido","Email","Contraseña","Repeat"
		}));
				
				
				
		scrollPane.setViewportView(tablePer);
		contentPane.setLayout(gl_contentPane);
	
	}

	public JTable getTablePer() {
		return tablePer;
	}

	public void setTablePer(JTable tablePer) {
		this.tablePer = tablePer;
	}
}
