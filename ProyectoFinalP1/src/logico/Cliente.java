package logico;

import java.util.Date;

public class Cliente extends Persona {
	private int cantProyectos;
	private Date FechaRegistro;
	
	public Cliente(String id, String cedula, String nombre, String apellido, String direccion, String genero, int edad,
			String celular, String correo, int cantProyectos, Date fechaRegistro) {
		super(id, cedula, nombre, apellido, direccion, genero, edad, celular, correo);
		this.cantProyectos = cantProyectos;
		FechaRegistro = fechaRegistro;
	}

	public int getCantProyectos() {
		return cantProyectos;
	}

	public void setCantProyectos(int cantProyectos) {
		this.cantProyectos = cantProyectos;
	}

	public Date getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}
	

}
