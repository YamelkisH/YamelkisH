package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import logico.Jefe;
import logico.Dise�ador;
import logico.Programador;
import logico.Sistema;
import logico.Trabajadores;

public class ListarTrabajadores extends JDialog {

	//private Validation validation = new Validation();
	private final JPanel contentPanel = new JPanel();
	private JTable tableTrabajadores;
	private TableRowSorter<TableModel> sorter;
	private DefaultTableModel model;
	private Object[] rows;
	private JTextField txtFiltro;
	private JComboBox cbxColumnChooser;
	private final String [] headers = {"C�digo", "Cedula", "Nombre", "Rol", "Tel�fono", "Correo", "Salario Hora", "Calificaci�n"};
	private DecimalFormat format = new DecimalFormat("###,###.##");
	private int index = -1;
	private String code = "";
	private JButton btnModificar;
	private JButton btnEliminar;

	public ListarTrabajadores() {
		setResizable(false);
		setTitle("Lista de Trabajadores");
		setBounds(100, 100, 1038, 472);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, null, null), "Filtrado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 1012, 57);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Filtrar por:");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 21, 73, 14);
		panel.add(lblNewLabel);
		
		cbxColumnChooser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbxColumnChooser.getSelectedIndex() > 0) {
					txtFiltro.setEnabled(true);
					txtFiltro.requestFocus();
				} else {
					txtFiltro.setText("");
					txtFiltro.setEnabled(false);
					sorter.setRowFilter(null);
				}
			}
		});
		ArrayList<String> combo = new ArrayList<>();
		combo.add("<Seleccione>");
		for (String string : headers) {
			combo.add(string);
		}
		cbxColumnChooser.setBounds(93, 20, 199, 20);
		panel.add(cbxColumnChooser);
		
		JLabel lblFiltro = new JLabel("Filtro:");
		lblFiltro.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblFiltro.setBounds(302, 23, 45, 14);
		panel.add(lblFiltro);
		
		try {
			txtFiltro.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					if (!txtFiltro.isEnabled()) {
						return;
					}
					for (int i = 0; i < model.getColumnCount(); i++) {
						if (model.getColumnName(i).equalsIgnoreCase(cbxColumnChooser.getSelectedItem().toString())) {
							tableFilter(txtFiltro.getText(), i);
						}
					}
				}
			});
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtFiltro.setEnabled(false);
		txtFiltro.setBounds(357, 20, 339, 20);
		panel.add(txtFiltro);
		txtFiltro.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, null, null), "Trabajadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 79, 1012, 312);
		contentPanel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		model = new DefaultTableModel();
		sorter = new TableRowSorter<TableModel>(model);
		model.setColumnCount(headers.length);
		model.setColumnIdentifiers(headers);
		tableTrabajadores = new JTable();
		tableTrabajadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (tableTrabajadores.getSelectedRow() >= 0) {
					index = tableTrabajadores.getSelectedRow();
					code = tableTrabajadores.getValueAt(index, 0).toString();
					btnModificar.setEnabled(true);
					btnEliminar.setEnabled(true);
					btnModificar.setText("Modificar " + code);
					btnEliminar.setText("Eliminar " + code);
				} else {
					normalState();
				}
			}
		});
		tableTrabajadores.setModel(model);
		tableTrabajadores.setDefaultEditor(Object.class, null);
		tableTrabajadores.setAutoCreateRowSorter(true);
		tableTrabajadores.getColumnModel().getColumn(0).setPreferredWidth(30);
		tableTrabajadores.getColumnModel().getColumn(2).setPreferredWidth(250);
		tableTrabajadores.getColumnModel().getColumn(3).setPreferredWidth(85);
		tableTrabajadores.getColumnModel().getColumn(5).setPreferredWidth(150);
		tableTrabajadores.getColumnModel().getColumn(6).setPreferredWidth(70);
		tableTrabajadores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableTrabajadores.setRowSorter(sorter);
		loadtable();
		scrollPane.setViewportView(tableTrabajadores);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnModificar = new JButton("Modificar");
				btnModificar.setEnabled(false);
				btnModificar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (!code.equalsIgnoreCase("") && index >= 0) {
							Trabajadores Trabajadores = Sistema.getInstance().trabajadorById(code);
							if (Trabajadores != null) {
							/*	TrabajadoresRegistration TrabajadoresRegistration = new TrabajadoresRegistration(Trabajadores);
								TrabajadoresRegistration.setModal(true);
								TrabajadoresRegistration.setVisible(true);*/
								normalState();
							}
						}
					}
				});
				
				/*btnEliminar = new JButton("Eliminar");
				btnEliminar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (!code.equalsIgnoreCase("") && index >= 0) {
							Trabajadores Trabajadores = Sistema.getInstance().searchTrabajadoresByCode(code);
							boolean eliminar = Sistema.getInstance().TrabajadoresIsRemovable(Trabajadores.getId());
							if (eliminar) {
								if (JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar el trabajador " + code + "?", "Trabajadores", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
									Sistema.getInstance().removeTrabajadores(Trabajadores);
									normalState();
								}
							} else {
								JOptionPane.showMessageDialog(null, "Este trabajador no puede ser eliminado", "Trabajadores", JOptionPane.ERROR_MESSAGE);
							}
						}
					}
				});*/
				/*btnEliminar.setEnabled(false);
				btnEliminar.setIcon(new ImageIcon(ListTrabajadores.class.getResource("/Imgs/delete16.png")));
				btnEliminar.setFont(new Font("SansSerif", Font.PLAIN, 14));
				buttonPane.add(btnEliminar);*/
				btnModificar.setFont(new Font("SansSerif", Font.PLAIN, 14));
				btnModificar.setActionCommand("OK");
				buttonPane.add(btnModificar);
				getRootPane().setDefaultButton(btnModificar);
			}
			{
				JButton btnSalir = new JButton("Salir");
				btnSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				btnSalir.setFont(new Font("SansSerif", Font.PLAIN, 14));
				btnSalir.setActionCommand("Cancel");
				buttonPane.add(btnSalir);
			}
		}
		
	}

	private void loadtable() {
		model.setRowCount(0);
		rows = new Object[model.getColumnCount()];
		for (Trabajadores aux : Sistema.getInstance().getTrabajadores()) {
			addRow(aux);
		}
	}

	private void addRow(Trabajadores aux) {
		rows[0] = aux.getId();
		rows[1] = aux.getNombre()+ " " + aux.getApellido();
		if (aux instanceof Jefe) {
			rows[2] = "JEFE";
		} else if (aux instanceof Programador) {
			rows[3] = "PROGRAMADOR";
		} else if (aux instanceof Dise�ador) {
			rows[3] = "DISE�ADOR";
		} else {
			rows[3] = "PLANEADOR";
		}
		rows[4] = aux.getCelular();
		rows[5] = "RD$" + format.format(aux.getSalarioHoras());
		rows[6] = Sistema.getInstance().Calificacion(aux.getId());
		model.addRow(rows);
	}
	
	private void tableFilter(String text, int column_index) {
	    RowFilter<TableModel, Object> filter = null;
	    try {
	    	filter = RowFilter.regexFilter("(?i)" + text, column_index);
	    } catch (java.util.regex.PatternSyntaxException e) {
	        return;
	    }
	    sorter.setRowFilter(filter);
	}
	
	private void normalState() {
		code = "";
		index = -1;
		btnModificar.setEnabled(false);
		btnEliminar.setEnabled(false);
		btnModificar.setText("Modificar");
		btnEliminar.setText("Eliminar");
		tableTrabajadores.clearSelection();
		loadtable();
	}
}
