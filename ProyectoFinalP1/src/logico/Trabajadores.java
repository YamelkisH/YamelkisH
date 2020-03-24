package logico;

import java.util.ArrayList;

public abstract class Trabajadores extends Persona {
	
	protected float SalarioHoras;
	protected ArrayList<String> Proyectos;
	
	public Trabajadores(String id, String cedula, String nombre, String apellido, String direccion, String genero,
			int edad, String celular, String correo, float SalarioHoras, ArrayList<String> Proyectos) {
		super(id, cedula, nombre, apellido, direccion, genero, edad, celular, correo);
		this.SalarioHoras = SalarioHoras;
		this.Proyectos = Proyectos;
	}

	public float getSalarioHoras() {
		return SalarioHoras;
	}

	public void setSalarioHoras(float salarioHoras) {
		SalarioHoras = salarioHoras;
	}

	public ArrayList<String> getProyectos() {
		return Proyectos;
	}

	public void setProyectos(ArrayList<String> proyectos) {
		Proyectos = proyectos;
	}

}
