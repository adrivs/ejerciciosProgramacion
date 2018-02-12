
public class Pizza {

	private String tamano;
	
	private String tipo;
	
	private String estado;
	
	private static int totalPedidas = 0;
	
	private static int totalServidas = 0;
	
	
	public Pizza () {
		Pizza.totalPedidas++;
		estado = "pedida";
	}
	
		
	public Pizza(String tamano, String tipo) {
	
		this.tamano = tamano;
		this.tipo = tipo;
		estado = "pedida";
		Pizza.totalPedidas++;
	}
	
	public static int getTotalPedidas() {
		return Pizza.totalPedidas;
	}


	public static int getTotalServidas() {
		return Pizza.totalServidas;
	}


	public String getTamano() {
		return tamano;
	}


	public void setTamano(String tamano) {
		this.tamano = tamano;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	public String toString() {
		return "Pizza -> Tamaño: " + tamano + ", Tipo: " + tipo + ", Estado: " + estado;
	}
	
	public void sirve () {
		
		if (estado == "pedida") {
			
			Pizza.totalServidas++;
			estado = "servida";
			
		} else {
			
			System.out.println("Esa pizza ya se ha servido.");
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
