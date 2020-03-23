package logico;

import java.util.ArrayList;

public class Dise�ador extends Trabajadores {
	
	private String Maestro;

	public Dise�ador(String id, String cedula, String nombre, String apellido, String direccion, String genero,
			int edad, String celular, String correo, float SalarioHoras, ArrayList<String> Proyectos, String maestro) {
		super(id, cedula, nombre, apellido, direccion, genero, edad, celular, correo, SalarioHoras, Proyectos);
		Maestro = maestro;
	}

	public String getMaestro() {
		return Maestro;
	}

	public void setMaestro(String maestro) {
		Maestro = maestro;
	}
}
