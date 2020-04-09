package logico;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Trabajadores extends Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	protected float SalarioHoras;
	protected ArrayList<String> proyectos;
	
	public Trabajadores(String id, String cedula, String nombre, String apellido, String direccion, String genero,
			int edad, String celular, float salarioHoras) {
		super(id, cedula, nombre, apellido, direccion, genero, edad, celular);
		
		SalarioHoras = salarioHoras;
		this.proyectos = new ArrayList<>();
	}

	public float getSalarioHoras() {
		return SalarioHoras;
	}

	public void setSalarioHoras(float salarioHoras) {
		SalarioHoras = salarioHoras;
	}

	public ArrayList<String> getProyectos() {
		return proyectos;
	}

	public void setProyectos(ArrayList<String> proyectos) {
		this.proyectos = proyectos;
	}
	


}
