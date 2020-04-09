package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Toolkit;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import com.toedter.calendar.JDateChooser;

import logico.Contratos;
import logico.Sistema;
import logico.Usuario;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;



public class Principal extends JFrame implements Runnable{

	private JPanel contentPane;
	private ImageIcon imagen;
	private Icon icono;
	private Usuario user;
	private final JMenu mnCerrarSesin = new JMenu("Usuarios");
	private final JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar sesi\u00F3n");
	private final JMenuItem mntmRegistrarProyecto = new JMenuItem("Registrar proyecto");
	private final JMenuItem mntmRegistrarCliente = new JMenuItem("Registrar cliente");
	private final JMenuItem mntmModificarCliente = new JMenuItem("Modificar cliente");
	private final JMenuItem mntmModificarTrabajador = new JMenuItem("Modificar trabajador");
	private final JMenuItem mntmRegistrarTrabajador = new JMenuItem("Registrar trabajador");
	private final JPanel panel_2 = new JPanel();
	private final JPanel panelAcessoRapido = new JPanel();
	private final JMenuBar menuBar_1 = new JMenuBar();
	private final JMenu mnBuscar = new JMenu("Buscar");
	private final JMenuItem mntCliente = new JMenuItem("Cliente");
	private final JMenuItem mntTrabajador = new JMenuItem("Trabajador");
	private final JMenu mnListar = new JMenu("Listar");
	private final JMenuItem mntProyecto = new JMenuItem("Proyecto");
	private final JMenuItem mntContrato = new JMenuItem("Contrato");
	private final JMenuItem mntClienteListar = new JMenuItem("Cliente");
	private final JMenuItem mntTrabajadorListar = new JMenuItem("Trabajador");
	private final JMenuBar TrabajadoresMenuBar = new JMenuBar();
	private final JMenuBar ClientesMenuBar = new JMenuBar();
	private final JMenu mnTrabajadores = new JMenu("Trabajadores");
	private final JMenuItem mntListar = new JMenuItem("Listar");
	private final JMenuItem mntReg = new JMenuItem("Registrar");
	private final JMenuBar SalirMenuBar = new JMenuBar();
	private final JMenu mnClientes = new JMenu("Clientes");
	private final JMenuItem mntRegCliente = new JMenuItem("Registrar");
	private final JMenuItem mtnListarCliente = new JMenuItem("Listar");
	private final JMenu mnNewMenu_3 = new JMenu("Proyectos");
	private final JMenuItem mntmRegistrar = new JMenuItem("Registrar");
	private final JMenuBar menuBarProyectos = new JMenuBar();
	private final JMenuItem mntmListar = new JMenuItem("Listar");
	private final JPanel panelProyectosAnuales = new JPanel();
	private final JPanel panel_proyectosActivos = new JPanel();
	private final JPanel panel_Ingresos = new JPanel();
	private final JMenuItem mntmListarUsuario = new JMenuItem("Listar usuario");
	private Thread proyectos;
	private int hora;
	private int minutos;
	private int dia;
	private int mes;
	private int year;
	private final JLabel lblFecha = new JLabel("Fecha:");
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Principal(Usuario usuario) {
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				guardarDatos();
				System.exit(0);
			}
		});
			
			
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/img/icons8_link_company_child_16px.png")));
		setTitle("Compa\u00F1\u00EDa de Software ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1056, 630);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivos");
		mnNewMenu.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnNewMenu.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_opened_folder_48px.png")));
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Trabajadores");
		mnNewMenu_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnNewMenu_1.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_client_company_48px_1.png")));
		menuBar.add(mnNewMenu_1);
		mntmRegistrarTrabajador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarTrabajadores RegTra = new RegistrarTrabajadores(null);
				RegTra.setModal(true);
				RegTra.setVisible(true);
			}
		});
		mntmRegistrarTrabajador.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_add_user_female_16px.png")));
		mntmRegistrarTrabajador.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		mnNewMenu_1.add(mntmRegistrarTrabajador);
		mntmModificarTrabajador.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_edit_user_female_16px.png")));
		mntmModificarTrabajador.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		mnNewMenu_1.add(mntmModificarTrabajador);
		
		JMenu mnNewMenu_2 = new JMenu("Clientes");
		mnNewMenu_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnNewMenu_2.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_user_group_man_woman_48px.png")));
		menuBar.add(mnNewMenu_2);
		mntmRegistrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarCliente RegCli = new RegistrarCliente(null);
				RegCli.setModal(true);
				RegCli.setVisible(true);
			}
		});
		mntmRegistrarCliente.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_add_user_male_16px_1.png")));
		mntmRegistrarCliente.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		mnNewMenu_2.add(mntmRegistrarCliente);
		mntmModificarCliente.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_edit_user_male_16px.png")));
		mntmModificarCliente.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		mnNewMenu_2.add(mntmModificarCliente);
		
		JMenu mnNewMenu_4 = new JMenu("Proyectos");
		mnNewMenu_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		mnNewMenu_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnNewMenu_4.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_virtual_machine2_48px.png")));
		menuBar.add(mnNewMenu_4);
		mntmRegistrarProyecto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarProyecto RegPro = new RegistrarProyecto();
				RegPro.setModal(true);
	
				RegPro.setResizable(false);
				RegPro.setLocationRelativeTo(null);
				RegPro.setVisible(true);
			}
		});
		

		mntmRegistrarProyecto.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_add_16px_1.png")));
		mntmRegistrarProyecto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		mnNewMenu_4.add(mntmRegistrarProyecto);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Modificar proyecto");
		mntmNewMenuItem_2.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_edit_16px_1.png")));
		mntmNewMenuItem_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnNewMenu_4.add(mntmNewMenuItem_2);
		mnCerrarSesin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnCerrarSesin.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_user_32px.png")));
		
		menuBar.add(mnCerrarSesin);
		
		JMenuItem mntmRegistrarUsuario = new JMenuItem("Registrar usuario");
		mntmRegistrarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarUsuario RegUsu = new RegistrarUsuario(user, null);
				RegUsu.setModal(true);
				RegUsu.setVisible(true);
			}
		});
		mntmRegistrarUsuario.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_add_user_male_24px.png")));
		mntmRegistrarUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnCerrarSesin.add(mntmRegistrarUsuario);
		mntmListarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ListarUsuarios LisUsu = new ListarUsuarios();
				LisUsu.setModal(true);
				LisUsu.setVisible(true);
			}
		});
		mntmListarUsuario.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_bulleted_list_16px.png")));
		mntmListarUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		mnCerrarSesin.add(mntmListarUsuario);
		mntmCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Seguro que desea cerrar la sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					UserLogin login = new UserLogin();
					guardarDatos();
					dispose();
					
					login.setVisible(true);
				//guardarDatos();
				//dispose();
			//	System.exit(0);
				
				}
			}
		});
		mntmCerrarSesion.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_logout_rounded_16px.png")));
		mntmCerrarSesion.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		mnCerrarSesin.add(mntmCerrarSesion);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		panel_2.setBackground(SystemColor.menu);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dashboard", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(239, 10, 780, 408);
		
		panel.add(panel_2);
		panel_2.setLayout(null);
		panelProyectosAnuales.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Proyectos anuales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelProyectosAnuales.setBounds(398, 21, 359, 179);
		
		panel_2.add(panelProyectosAnuales);
		panel_Ingresos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ingresos mensuales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_Ingresos.setBounds(72, 211, 604, 179);
		
		panel_2.add(panel_Ingresos);
		panel_proyectosActivos.setBounds(10, 11, 373, 189);
		panel_2.add(panel_proyectosActivos);
		
		panel_proyectosActivos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Proyectos activos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		 graphPie();

		
		panelAcessoRapido.setBackground(SystemColor.menu);
		panelAcessoRapido.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Acceso r\u00E1pido", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelAcessoRapido.setBounds(239, 429, 780, 86);
		

		panel.add(panelAcessoRapido);
		panelAcessoRapido.setLayout(null);
		mnBuscar.setHorizontalAlignment(SwingConstants.LEFT);
		mnBuscar.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_search_40px.png")));
		mnBuscar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		menuBar_1.setBackground(SystemColor.menu);
		menuBar_1.setBounds(270, 28, 203, 50);
		panelAcessoRapido.add(menuBar_1);
		menuBar_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		menuBar_1.setBorderPainted(false);
		
		menuBar_1.add(mnBuscar);
		mntCliente.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mntCliente.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_find_user_female_16px.png")));
		
		mnBuscar.add(mntCliente);
		mntTrabajador.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mntTrabajador.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_find_user_male_16px_1.png")));
		
		mnBuscar.add(mntTrabajador);
		mntProyecto.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_search_property_16px.png")));
		mntProyecto.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		mnBuscar.add(mntProyecto);
		mntContrato.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_view_file_16px.png")));
		mntContrato.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		mnBuscar.add(mntContrato);
		mnListar.setHorizontalAlignment(SwingConstants.RIGHT);
		mnListar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnListar.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_bulleted_list_40px.png")));
		
		menuBar_1.add(mnListar);
		mntClienteListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarTrabajadores LisTra = new ListarTrabajadores();
				LisTra.setModal(true);
				LisTra.setVisible(true);
			}
		});
		mntClienteListar.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_bulleted_list_16px.png")));
		mntClienteListar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		mnListar.add(mntClienteListar);
		mntTrabajadorListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarTrabajadores LisTra = new ListarTrabajadores();
				LisTra.setModal(true);
				LisTra.setVisible(true);
			}
		});
		mntTrabajadorListar.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_bulleted_list_16px.png")));
		mntTrabajadorListar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		mnListar.add(mntTrabajadorListar);
		
		JMenuItem mntProyectolistar = new JMenuItem("Proyecto");
		mntProyectolistar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarProyectos LisPro = new ListarProyectos();
				LisPro.setModal(true);
				LisPro.setVisible(true);
			}
		});
		mntProyectolistar.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_bulleted_list_16px.png")));
		mntProyectolistar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnListar.add(mntProyectolistar);
		
		JMenuItem mntContratoListar = new JMenuItem("Contrato");
		mntContratoListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mntContratoListar.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_bulleted_list_16px.png")));
		mntContratoListar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnListar.add(mntContratoListar);
		lblFecha.setBounds(615, 28, 155, 25);
		panelAcessoRapido.add(lblFecha);
		lblFecha.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Principal", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBounds(10, 10, 208, 504);
		panel.add(panel_4);
		panel_4.setLayout(null);
		TrabajadoresMenuBar.setBounds(8, 80, 189, 100);
		
		panel_4.add(TrabajadoresMenuBar);
		mnTrabajadores.setHorizontalAlignment(SwingConstants.CENTER);
		mnTrabajadores.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_client_company_48px_1.png")));
		
		TrabajadoresMenuBar.add(mnTrabajadores);
		mntReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarTrabajadores RegTra = new RegistrarTrabajadores(null);
				RegTra.setModal(true);
				RegTra.setVisible(true);
			}
		});
		mntReg.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_add_16px_1.png")));
		
		mnTrabajadores.add(mntReg);
		mntListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarTrabajadores LisTra = new ListarTrabajadores();
				LisTra.setModal(true);
				LisTra.setVisible(true);
			}
		});
		mntListar.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_bulleted_list_16px.png")));
		
		mnTrabajadores.add(mntListar);
		ClientesMenuBar.setBounds(8, 180, 189, 100);
		
		panel_4.add(ClientesMenuBar);
		mnClientes.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_user_group_man_woman_48px.png")));
		mnClientes.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		ClientesMenuBar.add(mnClientes);
		mntRegCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarCliente RegCli = new RegistrarCliente(null);
				RegCli.setModal(true);
				RegCli.setVisible(true);
			}
		});
		mntRegCliente.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_add_16px_1.png")));
		
		mnClientes.add(mntRegCliente);
		mtnListarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarClientes LisCli = new ListarClientes();
				LisCli.setModal(true);
				LisCli.setVisible(true);
			}
		});
		mtnListarCliente.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_bulleted_list_16px.png")));
		
		mnClientes.add(mtnListarCliente);
		SalirMenuBar.setBounds(8, 380, 189, 100);
		
		panel_4.add(SalirMenuBar);
		menuBarProyectos.setBounds(8, 280, 189, 100);
		panel_4.add(menuBarProyectos);
		menuBarProyectos.add(mnNewMenu_3);
		mnNewMenu_3.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_group_of_projects_48px.png")));
		mnNewMenu_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mntmRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarProyecto RegPro = new RegistrarProyecto();
				RegPro.setModal(true);
				RegPro.setVisible(true);
				graphPie();
			}
		});
		mntmRegistrar.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_add_16px_1.png")));
		
		mnNewMenu_3.add(mntmRegistrar);
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarProyectos LisPro = new ListarProyectos();
				LisPro.setModal(true);
				LisPro.setVisible(true);
				graphPie();
			}
		});
		mntmListar.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_bulleted_list_16px.png")));
		mntmListar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		mnNewMenu_3.add(mntmListar);
		
		
	
		
		
		
	
	}
	
	private int progressCalc(Contratos aux) {
		JDateChooser fechaInicio = new JDateChooser();
		JDateChooser fechaFinal = new JDateChooser();
		JDateChooser fechaActual = new JDateChooser();
		fechaInicio.setDate(aux.getFechaInicio());
		fechaFinal.setDate(aux.getFechaFinal());
		fechaActual.setDate(new Date());
		int progressDays = Sistema.getInstance().calculoDias(fechaInicio, fechaActual);
		int totalDays = Sistema.getInstance().calculoDias(fechaInicio, fechaFinal);
		int porcentaje = (int) (((float) progressDays)/((float) totalDays) * 100);
		if (porcentaje >= 100) {
			porcentaje = 100;
		}
		return porcentaje;
	}

	@Override
	public void run() {
		Thread ct = Thread.currentThread();
		int time = 0;
		while(ct == proyectos) {
			if (time >= 30) {
				graphPie();
			}
			try {
				Thread.sleep(1000);
				time = (time == 30) ? 0 : (time + 1);
				calcularTiempo();
				if (minutos < 10) {
					lblFecha.setText(dia+"/"+mes+"/"+year+" "+hora+":0" + minutos);
				} else {
					lblFecha.setText(dia+"/"+mes+"/"+year+" "+hora+":" + minutos);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void graphPie() {
		
		
		
		 DefaultPieDataset data = new DefaultPieDataset();
		 int proFin=0;
		 int proInProces=0;
		 int proProrrogado=0;
		 int nuevo=0;
		 
		 for (int i = 0; i < Sistema.getInstance().getProyectos().size(); i++) {
			 if (Sistema.getInstance().getProyectos().get(i).getEstado().equalsIgnoreCase("Terminado")) {
				 proFin++;
			}else if(Sistema.getInstance().getProyectos().get(i).getEstado().equalsIgnoreCase("En Proceso")) {
				proInProces++;
			}else if(Sistema.getInstance().getProyectos().get(i).getEstado().equalsIgnoreCase("Prorrogado")) {
				proProrrogado++;
			}else if(Sistema.getInstance().getProyectos().get(i).getEstado().equalsIgnoreCase("Nuevo")) {
				nuevo++;
			}
			
		}
		 
		 
		 	data.setValue("Proyectos Terminados", proFin);
	        data.setValue("Proyectos En Proceso", proInProces);
	        data.setValue("Proyectos Prorrogados", proProrrogado);
	        data.setValue("Proyectos Nuevo", nuevo);
	 
	        
	        JFreeChart chart = ChartFactory.createPieChart3D(
	         "Grafica Status Proyectos", 
	         data, 
	         true, 
	         true, 
	         false);
	       //chart.setBackgroundPaint(new Color(222, 222, 255));
	      // chart.setBorderPaint(Color.WHITE);
	      
	       PiePlot plot = (PiePlot) chart.getPlot();
	       plot.setSectionPaint("Proyectos Terminados", new Color( 130, 224, 170 ));
	       plot.setSectionPaint("Proyectos Prorrogados", new Color( 236, 112, 99 ));
	       plot.setSectionPaint("Proyectos En Proceso", new Color( 247, 220, 111 ));
	       plot.setSectionPaint("Proyectos Nuevo", new Color( 133, 193, 233 ));
	       plot.setBackgroundPaint(Color.WHITE);
	       
	       try {
				ChartUtilities.saveChartAsJPEG(new File("graficopie.jpg"), chart, 500, 500);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       

	        
	}
	
	
	private void guardarDatos() {
		FileOutputStream system;
		ObjectOutputStream writer;
		try {
			system = new FileOutputStream("SistemaGestionSoftware.dat");
			writer = new ObjectOutputStream(system);
			writer.writeObject(Sistema.getInstance());
			writer.writeInt(Sistema.codigoTrabajadores);
			writer.writeInt(Sistema.codigoProyectos);
			writer.writeInt(Sistema.codigoCliente);
			writer.writeInt(Sistema.codigoUsuarios);
			writer.writeInt(Sistema.codigoContratos);
			writer.close();
			system.close();
		} catch (Exception e) {
			System.out.println("Error al guardar los datos" + e.toString());
		}
	}



	
	
	public void calcularTiempo() {
        Calendar calendario = new GregorianCalendar();
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        dia=calendario.get(Calendar.DAY_OF_MONTH);
        mes=calendario.get(Calendar.MONTH) + 1;
        year=calendario.get(Calendar.YEAR);
    }
	}



	