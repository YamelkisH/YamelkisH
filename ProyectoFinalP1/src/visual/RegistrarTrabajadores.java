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
		setResizable(false);
		setTitle("Registrar Trabajador");
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
			panel.setBounds(181, 63, 346, 252);
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
			textNombres.setBounds(76, 92, 257, 20);
			panel.add(textNombres);
			textNombres.setColumns(10);
			
			textApellidos = new JTextField();
			textApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textApellidos.setColumns(10);
			textApellidos.setBackground(SystemColor.menu);
			textApellidos.setBounds(76, 123, 257, 20);
			panel.add(textApellidos);
			
			textDireccion = new JTextField();
			textDireccion.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textDireccion.setColumns(10);
			textDireccion.setBackground(SystemColor.menu);
			textDireccion.setBounds(76, 154, 257, 20);
			panel.add(textDireccion);
			
			JFormattedTextField txtCelular = new JFormattedTextField();
			txtCelular.setBackground(SystemColor.menu);
			txtCelular.setBounds(226, 191, 107, 20);
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
			lblCdigo.setBounds(159, 28, 71, 22);
			panel.add(lblCdigo);
			
			JLabel lblCorreo = new JLabel("Correo:");
			lblCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
			lblCorreo.setBounds(159, 59, 71, 22);
			panel.add(lblCorreo);
			
			textCorreo = new JTextField();
			textCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 13));
			textCorreo.setColumns(10);
			textCorreo.setBackground(SystemColor.menu);
			textCorreo.setBounds(209, 61, 124, 20);
			panel.add(textCorreo);
			
			textCodigo = new JTextField();
			textCodigo.setText("   Trabajador_1");
			textCodigo.setEditable(false);
			textCodigo.setBackground(SystemColor.menu);
			textCodigo.setBounds(209, 30, 124, 20);
			panel.add(textCodigo);
			textCodigo.setColumns(10);
			
			JComboBox cbxGenero = new JComboBox();
			cbxGenero.setBackground(SystemColor.menu);
			cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Masculino", "Femenino"}));
			cbxGenero.setEditable(true);
			cbxGenero.setBounds(76, 189, 92, 22);
			panel.add(cbxGenero);
			
			JSpinner spnEdad = new JSpinner();
			spnEdad.setBackground(SystemColor.menu);
			spnEdad.setModel(new SpinnerNumberModel(18, 18, 60, 1));
			spnEdad.setBounds(76, 222, 92, 20);
			panel.add(spnEdad);
			
			JFormattedTextField formattedTextField = new JFormattedTextField();
			formattedTextField.setBackground(SystemColor.menu);
			formattedTextField.setBounds(226, 222, 107, 20);
			panel.add(formattedTextField);
			
			
			

			
		}
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos laborales", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(181, 326, 346, 111);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setBounds(9, 70, 71, 22);
		panel.add(lblSalario);
		lblSalario.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		textSalario = new JTextField();
		textSalario.setBackground(SystemColor.menu);
		textSalario.setBounds(76, 72, 92, 20);
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
		cbxCargo.setBounds(76, 38, 92, 22);
		panel.add(cbxCargo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Jefe de proyecto", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(181, 443, 346, 98);
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
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBounds(10, 63, 161, 473);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnTrabajadores = new JButton("Trabajadores");
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
		btnSalir.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnSalir.setBounds(10, 11, 82, 23);
		panel_4.add(btnSalir);
		
				
		
	}
}
