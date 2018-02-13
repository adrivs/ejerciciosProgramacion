
public class Ave extends Animal {

	
	String raza;
	
	public Ave() {
		super();
	}
	
	public Ave (String sexo, String color, int peso, int edad, int altura, String raza) {

		super(sexo, color, peso, edad, altura);
		this.raza = raza;
	}
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void canta () {
		
		
		int probabilidad = (int) (Math.random() * 11) +1;
		
		if (probabilidad < 6) {
			
			System.out.println("No tengo ganas de cantar ¬¬");
			
		} else {
			
			
			System.out.println("Pio pio pio pio pio..");
			
		}
	}
	
	public void volar () {
		
		
		if (this.getRaza() == "gallina" || this.getRaza() == "pinguino" ) {
			
			System.out.println("Las gallinas no vuelan!");
			
		} else {
			
			
			System.out.println("Volando vooooy, volando vengoo");
			
		}
		
		
	}

}
