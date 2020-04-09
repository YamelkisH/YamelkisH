package logico;

import java.io.Serializable;

public class Diseñador extends Trabajadores implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String Maestro;

	public Diseñador(String id, String cedula, String nombre, String apellido, String direccion, String genero,
			int edad, String celular, float SalarioHoras, String maestro) {
		super(id, cedula, nombre, apellido, direccion, genero, edad, celular, SalarioHoras);
		Maestro = maestro;
	}

	public String getMaestro() {
		return Maestro;
	}

	public void setMaestro(String maestro) {
		Maestro = maestro;
	}
}
