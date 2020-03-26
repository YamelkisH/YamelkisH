package logico;

import java.util.ArrayList;


public class Sistema {
	private ArrayList<Trabajadores> trabajadores;
	private ArrayList<Proyectos> proyectos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Contratos> contrato;
	private static Sistema sistemaAux; //ojo
	public static int codigoCliente = 0;
	public static int codigoTrabajadores = 0;
	public static int codigoProyectos = 0;
	public static int codigoContratos = 0;
	
	public Sistema(ArrayList<Trabajadores> trabajadores, ArrayList<Proyectos> proyectos, ArrayList<Cliente> clientes,
			ArrayList<Contratos> contrato, Sistema sistemaAux) {
		super();
		this.trabajadores = new ArrayList<Trabajadores>();
		this.proyectos = new ArrayList<Proyectos>();
		this.clientes = new ArrayList<Cliente>();
		this.contrato = new ArrayList<Contratos>();
		this.sistemaAux = null;
	}
	
	/*public static Sistema getInstance() {
		if (sistemaAux == null) {
			sistemaAux = new Sistema();
		}
		return sistemaAux;
	}*/

	public ArrayList<Trabajadores> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(ArrayList<Trabajadores> trabajadores) {
		this.trabajadores = trabajadores;
	}

	public ArrayList<Proyectos> getProyectos() {
		return proyectos;
	}

	public void setProyectos(ArrayList<Proyectos> proyectos) {
		this.proyectos = proyectos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Contratos> getContrato() {
		return contrato;
	}

	public void setContrato(ArrayList<Contratos> contrato) {
		this.contrato = contrato;
	}
	
	/*public static Sistema getSistema() {
		return sistemaAux;
	}

	public static void setSistema(sistema sistemaAux) {
		Sistema.sistemaAux = sistemaAux;
	}*/
	
	/*
	 * 
	 * 
*/
	public void insertarCliente(Cliente cliente_1) { //funcion para añadir cliente 
		clientes.add(cliente_1);
		codigoCliente++;
	}
	
	public void insertarContrato(Contratos contrato_1) { // insertar contratos
		contrato.add(contrato_1);
		codigoContratos++;
	}
	
	public void intertarTrabajador(Trabajadores trabajador_1) {//intertar trabajador
		trabajadores.add(trabajador_1);
		codigoTrabajadores++;
	}
	
	public void insertarProyecto(Proyectos proyecto_1) { //insertar proyecto
		proyectos.add(proyecto_1);
		codigoProyectos++;
	}
	
	public Trabajadores trabajadorById(String id) { //buscar trabajador por id
		Trabajadores aux = null;
		for (Trabajadores trabajador : trabajadores) {
			if (trabajador.getId().equalsIgnoreCase(id)) {
				aux = trabajador;
			}
		}
		return aux;
	}
	
	
	/*public String Calificacion(String id) {
		String Calificacion = "EXCELENTE";
		int total = 0;
		int good = 0;
		Trabajadores aux = trabajadorById(id);
		if (aux != null) {
			for (Contratos contratos : contrato) {
				for (Trabajadores contratoTrabajador : contratos.getproyectos().getTrabajadores()) {
					if (contraWorker.getId().equalsIgnoreCase(id)) {
						total++;
						if (!contract.getFinalDate().after(contract.getDueDate())) {
							good++;
						}
					}
				}
			}
		}
		
		if (total > 0) {
			float percentage = (float) good/total;
			if (percentage >= 1) {
				calification = "EXCELENTE";
			} else if (percentage < 1 && percentage >= 0.8) {
				calification = "BUENO";
			} else {
				calification = "DEFICIENTE";
			}
		}
		return calification;
	}*/

	
	
}
