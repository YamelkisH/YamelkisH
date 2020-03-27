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
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;



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
	private JButton btnSalir = new JButton("Salir");
	private ImageIcon imagen;
	private Icon icono;
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
		setBounds(100, 100, 1218, 618);
		
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
		panel_1.setBounds(0, 0, 180, 650);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		//menu vertical
		
		//poniendo en falso botones emergentes 
				BtnRegistrartra.setVisible(false);
				btnFinalizarPosponer.setVisible(false);
				btnListarpro.setVisible(false);
				BtnRegistrarpro.setVisible(false);
				btnListarcli.setVisible(false);
				BtnRegistrarcli.setVisible(false);
				BtnListartra.setVisible(false);
		
		//botones principales acciones
				BtnTrabajadores.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						BtnTrabajadores.setBounds(0, 0, 180, 129);
						BtnClientes.setBounds(0, 192, 180, 129);
						BtnProyectos.setBounds(0, 321, 180, 129);
						btnSalir.setBounds(0, 450, 180, 129);
						BtnRegistrartra.setVisible(true);
						BtnRegistrartra.setBounds(0, 126, 180, 34);
						BtnListartra.setVisible(true);
						BtnListartra.setBounds(0, 158, 180, 34);
						btnListarpro.setVisible(false);
						btnFinalizarPosponer.setVisible(false);
						
					}
				});
		BtnTrabajadores.setBounds(0, 0, 180, 129);
		imagen = new ImageIcon(Principal.class.getResource("/img/images.png"));
		icono = new ImageIcon(imagen.getImage().getScaledInstance(BtnTrabajadores.getWidth(), BtnTrabajadores.getHeight(), Image.SCALE_DEFAULT));
		
		BtnTrabajadores.setIcon((icono));

		
		panel_1.add(BtnTrabajadores);
		BtnProyectos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				BtnTrabajadores.setBounds(0, 0, 180, 129);
				BtnProyectos.setBounds(0, 253, 180, 129);
				BtnClientes.setBounds(0, 126, 180, 129);
				btnSalir.setBounds(0, 476, 180, 129);
				BtnRegistrarpro.setVisible(true);
				BtnRegistrarpro.setBounds(0, 380, 180, 34);
				btnListarpro.setVisible(true);
				btnListarpro.setBounds(0, 412, 180, 34);
				btnFinalizarPosponer.setVisible(true);
				btnFinalizarPosponer.setBounds(0, 442, 180, 34);
			
			}
		});
		
		BtnProyectos.setBounds(0, 253, 180, 129);
		panel_1.add(BtnProyectos);
		
		
		
		BtnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BtnTrabajadores.setBounds(0, 0, 180, 129);
				BtnProyectos.setBounds(0, 321, 180, 129);
				BtnClientes.setBounds(0, 126, 180, 129);
				btnSalir.setBounds(0, 450, 180, 129);
				BtnRegistrarcli.setVisible(true);
				BtnRegistrarcli.setBounds(0, 255, 180, 34);
				btnListarcli.setVisible(true);
				btnListarcli.setBounds(0, 287, 180, 34);
				btnListarpro.setVisible(false);
				btnFinalizarPosponer.setVisible(false);
			}
		});
		BtnClientes.setBounds(0, 126, 180, 129);
		panel_1.add(BtnClientes);
		
		
		//posicion original botones
		BtnRegistrartra.setBounds(0, 126, 180, 34);
		panel_1.add(BtnRegistrartra);
		BtnListartra.setBounds(0, 158, 180, 34);
		panel_1.add(BtnListartra);
		BtnRegistrarcli.setBounds(0, 253, 180, 34);
		panel_1.add(BtnRegistrarcli);
		btnListarcli.setBounds(0, 284, 180, 34);
		panel_1.add(btnListarcli);
		BtnRegistrarpro.setBounds(0, 380, 180, 34);
		panel_1.add(BtnRegistrarpro);
		btnListarpro.setBounds(0, 412, 180, 34);
		panel_1.add(btnListarpro);
		btnFinalizarPosponer.setBounds(0, 442, 180, 34);
		panel_1.add(btnFinalizarPosponer);
		btnSalir.setBounds(0, 380, 180, 129);
		panel_1.add(btnSalir);
		
		
	
		
		
		
	
	}
}
