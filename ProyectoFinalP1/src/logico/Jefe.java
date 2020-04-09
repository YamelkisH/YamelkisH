package logico;

import java.io.Serializable;

public class Jefe extends Trabajadores implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	private int cantidadTrabajadores;
	private int annosExperiencia;

	public Jefe(String id, String cedula, String nombre, String apellido, String direccion, String genero, int edad,
			String celular, String correo, float salarioHoras,int cantidadTrabajadores, int annosExperiencia) {
		super(id, cedula, nombre, apellido, direccion, genero, edad, celular, correo, salarioHoras);
		this.cantidadTrabajadores = cantidadTrabajadores;
		this.annosExperiencia = annosExperiencia;
		// TODO Auto-generated constructor stub
	}


	public int getCantidadTrabajadores() {
		return cantidadTrabajadores;
	}


	public void setCantidadTrabajadores(int cantidadTrabajadores) {
		this.cantidadTrabajadores = cantidadTrabajadores;
	}


	public int getAnnosExperiencia() {
		return annosExperiencia;
	}


	public void setAnnosExperiencia(int annosExperiencia) {
		this.annosExperiencia = annosExperiencia;
	}

	
	
/*	public Jefe(String id, String cedula, String nombre, String apellido, String direccion, String genero,
			int edad, String celular, String correo, float salarioHoras, int cantidadTrabajadores, int annosExperiencia) {
		super(id, cedula, nombre, apellido, direccion, genero, edad, celular, cantidadTrabajadores, annosExperiencia);
		
		SalarioHoras = salarioHoras;
		this.proyectos = new ArrayList<>();
	}


	public int getCantidadTrabajadores() {
		return cantidadTrabajadores;
	}

	public void setCantidadTrabajadores(int cantidadTrabajadores) {
		this.cantidadTrabajadores = cantidadTrabajadores;
	}

	public int getAnnosExperiencia() {
		return annosExperiencia;
	}

	public void setAnnosExperiencia(int annosExperiencia) {
		this.annosExperiencia = annosExperiencia;
	}
	
	
	
	/*
	 * 
	 * 
	 * 
	 *public Boss(String code, String id, String name, String last_name, String address, String gender, int age, String phone, float salary, int cant_workers, int experience_years) {
		super(code, id, name, last_name, address, gender, age, phone, salary);
		this.cant_workers = cant_workers;
		this.experience_years = experience_years;
	}

	public int getCant_workers() {
		return cant_workers;
	}

	public void setCant_workers(int cant_workers) {
		this.cant_workers = cant_workers;
	}

	public int getExperience_years() {
		return experience_years;
	}

	public void setExperience_years(int experience_years) {
		this.experience_years = experience_years;
	}
	 * 
	 */
}
