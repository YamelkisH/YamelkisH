package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class Planificador extends Trabajadores implements Serializable {
	private static final long serialVersionUID = 1L;

	private int cantidadDias;
	
	public Planificador(String id, String cedula, String nombre, String apellido, String direccion, String genero,
			int edad, String celular, String correo, float SalarioHoras, ArrayList<String> Proyectos,
			int cantidadDias) {
		super(id, cedula, nombre, apellido, direccion, genero, edad, celular, correo, SalarioHoras);
		this.cantidadDias = cantidadDias;
	}

	public int getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}
	

}
