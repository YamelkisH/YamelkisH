package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;

public class RegistrarProyecto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textNombres;
	private JTextField textApellidos;
	private JTextField textDireccion;
	private JTextField textCodigo;
	private JTextField txtFechaInicio;
	private JLabel lblRegistro;
	private JTextField txtFechaFin;
	private JTextField textField;
	private JTextField txtCodigo;
	private JTextField txtCodigocontrato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarProyecto dialog = new RegistrarProyecto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarProyecto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistrarProyecto.class.getResource("/img/icons8_new_copy_40px.png")));
		setResizable(false);
		setTitle("Registrar proyecto");
		setBounds(100, 100, 545, 630);
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
		panel_1.setBounds(0, 0, 532, 600);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBounds(10, 11, 512, 578);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnRegistrarTrabajador = new JButton("Registrar ");
		btnRegistrarTrabajador.setHorizontalAlignment(SwingConstants.LEFT);
		btnRegistrarTrabajador.setBounds(265, 544, 132, 23);
		panel_4.add(btnRegistrarTrabajador);
		btnRegistrarTrabajador.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_checkmark_16px.png")));
		btnRegistrarTrabajador.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JButton btnSalir = new JButton("Salir\r\n");
		btnSalir.setBounds(397, 544, 102, 23);
		panel_4.add(btnSalir);
		btnSalir.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_multiply_16px.png")));
		btnSalir.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		{
			JPanel panel_3 = new JPanel();
			panel_3.setBounds(10, 11, 489, 270);
			panel_4.add(panel_3);
			panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, null, null), "Informaci\u00F3n del cliente", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_3.setLayout(null);
			
			
			
			JLabel lblNewLabel = new JLabel("Nombres:");
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblNewLabel.setBounds(10, 90, 71, 22);
			panel_3.add(lblNewLabel);
			
			JLabel lblApellidos = new JLabel("Apellidos:");
			lblApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblApellidos.setBounds(10, 123, 71, 22);
			panel_3.add(lblApellidos);
			
			JLabel lblCelular = new JLabel("Celular:");
			lblCelular.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCelular.setBounds(278, 189, 71, 22);
			panel_3.add(lblCelular);
			
			JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
			lblDireccin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblDireccin.setBounds(10, 156, 71, 22);
			panel_3.add(lblDireccin);
			
			textNombres = new JTextField();
			textNombres.setEditable(false);
			textNombres.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textNombres.setBackground(SystemColor.menu);
			textNombres.setBounds(76, 92, 387, 20);
			panel_3.add(textNombres);
			textNombres.setColumns(10);
			
			textApellidos = new JTextField();
			textApellidos.setEditable(false);
			textApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textApellidos.setColumns(10);
			textApellidos.setBackground(SystemColor.menu);
			textApellidos.setBounds(76, 123, 387, 20);
			panel_3.add(textApellidos);
			
			textDireccion = new JTextField();
			textDireccion.setEditable(false);
			textDireccion.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textDireccion.setColumns(10);
			textDireccion.setBackground(SystemColor.menu);
			textDireccion.setBounds(76, 154, 387, 20);
			panel_3.add(textDireccion);
			
			JFormattedTextField txtCelular = new JFormattedTextField();
			txtCelular.setEditable(false);
			txtCelular.setBackground(SystemColor.menu);
			txtCelular.setBounds(332, 191, 131, 20);
			panel_3.add(txtCelular);
			
			JLabel lblGnero = new JLabel("G\u00E9nero:");
			lblGnero.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblGnero.setBounds(10, 189, 71, 22);
			panel_3.add(lblGnero);
			
			JLabel lblEdad = new JLabel("Edad:");
			lblEdad.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblEdad.setBounds(10, 222, 71, 22);
			panel_3.add(lblEdad);
			
			JLabel lblCdula = new JLabel("C\u00E9dula:");
			lblCdula.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCdula.setBounds(10, 28, 71, 22);
			panel_3.add(lblCdula);
			
			textCodigo = new JTextField();
			textCodigo.setHorizontalAlignment(SwingConstants.CENTER);
			textCodigo.setText("Cliente_1");
			textCodigo.setEditable(false);
			textCodigo.setBackground(SystemColor.menu);
			textCodigo.setBounds(76, 61, 172, 20);
			panel_3.add(textCodigo);
			textCodigo.setColumns(10);
			
			JComboBox cbxGenero = new JComboBox();
			cbxGenero.setBackground(SystemColor.menu);
			cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Masculino", "Femenino"}));
			cbxGenero.setBounds(76, 189, 172, 22);
			panel_3.add(cbxGenero);
			
			JSpinner spnEdad = new JSpinner();
			spnEdad.setEnabled(false);
			spnEdad.setBackground(SystemColor.menu);
			spnEdad.setModel(new SpinnerNumberModel(18, 18, 60, 1));
			spnEdad.setBounds(76, 224, 39, 20);
			panel_3.add(spnEdad);
			
			JFormattedTextField txtCedula = new JFormattedTextField();
			txtCedula.setBackground(SystemColor.menu);
			txtCedula.setBounds(76, 30, 172, 20);
			panel_3.add(txtCedula);
			
			JLabel label_1 = new JLabel("");
			label_1.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_1.setBounds(245, 36, 46, 14);
			panel_3.add(label_1);
			
			JLabel label_2 = new JLabel("");
			label_2.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_2.setBounds(463, 123, 46, 14);
			panel_3.add(label_2);
			
			JLabel label_3 = new JLabel("");
			label_3.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_3.setBounds(463, 156, 46, 14);
			panel_3.add(label_3);
			
			JLabel label_4 = new JLabel("");
			label_4.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_4.setBounds(463, 189, 46, 14);
			panel_3.add(label_4);
			
			JLabel label_5 = new JLabel("");
			label_5.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_5.setBounds(463, 98, 46, 14);
			panel_3.add(label_5);
			
			JLabel lblimagen = new JLabel("");
			lblimagen.setIcon(new ImageIcon(RegistrarProyecto.class.getResource("/img/icons8_add_image_64px_1.png")));
			lblimagen.setBounds(408, 11, 71, 64);
			panel_3.add(lblimagen);
			
			JButton btnNewButton = new JButton("Buscar");
			btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			btnNewButton.setIcon(new ImageIcon(RegistrarProyecto.class.getResource("/img/icons8_search_16px.png")));
			btnNewButton.setBounds(274, 28, 107, 23);
			panel_3.add(btnNewButton);
			
			JLabel lblCdigo = new JLabel("C\u00F3digo:");
			lblCdigo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCdigo.setBounds(10, 61, 71, 22);
			panel_3.add(lblCdigo);
			
			lblRegistro = new JLabel("Registro:");
			lblRegistro.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblRegistro.setBounds(278, 227, 58, 17);
			panel_3.add(lblRegistro);
			
			JFormattedTextField txtRegistro = new JFormattedTextField();
			txtRegistro.setHorizontalAlignment(SwingConstants.CENTER);
			txtRegistro.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			txtRegistro.setEditable(false);
			txtRegistro.setBackground(SystemColor.menu);
			txtRegistro.setBounds(332, 224, 131, 20);
			txtRegistro.setText((new SimpleDateFormat("yyyy/MM/dd")).format(new Date()));
			panel_3.add(txtRegistro);
			
			
			

			
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 281, 489, 190);
		panel_4.add(panel);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Informacion del proyecto", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setLayout(null);
		
		txtFechaInicio = new JTextField();
		txtFechaInicio.setBackground(SystemColor.menu);
		txtFechaInicio.setBounds(118, 40, 132, 20);
		panel.add(txtFechaInicio);
		txtFechaInicio.setColumns(10);
		
		JLabel lblFechaInicio = new JLabel("Fecha de inicio:");
		lblFechaInicio.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblFechaInicio.setBounds(9, 38, 99, 22);
		panel.add(lblFechaInicio);
		
		JLabel lblTipodeProyecto = new JLabel("Tipo de software");
		lblTipodeProyecto.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTipodeProyecto.setBounds(9, 71, 132, 22);
		panel.add(lblTipodeProyecto);
		
		JComboBox cbxTipodeProyecto = new JComboBox();
		cbxTipodeProyecto.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		cbxTipodeProyecto.setBackground(SystemColor.menu);
		cbxTipodeProyecto.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Software de sistema", "Software de programaci\u00F3n", "Software de aplicaci\u00F3n"}));
		cbxTipodeProyecto.setEditable(true);
		cbxTipodeProyecto.setBounds(118, 71, 132, 22);
		panel.add(cbxTipodeProyecto);
		
		JLabel lblFechaFin = new JLabel("Fecha fin:");
		lblFechaFin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblFechaFin.setBounds(273, 38, 99, 22);
		panel.add(lblFechaFin);
		
		txtFechaFin = new JTextField();
		txtFechaFin.setColumns(10);
		txtFechaFin.setBackground(SystemColor.menu);
		txtFechaFin.setBounds(334, 40, 128, 20);
		panel.add(txtFechaFin);
		
		JLabel labelCodigo = new JLabel("C\u00F3digo de proyecto:");
		labelCodigo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		labelCodigo.setBounds(240, 157, 132, 22);
		panel.add(labelCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtCodigo.setEnabled(false);
		txtCodigo.setText("Proyecto_1");
		txtCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		txtCodigo.setEditable(false);
		txtCodigo.setColumns(10);
		txtCodigo.setBackground(SystemColor.menu);
		txtCodigo.setBounds(363, 157, 99, 22);
		panel.add(txtCodigo);
		
		JLabel labelCodigoContrato = new JLabel("C\u00F3digo de contrato");
		labelCodigoContrato.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		labelCodigoContrato.setBounds(9, 157, 132, 22);
		panel.add(labelCodigoContrato);
		
		JButton btnNewButton_1 = new JButton("Generar contrato");
		btnNewButton_1.setIcon(new ImageIcon(RegistrarProyecto.class.getResource("/img/icons8_agreement_16px.png")));
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBounds(160, 109, 167, 23);
		panel.add(btnNewButton_1);
		
		txtCodigocontrato = new JTextField();
		txtCodigocontrato.setEnabled(false);
		txtCodigocontrato.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		txtCodigocontrato.setText("Contrato_1");
		txtCodigocontrato.setHorizontalAlignment(SwingConstants.CENTER);
		txtCodigocontrato.setEditable(false);
		txtCodigocontrato.setColumns(10);
		txtCodigocontrato.setBackground(SystemColor.menu);
		txtCodigocontrato.setBounds(130, 157, 100, 22);
		panel.add(txtCodigocontrato);
		
		JLabel labelLenguaje = new JLabel("Lenguaje");
		labelLenguaje.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		labelLenguaje.setBounds(273, 71, 68, 22);
		panel.add(labelLenguaje);
		
		JComboBox cbxLenguaje = new JComboBox();
		cbxLenguaje.setEditable(true);
		cbxLenguaje.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "C++", "C", "Python", "Java", "C#", "Delphi", "PHP"}));
		cbxLenguaje.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		cbxLenguaje.setBackground(SystemColor.menu);
		cbxLenguaje.setBounds(330, 71, 132, 22);
		panel.add(cbxLenguaje);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Cargos", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 471, 489, 60);
		panel_4.add(panel_2);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(347, 23, 132, 20);
		panel_2.add(textField);
		
		JLabel labelTotal = new JLabel("Total");
		labelTotal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		labelTotal.setBounds(297, 21, 40, 22);
		panel_2.add(labelTotal);
		
		JLabel label_1 = new JLabel("Tipo de software");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_1.setBounds(9, 103, 132, 22);
		panel_2.add(label_1);
		
	/*	JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox.setEditable(true);
		comboBox.setBackground(SystemColor.menu);
		comboBox.setBounds(118, 103, 109, 22);
		panel_2.add(comboBox);
		*/
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(158, 544, 108, 23);
		panel_4.add(btnLimpiar);
		btnLimpiar.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/img/icons8_broom_16px_1.png")));
		btnLimpiar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnLimpiar.setHorizontalAlignment(SwingConstants.LEFT);

	}
}
