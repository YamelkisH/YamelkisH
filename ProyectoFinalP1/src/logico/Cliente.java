package logico;

import java.io.Serializable;
import java.util.Date;

public class Cliente extends Persona implements Serializable {
	private static final long serialVersionUID = -682238514559973065L;
	private int cantProyectos;
	private Date FechaRegistro;
	
	public Cliente(String id, String cedula, String nombre, String apellido, String direccion, String genero,  int edad, String celular) {
		super(id, cedula, nombre, apellido, direccion, genero, edad, celular);
		this.cantProyectos = 0;
		FechaRegistro = new Date();
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
