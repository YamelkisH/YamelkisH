package visual;

public class prueba {
   

	private String hola;
	private int numero = 0;
	
	
	
	 public prueba(String hola) {
			super();
			this.hola = hola;
		}

	public String getHola() {
		return hola;
	}

	public void setHola(String hola) {
		this.hola = hola;
	}

	public prueba(String hola, int numero) {
		super();
		this.hola = hola;
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	 

}
