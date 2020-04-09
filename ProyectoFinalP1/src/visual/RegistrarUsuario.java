package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

import logico.Cliente;
import logico.Sistema;
import logico.Usuario;

public class RegistrarUsuario extends JDialog {


	private final JPanel contentPanel = new JPanel();
	private JTextField textNombres;
	private JTextField textApellidos;
	private JTextField textDireccion;
	private JTextField textCorreo;
	private JTextField txtCelular;
	private JTextField textCodigo;
	private JTextField textCedula;
	private JButton BtnTrabajadores = new JButton("Trabajadores\r\n");
	private JButton BtnClientes = new JButton("Clientes");
	private JButton BtnProyectos = new JButton("Proyectos");
	private JTextField txtRegistro;
	private JComboBox cbxGenero;
	private JSpinner spnEdad;
	private boolean flagModifying = false;
	private Cliente cliente;
	private JTextField txtUsuario;
	private JTextField txtContrase�a;


	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the dialog.
	 */
	public RegistrarUsuario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistrarUsuario.class.getResource("/img/icons8_gender_neutral_user_16px.png")));
		setResizable(false);
		setTitle("Registrar usuario");
		setBounds(100, 100, 610, 580);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.inactiveCaptionBorder);
		contentPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.setLayout(null);
		
		//PANEL
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.control);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(0, 0, 604, 551);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		{
			//PANEL
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, null, null), "Datos personales", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(233, 63, 346, 439);
			panel_1.add(panel);
			panel.setLayout(null);
			
			//JLABEL
			
			JLabel lblNombres = new JLabel("Nombres:");
			lblNombres.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblNombres.setBounds(24, 144, 71, 22);
			panel.add(lblNombres);
			
			JLabel lblApellidos = new JLabel("Apellidos:");
			lblApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblApellidos.setBounds(24, 177, 71, 22);
			panel.add(lblApellidos);
			
			JLabel lblCelular = new JLabel("Celular:");
			lblCelular.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCelular.setBounds(191, 243, 71, 22);
			panel.add(lblCelular);
			
			JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
			lblDireccion.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblDireccion.setBounds(24, 210, 71, 22);
			panel.add(lblDireccion);
			
			MaskFormatter formatCedula = null;
			try {
				formatCedula = new MaskFormatter("###-#######-#");
				formatCedula.setPlaceholderCharacter('_');
				textCedula = new JFormattedTextField(formatCedula);				
				textCedula.setToolTipText("Cedula");
			} catch (Exception e) {
				textCedula = new JTextField();
			}
			try {
				textCedula.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(KeyEvent e) {
						if (!(e.getKeyChar() == 13 || (e.getKeyChar() >= 48 && e.getKeyChar()  <= 57))) {
							return;
						} else if (!textCedula.isEditable()) {
							return;
						}
						String cedula = textCedula.getText();
						if (!cedula.contains("_")) {
							textCedula.setEditable(false);
							//stateOfCampos(true);
							cliente = Sistema.getInstance().clienteById(cedula);
							if (cliente != null) {
								//completeInfo();
							} else {
							//	btnEditCedula.setEnabled(true);
							//	btnGuardar.setEnabled(true);
							}
						txtCelular.requestFocus();
						}
					}
				});
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			MaskFormatter formatTelefono = null;
			try {
				formatTelefono = new MaskFormatter("(###) ###-####");
				formatTelefono.setPlaceholderCharacter('_');
				txtCelular = new JFormattedTextField(formatTelefono);
				txtCelular.setToolTipText("Tel\u00E9fono o Celular");
			} catch (Exception e) {
				txtCelular = new JTextField();
			}
			
			
			
			//TXT
			textNombres = new JTextField();
			textNombres.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textNombres.setBackground(SystemColor.menu);
			textNombres.setBounds(92, 146, 224, 20);
			panel.add(textNombres);
			textNombres.setColumns(10);
			
			textApellidos = new JTextField();
			textApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textApellidos.setColumns(10);
			textApellidos.setBackground(SystemColor.menu);
			textApellidos.setBounds(92, 179, 224, 20);
			panel.add(textApellidos);
			
			textDireccion = new JTextField();
			textDireccion.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textDireccion.setColumns(10);
			textDireccion.setBackground(SystemColor.menu);
			textDireccion.setBounds(92, 212, 224, 20);
			panel.add(textDireccion);
			
			
			txtCelular.setBackground(SystemColor.menu);
			txtCelular.setBounds(240, 245, 76, 20);
			panel.add(txtCelular);
			
			
			//JLABEL
			JLabel lblGnero = new JLabel("G\u00E9nero:");
			lblGnero.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblGnero.setBounds(24, 243, 71, 22);
			panel.add(lblGnero);
			
			JLabel lblEdad = new JLabel("Edad:");
			lblEdad.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblEdad.setBounds(24, 309, 71, 22);
			panel.add(lblEdad);
			
			JLabel lblCdula = new JLabel("C\u00E9dula:");
			lblCdula.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCdula.setBounds(154, 92, 71, 22);
			panel.add(lblCdula);
			
			JLabel lblCdigo = new JLabel("C\u00F3digo:");
			lblCdigo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCdigo.setBounds(154, 59, 71, 22);
			panel.add(lblCdigo);
			
			JLabel lblCorreo = new JLabel("Correo:");
			lblCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCorreo.setBounds(24, 276, 71, 22);
			panel.add(lblCorreo);
			
			//TXT
			textCorreo = new JTextField();
			textCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textCorreo.setColumns(10);
			textCorreo.setBackground(SystemColor.menu);
			textCorreo.setBounds(92, 278, 224, 20);
			panel.add(textCorreo);
			
			textCodigo = new JTextField();
			textCodigo.setText("User_1");
			textCodigo.setEditable(false);
			textCodigo.setBackground(SystemColor.menu);
			textCodigo.setBounds(209, 61, 107, 20);
			panel.add(textCodigo);
			textCodigo.setColumns(10);
			
			//CBX
			cbxGenero = new JComboBox();
			cbxGenero.setBackground(SystemColor.menu);
			cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Masculino", "Femenino"}));
			cbxGenero.setEditable(true);
			cbxGenero.setBounds(92, 244, 92, 22);
			panel.add(cbxGenero);
			
			//SPN
			spnEdad = new JSpinner();
			spnEdad.setBackground(SystemColor.menu);
			spnEdad.setModel(new SpinnerNumberModel(18, 18, 60, 1));
			spnEdad.setBounds(92, 311, 76, 20);
			panel.add(spnEdad);
			
			textCedula.setBackground(SystemColor.menu);
			textCedula.setBounds(209, 94, 108, 20);
			panel.add(textCedula);
			
			
			//JLABEL
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_add_image_64px_1.png")));
			lblNewLabel_1.setBounds(28, 33, 92, 78);
			panel.add(lblNewLabel_1);
			
			
			
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label.setBounds(315, 67, 46, 14);
			panel.add(label);
			
			JLabel label_1 = new JLabel("");
			label_1.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_1.setBounds(315, 92, 46, 14);
			panel.add(label_1);
			
			JLabel label_2 = new JLabel("");
			label_2.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_2.setBounds(315, 152, 46, 14);
			panel.add(label_2);
			
			JLabel label_3 = new JLabel("");
			label_3.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_3.setBounds(315, 185, 46, 14);
			panel.add(label_3);
			
			JLabel label_4 = new JLabel("");
			label_4.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_4.setBounds(315, 218, 46, 14);
			panel.add(label_4);
			
			JLabel label_5 = new JLabel("");
			label_5.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_5.setBounds(315, 251, 46, 14);
			panel.add(label_5);
			
			JLabel lblRegistro = new JLabel("Registro\r\n");
			lblRegistro.setBounds(178, 309, 55, 22);
			panel.add(lblRegistro);
			lblRegistro.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			
			//TXT
			txtRegistro = new JTextField();
			txtRegistro.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			txtRegistro.setEditable(false);
			txtRegistro.setBounds(240, 310, 76, 20);
			txtRegistro.setText((new SimpleDateFormat("yyyy/MM/dd")).format(new Date()));
			panel.add(txtRegistro);
			txtRegistro.setColumns(10);
			
			JLabel label_6 = new JLabel("");
			label_6.setBounds(315, 284, 46, 14);
			panel.add(label_6);
			label_6.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(null, "Datos de usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_2.setBounds(10, 350, 326, 78);
			panel.add(panel_2);
			panel_2.setLayout(null);
			
			JLabel lblUsuario = new JLabel("Usuario:");
			lblUsuario.setBounds(10, 11, 71, 22);
			panel_2.add(lblUsuario);
			lblUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			
			txtUsuario = new JTextField();
			txtUsuario.setBounds(90, 13, 222, 20);
			panel_2.add(txtUsuario);
			txtUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			txtUsuario.setColumns(10);
			txtUsuario.setBackground(SystemColor.menu);
			
			JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
			lblContrasea.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblContrasea.setBounds(10, 45, 71, 22);
			panel_2.add(lblContrasea);
			
			txtContrase�a = new JTextField();
			txtContrase�a.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			txtContrase�a.setColumns(10);
			txtContrase�a.setBackground(SystemColor.menu);
			txtContrase�a.setBounds(90, 44, 222, 20);
			panel_2.add(txtContrase�a);
			
			
		}
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Principal", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(10, 73, 208, 463);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		
		//BTN VOLVER A TRABAJADORES
		JButton btnTrabajadoresRegCliente = new JButton("Trabajadores\r\n");
		btnTrabajadoresRegCliente.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/img/icons8_client_company_48px_1.png")));
		btnTrabajadoresRegCliente.setEnabled(false);
		btnTrabajadoresRegCliente.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnTrabajadoresRegCliente.setBounds(10, 70, 189, 89);
		panel_3.add(btnTrabajadoresRegCliente);
		//BTN VOLVER A CLIENTES
		JButton btnClientesRegCliente = new JButton("Clientes");
		btnClientesRegCliente.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/img/icons8_user_group_man_woman_48px.png")));
		btnClientesRegCliente.setEnabled(false);
		btnClientesRegCliente.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnClientesRegCliente.setBounds(10, 157, 189, 89);
		panel_3.add(btnClientesRegCliente);
		
		//BTN VOLVER A PROYECTOS
		JButton btnProyectosRegCliente = new JButton("Proyectos");
		btnProyectosRegCliente.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/img/icons8_group_of_projects_48px.png")));
		btnProyectosRegCliente.setEnabled(false);
		btnProyectosRegCliente.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnProyectosRegCliente.setBounds(10, 241, 189, 89);
		panel_3.add(btnProyectosRegCliente);
		
		
