package ejercicios29a34;

public class ArrayBi {

	public static int [][] generaArrayBiInt(int f, int c, int min, int max) {
		
		int [][] resultado = new int [f][c];
		
		
		for (int i = 0; i < resultado.length; i++) {
			
			for (int j = 0; j < resultado[i].length; j++) {
				
				resultado[i][j] = (int)(Math.random() * (max-min) + 1); // la resta de max y min es porque si el minimo es 2 y el max 102 entre esos dos numeros
																		// hay 100 numeros, es decir: 102-2. Se le suma 1 para que empiece en 1. :D
			}
			
		}
				
		return resultado;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
