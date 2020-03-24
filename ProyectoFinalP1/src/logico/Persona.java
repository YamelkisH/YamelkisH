package logico;

public abstract class Persona {
	
	protected String id;
	protected String Cedula;
	protected String Nombre;
	protected String Apellido;
	protected String Direccion;
	protected String Genero;
	protected int edad;
	protected String Celular;
	protected String Correo;

	public Persona(String id, String cedula, String nombre, String apellido, String direccion, String genero, int edad,
			String celular, String correo) {
		super();
		this.id = id;
		this.Cedula = cedula;
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Direccion = direccion;
		this.Genero = genero;
		this.edad = edad;
		this.Celular = celular;
		this.Correo = correo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCelular() {
		return Celular;
	}

	public void setCelular(String celular) {
		Celular = celular;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}
	
	
}
