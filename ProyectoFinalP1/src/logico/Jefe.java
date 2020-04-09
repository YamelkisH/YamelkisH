package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class Jefe extends Trabajadores implements Serializable {
	private static final long serialVersionUID = -6545106401838653375L;

	
	private int cantidadTrabajadores;
	private int annosExperiencia;
	
	public Jefe(String id, String cedula, String nombre, String apellido, String direccion, String genero, int edad,
			String celular, String correo, float SalarioHoras, ArrayList<String> Proyectos, int cantidadTrabajadores,
			int annosExperiencia) {
		super(id, cedula, nombre, apellido, direccion, genero, edad, celular, correo, SalarioHoras, Proyectos);
		this.cantidadTrabajadores = cantidadTrabajadores;
		this.annosExperiencia = annosExperiencia;
	}

	public int getCantidadTrabajadores() {
		return cantidadTrabajadores;
	}

	public void setCantidadTrabajadores(int cantidadTrabajadores) {
		this.cantidadTrabajadores = cantidadTrabajadores;
	}

	public int getAnnosExperiencia() {
		return annosExperiencia;
	}

	public void setAnnosExperiencia(int annosExperiencia) {
		this.annosExperiencia = annosExperiencia;
	}
}
