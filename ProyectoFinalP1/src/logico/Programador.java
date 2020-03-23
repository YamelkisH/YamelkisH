package logico;

import java.util.ArrayList;

public class Programador extends Trabajadores {
	
	private ArrayList<String> lenguajesProgramacion;
	public Programador(String id, String cedula, String nombre, String apellido, String direccion, String genero,
			int edad, String celular, String correo, float SalarioHoras, ArrayList<String> Proyectos,
			ArrayList<String> lenguajesProgramacion) {
		super(id, cedula, nombre, apellido, direccion, genero, edad, celular, correo, SalarioHoras, Proyectos);
		this.lenguajesProgramacion = lenguajesProgramacion;
	}
	public ArrayList<String> getLenguajesProgramacion() {
		return lenguajesProgramacion;
	}
	public void setLenguajesProgramacion(ArrayList<String> lenguajesProgramacion) {
		this.lenguajesProgramacion = lenguajesProgramacion;
	}

}
