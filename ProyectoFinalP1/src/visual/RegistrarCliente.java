package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class RegistrarCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textNombres;
	private JTextField textApellidos;
	private JTextField textDireccion;
	private JTextField textCorreo;
	private JTextField textCodigo;
	private JTextField textSalario;
	private JButton BtnTrabajadores = new JButton("Trabajadores\r\n");
	private JButton BtnClientes = new JButton("Clientes");
	private JButton BtnProyectos = new JButton("Proyectos");
	private JTextField txtRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarCliente dialog = new RegistrarCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarCliente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistrarCliente.class.getResource("/img/icons8_add_user_male_64px.png")));
		setResizable(false);
		setTitle("Registrar cliente");
		setBounds(100, 100, 545, 580);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.LIGHT_GRAY);
		contentPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		contentPanel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.control);
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(0, 0, 532, 543);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, null, null), "Datos personales", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(181, 63, 346, 342);
			panel_1.add(panel);
			panel.setLayout(null);
			
			
			
			JLabel lblNewLabel = new JLabel("Nombres:");
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblNewLabel.setBounds(10, 144, 71, 22);
			panel.add(lblNewLabel);
			
			JLabel lblApellidos = new JLabel("Apellidos:");
			lblApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblApellidos.setBounds(10, 177, 71, 22);
			panel.add(lblApellidos);
			
			JLabel lblCelular = new JLabel("Celular:");
			lblCelular.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCelular.setBounds(178, 243, 71, 22);
			panel.add(lblCelular);
			
			JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
			lblDireccin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblDireccin.setBounds(10, 210, 71, 22);
			panel.add(lblDireccin);
			
			textNombres = new JTextField();
			textNombres.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textNombres.setBackground(SystemColor.menu);
			textNombres.setBounds(76, 146, 224, 20);
			panel.add(textNombres);
			textNombres.setColumns(10);
			
			textApellidos = new JTextField();
			textApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textApellidos.setColumns(10);
			textApellidos.setBackground(SystemColor.menu);
			textApellidos.setBounds(76, 179, 224, 20);
			panel.add(textApellidos);
			
			textDireccion = new JTextField();
			textDireccion.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textDireccion.setColumns(10);
			textDireccion.setBackground(SystemColor.menu);
			textDireccion.setBounds(76, 212, 224, 20);
			panel.add(textDireccion);
			
			JFormattedTextField txtCelular = new JFormattedTextField();
			txtCelular.setBackground(SystemColor.menu);
			txtCelular.setBounds(224, 245, 76, 20);
			panel.add(txtCelular);
			
			JLabel lblGnero = new JLabel("G\u00E9nero:");
			lblGnero.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblGnero.setBounds(10, 243, 71, 22);
			panel.add(lblGnero);
			
			JLabel lblEdad = new JLabel("Edad:");
			lblEdad.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblEdad.setBounds(10, 309, 71, 22);
			panel.add(lblEdad);
			
			JLabel lblCdula = new JLabel("C\u00E9dula:");
			lblCdula.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCdula.setBounds(139, 92, 71, 22);
			panel.add(lblCdula);
			
			JLabel lblCdigo = new JLabel("C\u00F3digo:");
			lblCdigo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCdigo.setBounds(139, 59, 71, 22);
			panel.add(lblCdigo);
			
			JLabel lblCorreo = new JLabel("Correo:");
			lblCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCorreo.setBounds(10, 276, 71, 22);
			panel.add(lblCorreo);
			
			textCorreo = new JTextField();
			textCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textCorreo.setColumns(10);
			textCorreo.setBackground(SystemColor.menu);
			textCorreo.setBounds(76, 278, 224, 20);
			panel.add(textCorreo);
			
			textCodigo = new JTextField();
			textCodigo.setText("Cliente_1");
			textCodigo.setEditable(false);
			textCodigo.setBackground(SystemColor.menu);
			textCodigo.setBounds(192, 61, 107, 20);
			panel.add(textCodigo);
			textCodigo.setColumns(10);
			
			JComboBox cbxGenero = new JComboBox();
			cbxGenero.setBackground(SystemColor.menu);
			cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Masculino", "Femenino"}));
			cbxGenero.setEditable(true);
			cbxGenero.setBounds(76, 244, 92, 22);
			panel.add(cbxGenero);
			
			JSpinner spnEdad = new JSpinner();
			spnEdad.setBackground(SystemColor.menu);
			spnEdad.setModel(new SpinnerNumberModel(18, 18, 60, 1));
			spnEdad.setBounds(76, 311, 92, 20);
			panel.add(spnEdad);
			
			JFormattedTextField formattedTextField = new JFormattedTextField();
			formattedTextField.setBackground(SystemColor.menu);
			formattedTextField.setBounds(192, 94, 108, 20);
			panel.add(formattedTextField);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_add_image_64px_1.png")));
			lblNewLabel_1.setBounds(28, 33, 92, 78);
			panel.add(lblNewLabel_1);
			
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label.setBounds(300, 67, 46, 14);
			panel.add(label);
			
			JLabel label_1 = new JLabel("");
			label_1.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_1.setBounds(300, 95, 46, 14);
			panel.add(label_1);
			
			JLabel label_2 = new JLabel("");
			label_2.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_2.setBounds(300, 152, 46, 14);
			panel.add(label_2);
			
			JLabel label_3 = new JLabel("");
			label_3.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_3.setBounds(300, 185, 46, 14);
			panel.add(label_3);
			
			JLabel label_4 = new JLabel("");
			label_4.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_4.setBounds(300, 218, 46, 14);
			panel.add(label_4);
			
			JLabel label_5 = new JLabel("");
			label_5.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_5.setBounds(300, 251, 46, 14);
			panel.add(label_5);
			
			JLabel lblRegistro = new JLabel("Registro\r\n");
			lblRegistro.setBounds(170, 309, 55, 22);
			panel.add(lblRegistro);
			lblRegistro.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			
			txtRegistro = new JTextField();
			txtRegistro.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			txtRegistro.setEditable(false);
			txtRegistro.setBounds(226, 311, 76, 20);
			txtRegistro.setText((new SimpleDateFormat("yyyy/MM/dd")).format(new Date()));
			panel.add(txtRegistro);
			txtRegistro.setColumns(10);
			
			JLabel label_6 = new JLabel("");
			label_6.setBounds(300, 276, 46, 14);
			panel.add(label_6);
			label_6.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			
			
		}
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Proyectos", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(181, 407, 346, 104);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setBounds(9, 116, 71, 22);
		panel.add(lblSalario);
		lblSalario.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		textSalario = new JTextField();
		textSalario.setBackground(SystemColor.menu);
		textSalario.setBounds(76, 118, 86, 20);
		panel.add(textSalario);
		textSalario.setColumns(10);
		
		JLabel labelCantidadProyectos = new JLabel("Cantidad de proyectos\r\n");
		labelCantidadProyectos.setHorizontalAlignment(SwingConstants.CENTER);
		labelCantidadProyectos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		labelCantidadProyectos.setBounds(9, 29, 153, 22);
		panel.add(labelCantidadProyectos);
		
		JLabel labelCantidadContratos = new JLabel("Cantidad de contratos\r\n\r\n");
		labelCantidadContratos.setHorizontalAlignment(SwingConstants.CENTER);
		labelCantidadContratos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		labelCantidadContratos.setBounds(172, 29, 153, 22);
		panel.add(labelCantidadContratos);
		
		JSpinner spnCantidadProyectos = new JSpinner();
		spnCantidadProyectos.setModel(new SpinnerNumberModel(0, null, 5, 1));
		spnCantidadProyectos.setBounds(76, 56, 30, 20);
		panel.add(spnCantidadProyectos);
		
		JSpinner spnCantidadContratos = new JSpinner();
		spnCantidadContratos.setModel(new SpinnerNumberModel(0, null, 5, 1));
		spnCantidadContratos.setBounds(240, 56, 30, 20);
		panel.add(spnCantidadContratos);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBounds(10, 63, 161, 473);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnTrabajadores = new JButton("\r\n\r\n\r\n\r\nTrabajadores");
		btnTrabajadores.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnTrabajadores.setEnabled(false);
		btnTrabajadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTrabajadores.setBounds(0, 115, 161, 92);
		panel_3.add(btnTrabajadores);
		
		JButton btnClientes = new JButton("Clientes\r\n");
		btnClientes.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnClientes.setEnabled(false);
		btnClientes.setBounds(0, 207, 161, 92);
		panel_3.add(btnClientes);
		
		JButton btnProyectos = new JButton("Proyectos");
		btnProyectos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnProyectos.setEnabled(false);
		btnProyectos.setBounds(0, 298, 161, 92);
		panel_3.add(btnProyectos);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBounds(10, 11, 512, 41);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnSalir = new JButton("Salir\r\n");
		btnSalir.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_multiply_16px.png")));
		btnSalir.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSalir.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnSalir.setBounds(420, 11, 82, 23);
		panel_4.add(btnSalir);
		
		JButton btnCancelar = new JButton("Cancelar\r\n");
		btnCancelar.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/img/icons8_delete_sign_16px.png")));
		btnCancelar.setHorizontalAlignment(SwingConstants.LEFT);
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnCancelar.setBounds(407, 513, 115, 23);
		panel_1.add(btnCancelar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/img/icons8_checkmark_16px.png")));
		btnGuardar.setHorizontalAlignment(SwingConstants.RIGHT);
		btnGuardar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnGuardar.setBounds(299, 513, 103, 23);
		panel_1.add(btnGuardar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/img/icons8_broom_16px_1.png")));
		btnLimpiar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnLimpiar.setHorizontalAlignment(SwingConstants.LEFT);
		btnLimpiar.setBounds(191, 513, 103, 23);
		panel_1.add(btnLimpiar);
		
				
		
	}
}
