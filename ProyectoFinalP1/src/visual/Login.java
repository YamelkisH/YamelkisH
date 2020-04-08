package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/img/icons8_link_company_child_16px.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(0, -27, 255, 323);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUser = new JLabel("Login");
		lblUser.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblUser.setIcon(new ImageIcon(Login.class.getResource("/img/icons8_gender_neutral_user_48px.png")));
		lblUser.setBounds(56, 38, 180, 74);
		panel.add(lblUser);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(176, 196, 222));
		panel_2.setBorder(new TitledBorder(null, "Ingrese usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 110, 226, 57);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(21, 19, 30, 27);
		panel_2.add(label_3);
		label_3.setIcon(new ImageIcon(Login.class.getResource("/img/icons8_gender_neutral_user_16px.png")));
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setBackground(new Color(230, 230, 250));
		textField.setBounds(39, 19, 177, 27);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ingrese contrase\u00F1a", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBackground(new Color(176, 196, 222));
		panel_3.setBounds(10, 178, 226, 57);
		panel.add(panel_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_4.setBounds(21, 19, 30, 27);
		panel_3.add(label_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(230, 230, 250));
		textField_1.setBounds(39, 19, 177, 27);
		panel_3.add(textField_1);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Login.class.getResource("/img/icons8_lock_2_16px.png")));
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_5.setBounds(21, 19, 30, 27);
		panel_3.add(label_5);
		
		JButton btnCancelar = new JButton("Entrar");
		btnCancelar.setIcon(new ImageIcon(Login.class.getResource("/img/icons8_conference_call_16px.png")));
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnCancelar.setBounds(10, 267, 99, 23);
		panel.add(btnCancelar);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Login.class.getResource("/img/icons8_delete_sign_16px_1.png")));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1.setBounds(115, 267, 113, 23);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(254, -17, 299, 313);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/img/icons8_client_company_48px_1.png")));
		lblNewLabel.setBounds(77, 85, 70, 62);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		panel_1.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login.class.getResource("/img/icons8_business_report_48px_2.png")));
		label.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label.setBounds(10, 225, 70, 62);
		panel_1.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Software enterprise");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(45, 50, 176, 24);
		panel_1.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Login.class.getResource("/img/icons8_prototype_48px.png")));
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_1.setBounds(181, 225, 70, 62);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Login.class.getResource("/img/icons8_work_40px.png")));
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_2.setBounds(101, 225, 70, 62);
		panel_1.add(label_2);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(Login.class.getResource("/img/icons8_developer_48px.png")));
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_6.setBounds(37, 158, 54, 56);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(Login.class.getResource("/img/icons8_c_plus_plus_logo_48px.png")));
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		label_7.setBounds(141, 158, 54, 56);
		panel_1.add(label_7);
	}
}
