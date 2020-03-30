package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


import logico.Cliente;
import logico.Sistema;

public class ListarClientes extends JDialog {

	//private Validation validation = new Validation();
		private final JPanel contentPanel = new JPanel();
		private JComboBox cbxColumnChooser;
		private JTextField txtFiltro;
		private TableRowSorter<TableModel> sorter;
		private DefaultTableModel model;
		private Object[] rows;
		private int index = -1;
		private String code = "";
		private JTable tableClientes;
		private String[] headers = {"Código", "Cedula", "Nombre", "Dirección", "Teléfono", "P. Activos", "Registro"};
		private JButton btnModificar;
		private JButton btnEliminar;
		
		public static void main(String[] args) {
			try {
				ListarClientes dialog = new ListarClientes();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public ListarClientes() {
			setResizable(false);
			setTitle("Lista de Clientees");
			setBounds(100, 100, 1038, 437);
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
			
			cbxColumnChooser = new JComboBox();
			
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
			for (String string : headers ) {
				combo.add(string);
			}
			cbxColumnChooser.setModel(new DefaultComboBoxModel(combo.toArray()));
			cbxColumnChooser.setBounds(93, 20, 199, 20);
			panel.add(cbxColumnChooser);
			
			JLabel lblFiltro = new JLabel("Filtro:");
			lblFiltro.setFont(new Font("SansSerif", Font.PLAIN, 14));
			lblFiltro.setBounds(302, 23, 45, 14);
			panel.add(lblFiltro);
			
			txtFiltro = new JTextField();
			
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
			txtFiltro.setBounds(357, 20, 256, 20);
			panel.add(txtFiltro);
			txtFiltro.setColumns(10);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, null, null), "Clientees", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
				panel_1.setBounds(10, 79, 1012, 277);
				contentPanel.add(panel_1);
				panel_1.setLayout(new BorderLayout(0, 0));
				
				JScrollPane scrollPane = new JScrollPane();
				panel_1.add(scrollPane, BorderLayout.CENTER);
				
				
				model = new DefaultTableModel();
				sorter = new TableRowSorter<TableModel>(model);
				model.setColumnCount(headers.length);
				model.setColumnIdentifiers(headers);
				tableClientes = new JTable();
				tableClientes.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						if (tableClientes.getSelectedRow() >= 0) {
							index = tableClientes.getSelectedRow();
							code = tableClientes.getValueAt(index, 0).toString();
							btnModificar.setEnabled(true);
							btnEliminar.setEnabled(true);
							btnModificar.setText("Modificar " + code);
							btnEliminar.setText("Eliminar " + code);
						} else {
							index = -1;
							code = "";
							btnModificar.setEnabled(false);
						}
					}
				});
				tableClientes.setModel(model);
				tableClientes.setDefaultEditor(Object.class, null);
				tableClientes.setAutoCreateRowSorter(true);
				DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
				centerRenderer.setHorizontalAlignment(JLabel.CENTER);
				for (int i = 0; i < headers.length; i++) {
					tableClientes.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
				}
				tableClientes.getColumnModel().getColumn(0).setPreferredWidth(30);
				tableClientes.getColumnModel().getColumn(2).setPreferredWidth(250);
				tableClientes.getColumnModel().getColumn(3).setPreferredWidth(150);
				tableClientes.getColumnModel().getColumn(5).setPreferredWidth(15);
				tableClientes.getColumnModel().getColumn(6).setPreferredWidth(25);
				tableClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				tableClientes.setRowSorter(sorter);
				loadtable();
				scrollPane.setViewportView(tableClientes);
			}
			
			{
				JPanel buttonPane = new JPanel();
				buttonPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				getContentPane().add(buttonPane, BorderLayout.SOUTH);
				{
					btnModificar = new JButton("Modificar");
					btnModificar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (!code.equalsIgnoreCase("") && index >= 0) {
								Cliente Cliente = Sistema.getInstance().clienteById(code);
								if (Cliente != null) {
								//	ClienteRegistration ClienteRegistration = new ClienteRegistration(Cliente);
								//	ClienteRegistration.setModal(true);
								//	ClienteRegistration.setVisible(true);
									normalState();
								}
							}
						}
					});
					
					btnModificar.setEnabled(false);
					btnModificar.setFont(new Font("SansSerif", Font.PLAIN, 14));
					btnModificar.setActionCommand("OK");
					buttonPane.add(btnModificar);
					getRootPane().setDefaultButton(btnModificar);
				}
				{
					JButton cancelButton = new JButton("Salir");
					cancelButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							dispose();
						}
					});
					cancelButton.setFont(new Font("SansSerif", Font.PLAIN, 14));
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
			}
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
		
		private void loadtable() {
			model.setRowCount(0);
			rows = new Object[model.getColumnCount()];
			for (Cliente aux : Sistema.getInstance().getClientes()) {
				addRow(aux);
			}
		}

		private void addRow(Cliente aux) {
			
			rows[0] = aux.getId();
			rows[1] = aux.getNombre() + " " + aux.getApellido();
			rows[2] = aux.getDireccion();
			rows[3] = aux.getCelular();
			rows[4] = aux.getCantProyectos();
			rows[5] = (new SimpleDateFormat("dd/MM/yyyy")).format(aux.getFechaRegistro());
			model.addRow(rows);
		}
		
		private void normalState() {
			code = "";
			index = -1;
			btnModificar.setEnabled(false);
			btnEliminar.setEnabled(false);
			btnModificar.setText("Modificar");
			btnEliminar.setText("Eliminar");
			tableClientes.clearSelection();
			loadtable();
		}
	}
