package ejercicios20al28;

public class ArrayUni {

	public static int[] generaArrayInt(int tamano, int maximo, int minimo) {

		int[] array = new int[tamano];
		
		for (int i = 0; i < tamano; i++) {
			int numero = (int) (Math.random() * maximo-minimo+1) + minimo;
			array[i] = numero;
		}
		
		return array;
	}

	public static int minimoArrayInt(int[] array) {

		
		int minimo = 999;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < minimo){
		        minimo = array[i];
		      }
			
		}
		
		return minimo;
		
	}
	
	public static int maximoArrayInt(int [] array) {
		
		int maximo = 0;
		
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > maximo){
		        maximo = array[i];
		      }
			
		}
		
		return maximo;
	}
	
	public static int mediaArrayInt(int[] array) {
		
		int acumulador = 0;
		
		for (int i = 0; i < array.length; i++) {
			acumulador += array[i];
		}
		
		return (acumulador/array.length);
		
	}
	
	public static boolean estaEnArrayInt(int[] array, int numero) {
		
		boolean resultado = false;
		int aux;
		
		for (int i = 0; i < array.length; i++) {
			
			aux = array[i];
			
			if (aux == numero) {
				resultado = true;
			}
			
		}
		
		return resultado;
		
	}

}
