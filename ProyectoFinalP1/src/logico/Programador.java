package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class Programador extends Trabajadores implements Serializable {
	private static final long serialVersionUID = -6545106401838653375L;

	private ArrayList<String> lenguajesProgramacion;
	
	public Programador(String id, String cedula, String nombre, String apellido, String direccion, String genero,
			int edad, String celular, String correo, float SalarioHoras, ArrayList<String> Proyectos,
			ArrayList<String> lenguajesProgramacion) {
		super(id, cedula, nombre, apellido, direccion, genero, edad, celular, correo, SalarioHoras, Proyectos);
		this.lenguajesProgramacion = new ArrayList<>();
	}

	public ArrayList<String> getLenguajesProgramacion() {
		return lenguajesProgramacion;
	}

	public void setLenguajesProgramacion(ArrayList<String> lenguajesProgramacion) {
		this.lenguajesProgramacion = lenguajesProgramacion;
	}

}
