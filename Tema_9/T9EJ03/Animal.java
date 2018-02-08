
public abstract class Animal {

	String sexo;
	String color;
	int peso;
	int edad;
	int altura;
	
	public Animal () {
		
	}
	
	public Animal (String sexo, String color, int peso, int edad, int altura) {
		
		this.sexo = sexo;
		this.color = color;
		this.peso = peso;
		this.edad = edad;
		this.altura = altura;
		
	}
	
	public void dormir () {
		
		System.out.println("ZzZzZzZzZz...");
		
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Animal -> sexo: " + sexo + ", color: " + color + ", peso: " + peso + ", edad: " + edad + ", altura: " + altura;
	}
	
	
	
	
	
	
	
	
}
