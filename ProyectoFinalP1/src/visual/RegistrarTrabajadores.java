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
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;


//thepackagename.TheClassName
public class RegistrarTrabajadores extends JDialog {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarTrabajadores dialog = new RegistrarTrabajadores();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarTrabajadores() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistrarTrabajadores.class.getResource("/img/add_user_group_woman_man_48px.png")));
		setResizable(false);
		setTitle("Registrar trabajador");
		setBounds(100, 100, 597, 615);
		//100, 100, 610, 580
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
		panel_1.setBounds(0, 0, 591, 600);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, null, null), "Datos personales", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(229, 63, 346, 252);
			panel_1.add(panel);
			panel.setLayout(null);
			
			
			
			JLabel lblNewLabel = new JLabel("Nombres:");
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblNewLabel.setBounds(10, 90, 71, 22);
			panel.add(lblNewLabel);
			
			JLabel lblApellidos = new JLabel("Apellidos:");
			lblApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblApellidos.setBounds(10, 123, 71, 22);
			panel.add(lblApellidos);
			
			JLabel lblCelular = new JLabel("Celular:");
			lblCelular.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCelular.setBounds(178, 189, 71, 22);
			panel.add(lblCelular);
			
			JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
			lblDireccin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblDireccin.setBounds(10, 156, 71, 22);
			panel.add(lblDireccin);
			
			textNombres = new JTextField();
			textNombres.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textNombres.setBackground(SystemColor.menu);
			textNombres.setBounds(76, 92, 224, 20);
			panel.add(textNombres);
			textNombres.setColumns(10);
			
			textApellidos = new JTextField();
			textApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textApellidos.setColumns(10);
			textApellidos.setBackground(SystemColor.menu);
			textApellidos.setBounds(76, 123, 224, 20);
			panel.add(textApellidos);
			
			textDireccion = new JTextField();
			textDireccion.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textDireccion.setColumns(10);
			textDireccion.setBackground(SystemColor.menu);
			textDireccion.setBounds(76, 154, 224, 20);
			panel.add(textDireccion);
			
			JFormattedTextField txtCelular = new JFormattedTextField();
			txtCelular.setBackground(SystemColor.menu);
			txtCelular.setBounds(226, 191, 76, 20);
			panel.add(txtCelular);
			
			JLabel lblGnero = new JLabel("G\u00E9nero:");
			lblGnero.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblGnero.setBounds(10, 189, 71, 22);
			panel.add(lblGnero);
			
			JLabel lblEdad = new JLabel("Edad:");
			lblEdad.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblEdad.setBounds(10, 222, 71, 22);
			panel.add(lblEdad);
			
			JLabel lblCdula = new JLabel("C\u00E9dula:");
			lblCdula.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCdula.setBounds(178, 222, 71, 22);
			panel.add(lblCdula);
			
			JLabel lblCdigo = new JLabel("C\u00F3digo:");
			lblCdigo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCdigo.setBounds(139, 28, 71, 22);
			panel.add(lblCdigo);
			
			JLabel lblCorreo = new JLabel("Correo:");
			lblCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCorreo.setBounds(139, 59, 71, 22);
			panel.add(lblCorreo);
			
			textCorreo = new JTextField();
			textCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textCorreo.setColumns(10);
			textCorreo.setBackground(SystemColor.menu);
			textCorreo.setBounds(192, 61, 107, 20);
			panel.add(textCorreo);
			
			textCodigo = new JTextField();
			textCodigo.setText("   Trabajador_1");
			textCodigo.setEditable(false);
			textCodigo.setBackground(SystemColor.menu);
			textCodigo.setBounds(192, 30, 107, 20);
			panel.add(textCodigo);
			textCodigo.setColumns(10);
			
			JComboBox cbxGenero = new JComboBox();
			cbxGenero.setBackground(SystemColor.menu);
			cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Masculino", "Femenino"}));
			cbxGenero.setEditable(true);
			cbxGenero.setBounds(76, 189, 101, 22);
			panel.add(cbxGenero);
			
			JSpinner spnEdad = new JSpinner();
			spnEdad.setBackground(SystemColor.menu);
			spnEdad.setModel(new SpinnerNumberModel(18, 18, 60, 1));
			spnEdad.setBounds(76, 222, 101, 20);
			panel.add(spnEdad);
			
			JFormattedTextField formattedTextField = new JFormattedTextField();
			formattedTextField.setBackground(SystemColor.menu);
			formattedTextField.setBounds(226, 222, 74, 20);
			panel.add(formattedTextField);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_add_image_64px_1.png")));
			lblNewLabel_1.setBounds(45, 11, 83, 78);
			panel.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			lblNewLabel_2.setBounds(300, 33, 46, 14);
			panel.add(lblNewLabel_2);
			
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
			label_2.setBounds(300, 128, 46, 14);
			panel.add(label_2);
			
			JLabel label_3 = new JLabel("");
			label_3.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_3.setBounds(300, 156, 46, 14);
			panel.add(label_3);
			
			JLabel label_4 = new JLabel("");
			label_4.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_4.setBounds(300, 194, 46, 14);
			panel.add(label_4);
			
			JLabel label_5 = new JLabel("");
			label_5.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
			label_5.setBounds(300, 227, 46, 14);
			panel.add(label_5);
			
			
			

			
		}
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos laborales", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(229, 326, 346, 111);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setBounds(9, 70, 71, 22);
		panel.add(lblSalario);
		lblSalario.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		textSalario = new JTextField();
		textSalario.setBackground(SystemColor.menu);
		textSalario.setBounds(76, 72, 99, 20);
		panel.add(textSalario);
		textSalario.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCargo.setBounds(9, 37, 71, 22);
		panel.add(lblCargo);
		
		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEspecialidad.setBounds(230, 37, 99, 22);
		panel.add(lblEspecialidad);
		
		JComboBox cbxEspecialidad = new JComboBox();
		cbxEspecialidad.setBackground(SystemColor.menu);
		cbxEspecialidad.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Dise\u00F1ador", "Planificador", "Programador"}));
		cbxEspecialidad.setEditable(true);
		cbxEspecialidad.setBounds(204, 59, 132, 22);
		panel.add(cbxEspecialidad);
		
		JComboBox cbxCargo = new JComboBox();
		cbxCargo.setBackground(SystemColor.menu);
		cbxCargo.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Trabajador", "Jefe de proyectos"}));
		cbxCargo.setEditable(true);
		cbxCargo.setBounds(76, 38, 99, 22);
		panel.add(cbxCargo);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_edit_16px.png")));
		label.setBounds(177, 70, 46, 14);
		panel.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Jefe de proyecto", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(229, 438, 346, 98);
		panel_1.add(panel_2);
		
		JLabel lblExperiencia = new JLabel("Dependientes:");
		lblExperiencia.setBounds(34, 27, 89, 22);
		panel_2.add(lblExperiencia);
		lblExperiencia.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JLabel lblAosDeExperiencia = new JLabel("A\u00F1os de experiencia:");
		lblAosDeExperiencia.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblAosDeExperiencia.setBounds(171, 27, 149, 22);
		panel_2.add(lblAosDeExperiencia);
		
		JSpinner spnAnnosExperiencia = new JSpinner();
		spnAnnosExperiencia.setBackground(SystemColor.menu);
		spnAnnosExperiencia.setModel(new SpinnerNumberModel(1, 1, 35, 1));
		spnAnnosExperiencia.setBounds(217, 57, 39, 20);
		panel_2.add(spnAnnosExperiencia);
		
		JSpinner spnDependientes = new JSpinner();
		spnDependientes.setBackground(SystemColor.menu);
		spnDependientes.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spnDependientes.setBounds(57, 57, 39, 20);
		panel_2.add(spnDependientes);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Principal", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(10, 63, 208, 511);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JButton button_1 = new JButton("Trabajadores\r\n");
		button_1.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_client_company_48px_1.png")));
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_1.setEnabled(false);
		button_1.setBounds(10, 85, 189, 89);
		panel_3.add(button_1);
		
		JButton button_2 = new JButton("Clientes");
		button_2.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_user_group_man_woman_48px.png")));
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_2.setEnabled(false);
		button_2.setBounds(10, 172, 189, 89);
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("Proyectos");
		button_3.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_group_of_projects_48px.png")));
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_3.setEnabled(false);
		button_3.setBounds(10, 261, 189, 89);
		panel_3.add(button_3);
		
		JButton button_4 = new JButton("Salir");
		button_4.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_iMac_Exit_24px.png")));
		button_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button_4.setEnabled(false);
		button_4.setBounds(10, 350, 189, 89);
		panel_3.add(button_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBounds(10, 11, 565, 41);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton button = new JButton("Volver a la principal");
		button.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_back_16px.png")));
		button.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		button.setBounds(339, 11, 216, 23);
		panel_4.add(button);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_link_company_child_16px.png")));
		label_1.setBounds(10, 11, 76, 23);
		panel_4.add(label_1);
		
		JButton btnSalir = new JButton("Salir\r\n");
		btnSalir.setBounds(479, 547, 96, 23);
		panel_1.add(btnSalir);
		btnSalir.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_multiply_16px.png")));
		btnSalir.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		JButton btnRegistrarTrabajador = new JButton("Registrar ");
		btnRegistrarTrabajador.setIcon(new ImageIcon(RegistrarTrabajadores.class.getResource("/img/icons8_checkmark_16px.png")));
		btnRegistrarTrabajador.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnRegistrarTrabajador.setBounds(351, 547, 125, 23);
		panel_1.add(btnRegistrarTrabajador);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/img/icons8_broom_16px_1.png")));
		btnLimpiar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnLimpiar.setHorizontalAlignment(SwingConstants.LEFT);
		btnLimpiar.setBounds(239, 547, 102, 23);
		panel_1.add(btnLimpiar);
		
		
				
		
	}
}
