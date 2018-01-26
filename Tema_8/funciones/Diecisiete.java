package funciones;

import java.util.Scanner;
import numeros.Matematicas;

public class Diecisiete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce un número en binario: ");
		int numero = Integer.parseInt(s.nextLine());
		int aux = numero;
		
		int aux2 = 0;
		
		
		int resultado = 0;
		
		int diez = 10;
		
		
		int digitos = Matematicas.digitos(numero);
		
		
		for (int i = 0; i < digitos; i++) {
			
			aux2 = aux%diez;
			
			resultado += Matematicas.potencia(2, i)*aux2;
			
			aux/=10;
			
			
			
		}
		
		//System.out.println(digitos);
		System.out.print(resultado);
		
		
		
		
		
	}

}
