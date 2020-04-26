package logico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

import com.toedter.calendar.JDateChooser;

import logico.Proyectos;
import logico.Trabajadores;
import logico.Cliente;
import logico.Contratos;

//import com.toedter.calendar.JDateChooser;

public class Sistema implements Serializable{
	private static final long serialVersionUID = -2058297959693156912L;

	private ArrayList<Trabajadores> trabajadores;
	private ArrayList<Proyectos> proyectos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Contratos> contrato;
	private ArrayList<Usuario> usuarios;
	private static Sistema sistema = null; 
	public static int codigoCliente = 0;
	public static int codigoTrabajadores = 0;
	public static int codigoProyectos = 0;
	public static int codigoContratos = 0;
	public static int codigoUsuarios = 0;
	
	public Sistema() {
		super();
		this.trabajadores = new ArrayList<Trabajadores>();
		this.proyectos = new ArrayList<Proyectos>();
		this.clientes = new ArrayList<Cliente>();
		this.contrato = new ArrayList<Contratos>();
		this.usuarios = new ArrayList<Usuario>();
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
	
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
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
	
	
	
	
	
	//FUNCIONES PARA INSERTAR
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

	public void insertarUsuario(Usuario usuario) {//insertar usuario
		usuarios.add(usuario);
		codigoUsuarios++;
	}
	

	
	
	
	//FUNCIONES PARA BUSCAR BY ID
	public Cliente clienteById(String id) {//funcion para buscar cliente 
		Cliente aux = null;
		for (Cliente client : clientes) {
			if (client.getId().equalsIgnoreCase(id)) {
				aux = client;
			}
		}
		return aux;
	}
	
	//FUNCION PARA BUSCAR USER BY USERNAME
	
	public Usuario userbyUsername(String username,String passw) {
		Usuario aux = null;
		for (Usuario userForEach : usuarios) {
			if (userForEach.getUsuario().equalsIgnoreCase(username) && userForEach.getContrasena().equalsIgnoreCase(passw)){
				aux = userForEach;
			}
		}
		return aux;
	}
	
	public Cliente clienteByCedula(String cedula) {//funcion para buscar cliente por cedula
		Cliente aux = null;
		for (Cliente client : clientes) {
			if (client.getCedula().equalsIgnoreCase(cedula)) {
				aux = client;
			}
		}
		return aux;
	}
	
	
	
	
	public Contratos contratoById(String id) { //funcion para buscar contrato 
		Contratos aux = null;
		for (Contratos contrat : contrato) {
			if (contrat.getId().equalsIgnoreCase(id)) {
				aux = contrat;
			}
		}
		return aux;
	}
	
	public Proyectos proyectoById(String id) {//funcion para buscar proyecto 
		Proyectos aux = null;
		for (Proyectos proyect : proyectos) {
			if (proyect.getId().equalsIgnoreCase(id)) {
				aux = proyect;
			}
		}
		return aux;
	}
	
	
	public Trabajadores trabajadorById(String id) { //funcion para buscar trabajador 
		Trabajadores aux = null;
		for (Trabajadores trabajador : trabajadores) {
			if (trabajador.getId().equalsIgnoreCase(id)) {
				aux = trabajador;
			}
		}
		return aux;
	}

	
	
	
	
	
	//FUNCIONES PARA CALCULAR PRECIO 
	public float precioPorProyecto(int dias,String idParaBuscar) {
		float montoAux=0;
		float monto=0;
		float jornadaDiaCompleto = 8*dias; //8 de 8 horas por dia
		for (int contador = 0; contador < contratoById(idParaBuscar).getProyecto().getTrabajadores().size(); contador++) {
			montoAux = contratoById(idParaBuscar).getProyecto().getTrabajadores().get(contador).getSalarioHoras()*jornadaDiaCompleto;
			monto += montoAux;
			montoAux = 0;
		}  return monto;
		
	}
	
	
//FUNCION PARA CALCULAR FECHA 
	
	
	public int calculoDias(JDateChooser fechaInicio, JDateChooser fechaFin) {
		int dias = 0;
		
		if (fechaInicio.getDate()!=null && fechaFin.getDate()!=null) {
			Calendar init=fechaInicio.getCalendar();
			Calendar end=fechaFin.getCalendar();
		
			while(init.before(end) || init.equals(end)) {
				dias++;
				init.add(Calendar.DATE, 1);
			}
			
		}
		return dias;	
	}


public boolean clienteEsRemovible(String id) {
	boolean removible = true;
	for (Contratos contract : contrato) {
		if (contract.getIdCliente().equalsIgnoreCase(id)) {
			removible = false;
			
		}
	}
	return removible;
}

public void RemoverCliente(Cliente cliente) {
	clientes.remove(cliente);
   }

public boolean TrabajadorEsRemovible(String id) {
	boolean removible = true;
	for (Proyectos project : proyectos) {
		for (Trabajadores aux : project.getTrabajadores()) {
			if (aux.getId().equalsIgnoreCase(id)) {
				removible = false;
				
			}
		}
	}
	return removible;
}

public void removeWorker(Trabajadores trabajador) {
	trabajadores.remove(trabajador);
}

public Usuario usuarioById(String id) {
	Usuario aux = null;
	for (Usuario user : usuarios) {
		if (user.getId().equalsIgnoreCase(id)) {
			aux = user;
			break;
		}
	}
	return aux;
}

public boolean VerificarUsuario(Usuario user) {
	boolean validar = true;
	for (Usuario aux : usuarios) {
		if (aux.getNombre().equals(user.getNombre()) && !aux.getId().equalsIgnoreCase(user.getId())) {
			validar = false;
			break;
		}
	}
	return validar;
}


public boolean verificarAdminExistente() {
	boolean existe = false;
	int i = 0;
	for (Usuario usuarioAux : usuarios) {
		if (usuarioAux.getTipo().equalsIgnoreCase("administrador") && usuarioAux.isEstado()) {  
			i++;
		}
	}
	
	if (i > 1) {
		existe = true;
	}
	return existe;

}
}
