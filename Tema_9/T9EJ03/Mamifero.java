
public class Mamifero extends Animal {


	public Mamifero () {
		super();
	}
	
	public Mamifero(String sexo, String color, int peso, int edad, int altura) {

		super(sexo, color, peso, edad, altura);
	}
	
	public void amamanta () {
		
		if (super.getSexo() == "macho") {
			
			System.out.print("No puedo amamantar");
			
		} else {
			
			System.out.print("Toma pecho");
			
		}
	}
	
	
	@Override
	public String toString() {
		return "Mamifero [sexo: " + sexo + ", color: " + color + ", peso: " + peso + ", edad: " + edad + ", altura: "
				+ altura;
	}
	
}
