package ejercicios20al28;

public class ArrayUni {

	
	public static void generaArrayInt(int tamano, int maximo, int minimo) {
		
		int[] array = new int [tamano];
		System.out.print("Array: ");
		for (int i = 0; i < tamano; i++) {
			int numero = (int)(Math.random() * maximo )+minimo;
			array[i] = numero;
			System.out.print(array[i] + " ");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
