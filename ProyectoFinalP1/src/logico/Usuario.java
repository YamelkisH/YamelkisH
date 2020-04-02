package logico;

import java.io.Serializable;
import java.util.Date;

import logico.Persona;

public class Usuario extends Persona implements Serializable {
	
	private static final long serialVersionUID = 7082630249243275893L;
	private String usuario;
	private String contrasena;
	private String tipo;
	private String code;
	private Date ultimaEntrada;
	private boolean estado;
	
	public Usuario(String id, String cedula, String nombre, String apellido, String direccion, String genero, int edad,
			String celular, String correo, String usuario, String contrasena, String tipo, String code,
			Date ultimaEntrada, boolean estado) {
		super(id, cedula, nombre, apellido, direccion, genero, edad, celular, correo);
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.tipo = tipo;
		this.code = code;
		this.ultimaEntrada = ultimaEntrada;
		this.estado = estado;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getUltimaEntrada() {
		return ultimaEntrada;
	}

	public void setUltimaEntrada(Date ultimaEntrada) {
		this.ultimaEntrada = ultimaEntrada;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	

}
