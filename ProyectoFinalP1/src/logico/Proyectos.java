package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class Proyectos implements Serializable {
	private static final long serialVersionUID = -6545106401838653375L;

	private String id;
	private String name;
	private ArrayList<Trabajadores> trabajadores;
	//	protected ArrayList<clase> nombre;

	private String tipo;
	private String lenguaje;
	private String estado;
	
	public Proyectos(String id, String name, ArrayList<Trabajadores> trabajadores, String tipo, String lenguaje,
			String estado) {
		super();
		this.id = id;
		this.name = name;
		this.trabajadores = new ArrayList<Trabajadores>();
		//ArrayList<clase>();
		this.tipo = tipo;
		this.lenguaje = lenguaje;
		this.estado = estado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Trabajadores> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(ArrayList<Trabajadores> trabajadores) {
		this.trabajadores = trabajadores;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
