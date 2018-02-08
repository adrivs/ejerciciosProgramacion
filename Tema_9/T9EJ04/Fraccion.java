//invierte, simplifica, multiplica, divide...
public class Fraccion {

	
	private int numerador;
	private int denominador;
	
	public Fraccion () {
		
	}
	
	public Fraccion (int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public String toString (Fraccion fraccion) {
		
		
		return (fraccion.getNumerador() + "/" + fraccion.getDenominador());
		
	}
	
	public int multiplica (Fraccion fraccion) {
		
		int resultado = 0;
		int nuevoNum = 0;
		int nuevoDen = 0;
		
		nuevoNum = this.numerador*fraccion.getNumerador();
		nuevoDen = this.denominador*fraccion.getDenominador();
		
		resultado = nuevoNum/nuevoDen;
		
		return resultado;
	}
	
	public Fraccion invierte (Fraccion fraccion) {
		
		Fraccion nuevaFraccion = new Fraccion(0,0);
		
		nuevaFraccion.setNumerador(this.numerador);
		nuevaFraccion.setDenominador(this.denominador);
		
		return nuevaFraccion;
		
	}
	
	public int divide (Fraccion fraccion) {
		
		int resultado = 0;
		int nuevoNum = 0;
		int nuevoDen = 0;
		
		nuevoNum = this.numerador*fraccion.getDenominador();
		nuevoDen = this.denominador*fraccion.getNumerador();
		resultado = nuevoNum/nuevoDen;
		
		return resultado;
		
		
	}
	
	
	
	
	
	
}
