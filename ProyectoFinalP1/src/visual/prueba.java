package visual;

public class prueba {
   

	private String hola;
	private int numero = 0;
	private int numero1 = 0;
	
	
	
	 public prueba(String hola, int numero, int numero1) {
			super();
			this.hola = hola;
			this.numero = numero;
			this.setNumero1(numero1);
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

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	 

}