//BTN SALIR
		JButton btnSalirRegCliente = new JButton("Salir");
		btnSalirRegCliente.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/img/icons8_iMac_Exit_24px.png")));
		btnSalirRegCliente.setEnabled(false);
		btnSalirRegCliente.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnSalirRegCliente.setBounds(10, 329, 189, 89);
		panel_3.add(btnSalirRegCliente);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBounds(10, 11, 569, 41);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
//BTN VOLVER
		JButton btnVolver = new JButton("Volver a la principal");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVolver.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/img/icons8_back_16px.png")));
		btnVolver.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnVolver.setBounds(343, 11, 216, 23);
		panel_4.add(btnVolver);
		
		JLabel lbliconoprincipal = new JLabel("");
		lbliconoprincipal.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/img/icons8_link_company_child_16px.png")));
		lbliconoprincipal.setBounds(10, 11, 76, 23);
		panel_4.add(lbliconoprincipal);
		
//BTN CANCELAR
		JButton btnCancelar = new JButton("Cancelar\r\n");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/img/icons8_delete_sign_16px.png")));
		btnCancelar.setHorizontalAlignment(SwingConstants.LEFT);
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnCancelar.setBounds(464, 513, 115, 23);
		panel_1.add(btnCancelar);
		
//BTN GUARDAR
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//CAMBIAR PARA USUARIO, PENDIENTE
				cliente = null;
				if (checkCampos()) {
					boolean registrado = false;
					String codigo = textCodigo.getText();
					String cedula = textCedula.getText();
					String telefono = txtCelular.getText();
					String nombre = textNombres.getText();
					String apellidos = textApellidos.getText();
					String direccion = textDireccion.getText();
					String genero = cbxGenero.getSelectedItem().toString();//problemas aqui
					String correo = textCorreo.getText();
					int edad = Integer.valueOf(spnEdad.getValue().toString());
				
					if (cliente == null) {
						cliente = new Cliente(codigo,cedula,nombre,apellidos,direccion,genero,edad,telefono);
						cliente.setCorreo(correo);
	//storePicture();
						Sistema.getInstance().insertarCliente(cliente);
						registrado = true;
					} else {
						cliente.setNombre(nombre);
						cliente.setApellido(apellidos);
						cliente.setCorreo(correo);
						cliente.setCelular(telefono);
						cliente.setDireccion(direccion);
						cliente.setEdad(44);
						//storePicture();
						registrado = true;
					}
					
					if (registrado && !flagModifying) {
						JOptionPane.showMessageDialog(null, "Operacion Exitosa", "Clientes", JOptionPane.INFORMATION_MESSAGE);
						clear();
					} else if (flagModifying) {
						dispose();
					}
				}
			}
		}
				);

		btnGuardar.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/img/icons8_checkmark_16px.png")));
		btnGuardar.setHorizontalAlignment(SwingConstants.RIGHT);
		btnGuardar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnGuardar.setBounds(356, 513, 103, 23);
		panel_1.add(btnGuardar);
	
