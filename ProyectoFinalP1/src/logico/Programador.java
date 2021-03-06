package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class Programador extends Trabajadores implements Serializable {
	private static final long serialVersionUID = 1L;

	private ArrayList<String> lenguajesProgramacion;
	
	public Programador(String id, String cedula, String nombre, String apellido, String direccion, String genero,
			int edad, String celular, float SalarioHoras) {
		super(id, cedula, nombre, apellido, direccion, genero, edad, celular, SalarioHoras);
		
		this.lenguajesProgramacion = new ArrayList<>();
	}

	public ArrayList<String> getLenguajesProgramacion() {
		return lenguajesProgramacion;
	}

	public void setLenguajesProgramacion(ArrayList<String> lenguajesProgramacion) {
		this.lenguajesProgramacion = lenguajesProgramacion;
	}

	public void insertartLanguajes(String lenguajes) {
		this.lenguajesProgramacion.add(lenguajes);
	}
}
