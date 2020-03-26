package logico;

import java.util.ArrayList;


public class Sistema {
	private ArrayList<Trabajadores> trabajadores;
	private ArrayList<Proyectos> proyectos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Contratos> contrato;
	private static Sistema sistema = null; 
	public static int codigoCliente = 0;
	public static int codigoTrabajadores = 0;
	public static int codigoProyectos = 0;
	public static int codigoContratos = 0;
	
	public Sistema() {
		super();
		this.trabajadores = new ArrayList<Trabajadores>();
		this.proyectos = new ArrayList<Proyectos>();
		this.clientes = new ArrayList<Cliente>();
		this.contrato = new ArrayList<Contratos>();
	}
	
	public static Sistema getInstance() {
		if (sistema == null) {
			sistema = new Sistema();
			return sistema;
		}else {
		return sistema;
		}
	}
	
	public static Sistema getSistema() {
		return sistema;
	}

	public static void setSistema(Sistema sistema) {
		Sistema.sistema = sistema;
	}
	

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
	
	
	public String Calificacion(String id) {
		String Calificacion = "EXCELENTE";
		int totalProyectos = 0;
		int totalProyectosEntregadosATiempo = 0;
		Trabajadores aux = trabajadorById(id);
		if (aux != null) {
			for (Contratos contratos : contrato) {
				for (Trabajadores contratoTrabajador : contratos.getProyecto().getTrabajadores()) {
					if (contratoTrabajador.getId().equalsIgnoreCase(id)) {
						totalProyectos++;
						if (!contratos.getFechaFinal().after(contratos.getFechaFinal())){
							totalProyectosEntregadosATiempo++;
						}
					}
				}
			}
		}
		
		if (totalProyectos > 0) {
			float porcentaje = (float) totalProyectosEntregadosATiempo/totalProyectos;
			if (porcentaje >= 1) {
				Calificacion = "EXCELENTE";
			} else if (porcentaje < 1 && porcentaje >= 0.8) {
				Calificacion = "BUENO";
			} else {
				Calificacion = "POBRE";
			}
		}
		return Calificacion;
	}

	public static int getCodigoCliente() {
		return codigoCliente;
	}

	public static void setCodigoCliente(int codigoCliente) {
		Sistema.codigoCliente = codigoCliente;
	}

	public static int getCodigoTrabajadores() {
		return codigoTrabajadores;
	}

	public static void setCodigoTrabajadores(int codigoTrabajadores) {
		Sistema.codigoTrabajadores = codigoTrabajadores;
	}

	public static int getCodigoProyectos() {
		return codigoProyectos;
	}

	public static void setCodigoProyectos(int codigoProyectos) {
		Sistema.codigoProyectos = codigoProyectos;
	}

	public static int getCodigoContratos() {
		return codigoContratos;
	}

	public static void setCodigoContratos(int codigoContratos) {
		Sistema.codigoContratos = codigoContratos;
	}
	

	
	
}
