
public class Caballo {

	private String nombre;
	private String raza;
	private String color;
	private String sexo;
	private int edad;
	private int peso;
	
	public Caballo (String nombre, String raza, String color, String sexo, int edad, int peso) {
		
		this.nombre = nombre;
		this.raza = raza;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public String getColor() {
		return color;
	}

	public String getSexo() {
		return sexo;
	}

	public int getEdad() {
		return edad;
	}

	public int getPeso() {
		return peso;
	}

	public void darComida (String comida) {
		
		if (comida.equals("heno") || comida.equals("paja") || comida.equals("hierba")) {
			
			System.out.println("¡Me gusta!");
			
		} else {
			
			
			System.out.println("Dame otra cosa... esto no me gusta.");
			
		}
		
	}
	
	public void relinchar() {
		
		System.out.println("Iihhhiiiihhhhiiiiiiiii...");
		
	}
	
	
	
	
	
	
	
	
	
}