//BTN LIMPIAR
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		btnLimpiar.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/img/icons8_broom_16px_1.png")));
		btnLimpiar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnLimpiar.setHorizontalAlignment(SwingConstants.LEFT);
		btnLimpiar.setBounds(243, 513, 103, 23);
		panel_1.add(btnLimpiar);
		

	}
		
		


	
	
	//FUNCIONES
	private boolean checkCampos() {
		boolean validos = false;
		if (cbxGenero.getSelectedIndex() > 0 && Integer.parseInt(spnEdad.getValue().toString()) > 0 ) {
			validos = true;
		} else {
			JOptionPane.showMessageDialog(null, "Revise los campos", "Clientes", JOptionPane.INFORMATION_MESSAGE);
		}
		return validos;
	}

	//FUNCION PARA COMPROBAR LOS DATOS

	/*private boolean verificarInfo() {
		boolean infoCorrecta = false;
	if(textCedula.getText().contains("_") && !textNombres.getText().equalsIgnoreCase("") && !textApellidos.getText().equalsIgnoreCase("") && !txtCelular.getText().contains("_") && !textDireccion.getText().equalsIgnoreCase("") && cbxGenero.getSelectedIndex() > 0 && Integer.parseInt(spnEdad.getValue().toString()) > 0) {
		infoCorrecta = true;
		}
		else {
			JOptionPane.showMessageDialog(null, "Revise los campos", "Clientes", JOptionPane.INFORMATION_MESSAGE);

	}

	return infoCorrecta; }*/



//FUNCION PARA LIMPIAR


private void clear() {
	textCodigo.setText("CL-" + (Sistema.codigoCliente + 1));
	textCedula.setText("");
	txtCelular.setText("");
	textNombres.setText("");
	textApellidos.setText("");
	textDireccion.setText("");
	textCorreo.setText("");
	cbxGenero.setSelectedIndex(0);
	spnEdad.setValue(18);
	txtRegistro.setText((new SimpleDateFormat("yyyy/MM/dd")).format(new Date()));

	
	

}

//FUNCION PARA AJUSTAR IMAGEN

/*
 * 
 private ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
 * 
 * 
 */






}