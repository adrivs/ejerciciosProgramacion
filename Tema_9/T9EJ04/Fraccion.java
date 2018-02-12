
public class Fraccion {

	int numerador;
	int denominador;

	public Fraccion() {

	}

	public Fraccion(int numerador, int denominador) {

		if (denominador == 0) {

			System.out.println("El denominador no puede ser cero.");

		} else {
			
			this.numerador = numerador;
			this.denominador = denominador;			
		}

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

	public String toString() {

		return this.numerador + "/" + this.denominador;

	}

	public Fraccion multiplicar(Fraccion fraccion) {

		Fraccion resultado = new Fraccion();

		resultado.setNumerador(this.numerador * fraccion.getNumerador());
		resultado.setDenominador(this.denominador * fraccion.getDenominador());

		return resultado;
	}
	
	public Fraccion multiplicar (int n) {
		
		Fraccion resultado = new Fraccion();

		resultado.setNumerador(this.numerador * n);
		
		return resultado;
		
	}

	public Fraccion dividir(Fraccion fraccion) {

		Fraccion resultado = new Fraccion();

		resultado.setNumerador(this.numerador * fraccion.getDenominador());
		resultado.setDenominador(this.denominador * fraccion.getNumerador());

		return resultado;

	}
	
	public Fraccion dividir (int n) {
		
		Fraccion resultado = new Fraccion();
		
		resultado.setDenominador(this.denominador * n);

		return resultado;
		
	}

	public void invertir() {

		int aux = this.numerador;
		this.numerador = this.denominador;
		this.denominador = aux;

	}

}
