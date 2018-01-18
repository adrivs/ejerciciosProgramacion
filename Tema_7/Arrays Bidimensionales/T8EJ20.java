import java.util.Scanner;

public class T8EJ20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		final int FILA = 4;
		final int COLUMNA = 5;
		
		int [][] array = new int [FILA][COLUMNA];
		
		int sumaFila = 0;
		int sumaColumna = 0;
		int sumaTotal = 0;
		int numRandom = 0;
		
		 
		System.out.println("Introduce los números enteros en el array.");
		
//		Introducir datos en el array
		for (int i = 0; i < FILA; i++) {
			
			for (int j = 0; j < COLUMNA; j++) {
				
				numRandom = (int)(Math.random()*100) + 100; // ARREGLAR ESTO DEL NUM. RANDOM!!
				array[i][j] = numRandom;
				System.out.print("Fila: " + i + " " + "Columna: " + j + " " + "-> " + array[i][j]);
				System.out.println();
				
			}
			
		}
		
		
		System.out.println("---------------------------");
		
		// Suma fila
		for (int k = 0; k < FILA; k++) {
			
			sumaFila = 0;
			for (int w = 0; w < COLUMNA; w++) {
				
				sumaFila += array[k][w];
				sumaTotal += array[k][w];
				
			}
			System.out.println("Suma de la fila " + k + " = " + sumaFila);
		}
		
		System.out.println("---------------------------");
		
		// Suma columna
		
		for (int h = 0; h < COLUMNA; h++) {
			
			sumaColumna = 0;
			for (int q = 0; q < FILA; q++) {
				
				sumaColumna += array[q][h];
				
		
			}
			
			System.out.println("Suma de la columna " + h + " = " + sumaColumna);
		}
		
		
		System.out.println("---------------------------");
		
		
		System.out.print("TOTAL = " + sumaTotal);
		
		
	}

}