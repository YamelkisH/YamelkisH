package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JToolBar;



public class Principal extends JFrame {

	private JPanel contentPane;
	private JButton BtnClientes = new JButton("Clientes");
	private JButton BtnProyectos = new JButton("Proyectos");
	private JButton BtnRegistrartra = new JButton("Registrar");
	private JButton BtnListartra = new JButton("Listar");
	private JButton BtnTrabajadores = new JButton("Trabajadores\r\n");
	private JButton BtnRegistrarcli = new JButton("Registrar");
	private JButton btnListarcli = new JButton("Listar");
	private JButton BtnRegistrarpro = new JButton("Registrar");
	private JButton btnListarpro = new JButton("Listar");
	private JButton btnFinalizarPosponer = new JButton("Finalizar/posponer");
	private JPanel panel_1;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 491);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Registrar trabajadores");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Registrar clientes\r\n");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_4 = new JMenu("Crear proyectos");
		menuBar.add(mnNewMenu_4);
		
		JMenu mnNewMenu_3 = new JMenu("Registrar user");
		menuBar.add(mnNewMenu_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 156, 420);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
	//menu vertical
		//poniendo en falso botones emergentes
		BtnRegistrartra.setVisible(false);
		BtnListartra.setVisible(false);
		BtnRegistrarcli.setVisible(false);
		btnListarcli.setVisible(false);
		BtnRegistrarpro.setVisible(false);
		btnListarpro.setVisible(false);
		btnFinalizarPosponer.setVisible(false);
		
	//botones principales
		BtnTrabajadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BtnTrabajadores.setBounds(0, 0, 156, 85);
				BtnClientes.setBounds(0, 153, 156, 85);		
				BtnProyectos.setBounds(0, 239, 156, 85);
				BtnRegistrartra.setVisible(true);
				BtnRegistrartra.setBounds(0, 85, 156, 34);
				BtnListartra.setVisible(true);
				BtnListartra.setBounds(0, 119, 156, 34);
				btnListarpro.setVisible(false);
				btnFinalizarPosponer.setVisible(false);
			}
		});
		BtnTrabajadores.setBounds(0, 0, 156, 85);
		panel_1.add(BtnTrabajadores);
		
		BtnProyectos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				BtnTrabajadores.setBounds(0, 0, 156, 85);
				BtnProyectos.setBounds(0, 170, 156, 85);
				BtnClientes.setBounds(0, 85, 156, 85);
				BtnRegistrarpro.setVisible(true);
				BtnRegistrarpro.setBounds(0, 255, 156, 34);
				btnListarpro.setVisible(true);
				btnListarpro.setBounds(0, 289, 156, 34);
				btnFinalizarPosponer.setVisible(true);
				btnFinalizarPosponer.setBounds(0, 323, 156, 34);
			
			}
		});
		
		BtnProyectos.setBounds(0, 170, 156, 85);
		panel_1.add(BtnProyectos);
		
		BtnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BtnTrabajadores.setBounds(0, 0, 156, 85);
				BtnProyectos.setBounds(0, 239, 156, 85);
				BtnClientes.setBounds(0, 85, 156, 85);
				BtnRegistrarcli.setVisible(true);
				BtnRegistrarcli.setBounds(0, 170, 156, 34);
				btnListarcli.setVisible(true);
				btnListarcli.setBounds(0, 203, 156, 34);
				btnListarpro.setVisible(false);
				btnFinalizarPosponer.setVisible(false);
			}
		});
		
		//posiciones originales
		BtnClientes.setBounds(0, 85, 156, 85);
		panel_1.add(BtnClientes);
		
		
		BtnRegistrartra.setBounds(0, 85, 156, 34);
		panel_1.add(BtnRegistrartra);
		
		
		BtnListartra.setBounds(0, 119, 156, 34);
		panel_1.add(BtnListartra);
		
		
		BtnRegistrarcli.setBounds(0, 170, 156, 34);
		panel_1.add(BtnRegistrarcli);
		
		
		btnListarcli.setBounds(0, 203, 156, 34);
		panel_1.add(btnListarcli);
		
		
		BtnRegistrarpro.setBounds(0, 255, 156, 34);
		panel_1.add(BtnRegistrarpro);
		
		
		btnListarpro.setBounds(0, 289, 156, 34);
		panel_1.add(btnListarpro);
		
		
		btnFinalizarPosponer.setBounds(0, 323, 156, 34);
		panel_1.add(btnFinalizarPosponer);
	}
}
