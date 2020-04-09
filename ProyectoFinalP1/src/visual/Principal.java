package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Toolkit;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import logico.Sistema;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;



public class Principal extends JFrame {

	private JPanel contentPane;
	private ImageIcon imagen;
	private Icon icono;
	private final JMenu mnCerrarSesin = new JMenu("Usuarios");
	private final JMenuItem mntmNewMenuItem = new JMenuItem("Cerrar sesi\u00F3n");
	private final JMenuItem mntmRegistrarProyecto = new JMenuItem("Registrar proyecto");
	private final JMenuItem mntmRegistrarCliente = new JMenuItem("Registrar cliente");
	private final JMenuItem mntmModificarCliente = new JMenuItem("Modificar cliente");
	private final JMenuItem mntmModificarTrabajador = new JMenuItem("Modificar trabajador");
	private final JMenuItem mntmRegistrarTrabajador = new JMenuItem("Registrar trabajador");
	private final JPanel panel_2 = new JPanel();
	private final JPanel panel_3 = new JPanel();
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
	private final JMenuItem mntmNewMenuItem_3 = new JMenuItem("Registrar");
	private final JMenuBar menuBarProyectos = new JMenuBar();
	private final JMenuItem mntmNewMenuItem_4 = new JMenuItem("Listar");
	private final JPanel panelProyectosAnuales = new JPanel();
	private final JPanel panel_proyectosActivos = new JPanel();
	private final JPanel panel_Ingresos = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setResizable(false);
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
				RegistrarTrabajadores RegTra = new RegistrarTrabajadores();
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
		mnNewMenu_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnNewMenu_4.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_virtual_machine2_48px.png")));
		menuBar.add(mnNewMenu_4);
		mntmRegistrarProyecto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarProyecto RegPro = new RegistrarProyecto();
				RegPro.setModal(true);
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
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Registrar usuario");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarUsuario RegUsu = new RegistrarUsuario();
				RegUsu.setModal(true);
				RegUsu.setVisible(true);
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_add_user_male_24px.png")));
		mntmNewMenuItem_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		mnCerrarSesin.add(mntmNewMenuItem_1);
		mntmNewMenuItem.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_logout_rounded_16px.png")));
		mntmNewMenuItem.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		mnCerrarSesin.add(mntmNewMenuItem);
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
		panel_proyectosActivos.setBounds(18, 21, 365, 179);
		panel_2.add(panel_proyectosActivos);
		panel_proyectosActivos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Proyectos activos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Acceso r\u00E1pido", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(239, 429, 780, 86);
		
		panel.add(panel_3);
		panel_3.setLayout(null);
		mnBuscar.setHorizontalAlignment(SwingConstants.LEFT);
		mnBuscar.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_search_40px.png")));
		mnBuscar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		menuBar_1.setBackground(SystemColor.menu);
		menuBar_1.setBounds(270, 28, 203, 50);
		panel_3.add(menuBar_1);
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
		mntClienteListar.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_bulleted_list_16px.png")));
		mntClienteListar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		mnListar.add(mntClienteListar);
		mntTrabajadorListar.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_bulleted_list_16px.png")));
		mntTrabajadorListar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		mnListar.add(mntTrabajadorListar);
		
		JMenuItem mntProyectolistar = new JMenuItem("Proyecto");
		mntProyectolistar.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_bulleted_list_16px.png")));
		mntProyectolistar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnListar.add(mntProyectolistar);
		
		JMenuItem mntContratoListar = new JMenuItem("Contrato");
		mntContratoListar.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_bulleted_list_16px.png")));
		mntContratoListar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mnListar.add(mntContratoListar);
		
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
				RegistrarTrabajadores RegTra = new RegistrarTrabajadores();
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
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarProyecto RegPro = new RegistrarProyecto();
				RegPro.setModal(true);
				RegPro.setVisible(true);
			}
		});
		mntmNewMenuItem_3.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_add_16px_1.png")));
		
		mnNewMenu_3.add(mntmNewMenuItem_3);
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarProyectos LisPro = new ListarProyectos();
				LisPro.setModal(true);
				LisPro.setVisible(true);
			}
		});
		mntmNewMenuItem_4.setIcon(new ImageIcon(Principal.class.getResource("/img/icons8_bulleted_list_16px.png")));
		mntmNewMenuItem_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		mnNewMenu_3.add(mntmNewMenuItem_4);
		
		
	
		
		
		
	
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
		 
		/* data.setValue(key, value);
		 data.setValue("Proyectos Terminados", proFin);
	        data.setValue("Proyectos En Proceso", proInProces);
	        data.setValue("Proyectos Prorrogados", proProrrogado);
	        data.setValue("Proyectos Nuevo", nuevo);
	 
	        
	         chart = ChartFactory.createPieChart3D(
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
	       
*/
	        
	}
	
	
		   

		  /* private static PieDataset createDataset( ) {
		      DefaultPieDataset dataset = new DefaultPieDataset( );
		      dataset.setValue(5, 2);
		      dataset.setValue( "IPhone 5s" , new Double( 20 ) );  
		      dataset.setValue( "SamSung Grand" , new Double( 20 ) );   
		      dataset.setValue( "MotoG" , new Double( 40 ) );    
		      dataset.setValue( "Nokia Lumia" , new Double( 10 ) );  
		      return dataset;         
		   }
		   
		   private static JFreeChart createChart( PieDataset dataset ) {
		      JFreeChart chart = ChartFactory.createPieChart(      
		         "Mobile Sales",   // chart title 
		         dataset,          // data    
		         true,             // include legend   
		         true, 
		         false);

		      return chart;
		   }
		   
		   public static JPanel createDemoPanel( ) {
		      JFreeChart chart = createChart(createDataset( ) );  
		      return new ChartPanel( chart ); 
		   }

		   public static void main( String[ ] args ) {
		      PieChart_AWT demo = new PieChart_AWT( "Mobile Sales" );  
		      demo.setSize( 560 , 367 );    
		      RefineryUtilities.centerFrameOnScreen( demo );    
		      demo.setVisible( true ); 
		   }
		}*/
}
