package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
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
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


import logico.Cliente;
import logico.Sistema;

public class ListarProyectos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tableProjects;
	public static Object[] fila;
	private DefaultTableModel model;
	public static String codContractTable;
	private JTextField txtfiltrer;
	private TableRowSorter<TableModel> sorter;
	private String[] headers = {"ID Contrato", "ID Cliente", "Nombre Cliente", "ID Proyecto", "Tipo Proyecto", "Firma Contrato", "Fecha Inicio","Fecha de Entrega","Total a pagar","Estado","Fecha Prorrogado","Cant Trabajadores"};
	private static int cont;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	private static ListarProyectos listPro=null;
	
	public static ListarProyectos getInstance() {
		if (listPro==null) {
			listPro=new ListarProyectos();
		}
		return listPro;
	}
	
	/*public static Sistema getInstance() {
		if (Sistema == null) {
			Sistema = new Sistema();
		}
		return Sistema;
	}*/
	 


	
	// * Launch the application.
	 
	public static void main(String[] args) {
		try {
			ListarProyectos dialog = new ListarProyectos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	// * Create the dialog.
	 
	public ListarProyectos() {
		setResizable(false);
		setTitle("Listar Proyectos");
		setBounds(100, 100, 1269, 545);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		model = new DefaultTableModel();
		sorter = new TableRowSorter<TableModel>(model);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, null, null), "Proyectos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 106, 1233, 358);
		contentPanel.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		tableProjects = new JTable();
		
		tableProjects.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				   int row=tableProjects.getSelectedRow();
			        codContractTable= String.valueOf(model.getValueAt(row, 0));	
			        System.out.println(codContractTable);
			    	
					
				
			}
		});
		
		String [] header = {"ID Contrato", "ID Cliente", "Nombre Cliente", "ID Proyecto", "Tipo Proyecto","Firma Contrato", "Fecha Inicio", "Fecha de entrega", "Total a pagar","Estado","Fecha Prorrogado","Trabajadores"};
		
		model.setColumnIdentifiers(header);
		tableProjects.setModel(model);
		tableProjects.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableProjects.setModel(model);
		
		
		
		
		 TableColumnModel columnModel = tableProjects.getColumnModel();
		 tableProjects.setAutoCreateRowSorter(true);
		 columnModel.getColumn(0).setPreferredWidth(50);
		 columnModel.getColumn(3).setPreferredWidth(50);
		 columnModel.getColumn(3).setPreferredWidth(75);
		 columnModel.getColumn(9).setPreferredWidth(40);
		 columnModel.getColumn(11).setPreferredWidth(40);
		 tableProjects.setRowSorter(sorter);
		
		/*
		 * 
		
		 * */
		
		
		loadUser();
		scrollPane.setViewportView(tableProjects);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED, null, null), "Filtrado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 11, 1233, 78);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		Label label = new Label("Filtrar Por:");
		label.setFont(new Font("SansSerif", Font.PLAIN, 14));
		label.setBounds(10, 29, 86, 22);
		panel_1.add(label);
		
		final JComboBox comboBoxFiltrer = new JComboBox();
		
		comboBoxFiltrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (comboBoxFiltrer.getSelectedIndex() > 0) {
					txtfiltrer.setEnabled(true);
					txtfiltrer.requestFocus();
				} else {
					txtfiltrer.setText("");
					txtfiltrer.setEnabled(false);
					sorter.setRowFilter(null);
				}
				
				
			}
		});
		comboBoxFiltrer.setBounds(102, 31, 183, 20);
		panel_1.add(comboBoxFiltrer);
		
		ArrayList<String> combo = new ArrayList<>();
		combo.add("<Seleccione>");
		for (String string : headers ) {
			combo.add(string);
		}
		
		comboBoxFiltrer.setModel(new DefaultComboBoxModel(combo.toArray()));
		
		
		Label label_1 = new Label("Filtro:");
		label_1.setFont(new Font("SansSerif", Font.PLAIN, 14));
		label_1.setBounds(291, 29, 62, 22);
		panel_1.add(label_1);
		
		txtfiltrer = new JTextField();
		
		txtfiltrer.setEnabled(false);
		try {
			txtfiltrer.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					if (!txtfiltrer.isEnabled()) {
						return;
					}
					for (int i = 0; i < model.getColumnCount(); i++) {
						if (model.getColumnName(i).equalsIgnoreCase(comboBoxFiltrer.getSelectedItem().toString())) {
							tableFilter(txtfiltrer.getText(), i);
						}
					}
				}
			});
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtfiltrer.setBounds(359, 31, 203, 20);
		panel_1.add(txtfiltrer);
		txtfiltrer.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setFont(new Font("SansSerif", Font.PLAIN, 14));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
	public void loadUser() {
		model.setRowCount(0);
		fila = new Object[model.getColumnCount()];
	
		//"ID Contrato", "ID Cliente", "Nombre Cliente", "ID Proyecto", "Tipo Proyecto", "Fecha Inicio", "Fecha de entrega", "Total a pagar"};
		
		
		for (int i = 0; i <Sistema.getInstance().getContrato().size(); i++) {
			fila[0]=Sistema.getInstance().getContrato().get(i).getId();
			fila[1]=Sistema.getInstance().getContrato().get(i).getIdCliente();
			Cliente aux=Sistema.getInstance().clienteById(Sistema.getInstance().getContrato().get(i).getIdCliente());
			fila[2]=aux.getNombre();
			fila[3]=Sistema.getInstance().getContrato().get(i).getProyecto().getId();
			fila[4]=Sistema.getInstance().getContrato().get(i).getProyecto().getTipo();
			fila[5]=Sistema.getInstance().getContrato().get(i).getDiaCierre();
			fila[6]=dateFormat.format(Sistema.getInstance().getContrato().get(i).getFechaInicio());
			fila[7]=dateFormat.format(Sistema.getInstance().getContrato().get(i).getFechaEntrega());
			fila[8]="$"+Sistema.getInstance().getContrato().get(i).getPrecio();
			fila[9]=Sistema.getInstance().getContrato().get(i).getProyecto().getEstado();
			if (Sistema.getInstance().getContrato().get(i).getProyecto().getEstado().equalsIgnoreCase("Prorrogado")) {
				fila[10]=dateFormat.format(Sistema.getInstance().getContrato().get(i).getFechaFinal());
			}else {
				fila[10]="N/A";
			}
			
			
			fila[11]=Sistema.getInstance().getContrato().get(i).getProyecto().getTrabajadores().size();
			model.addRow(fila);
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
	public JTable getTableProjects() {
		return tableProjects;
	}
	public void setTableProjects(JTable tableProjects) {
		this.tableProjects = tableProjects;
	}

	public String[] getHeaders() {
		return headers;
	}

	public void setHeaders(String[] headers) {
		this.headers = headers;
	}
}
