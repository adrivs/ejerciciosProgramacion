package ejercicios20al28;

public class ArrayUni {

	public static int[] generaArrayInt(int tamano, int maximo, int minimo) {

		int[] array = new int[tamano];
		
		for (int i = 0; i < tamano; i++) {
			int numero = (int) (Math.random() * maximo) + minimo;
			array[i] = numero;
		}
		
		return array;
	}

	public static int minimoArrayInt(int[] array) {

		
		int minimo = 999;
		int resultado = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < minimo){
		        minimo = array[i];
		      }
			
		}
		
		resultado = minimo;
		return resultado;
		
	}

}
