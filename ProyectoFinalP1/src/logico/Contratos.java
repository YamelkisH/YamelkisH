package logico;

import java.io.Serializable;
import java.util.Date;

public class Contratos implements Serializable{
	private static final long serialVersionUID = -6545106401838653375L;
	private String id;
	private Date fechaInicio;
	private Date fechaEntrega;
	private Date fechaFinal;
	private String idCliente;
	private Proyectos proyecto;
	private float precio;
	private String diaCierre;
	
	public Contratos(String id, Date fechaInicio, Date fechaEntrega, Date fechaFinal, String idCliente,
			Proyectos proyecto, float precio, String diaCierre) {
		super();
		this.id = id;
		this.fechaInicio = fechaInicio;
		this.fechaEntrega = fechaEntrega;
		this.fechaFinal = fechaFinal;
		this.idCliente = idCliente;
		this.proyecto = proyecto;
		this.precio = precio;
		this.diaCierre = diaCierre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public Proyectos getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyectos proyecto) {
		this.proyecto = proyecto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getDiaCierre() {
		return diaCierre;
	}

	public void setDiaCierre(String diaCierre) {
		this.diaCierre = diaCierre;
	}

}
