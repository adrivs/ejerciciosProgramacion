
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] array = new int [9][9];
		int[] diagonal = new int [9];
				
		System.out.println("Matriz 9x9");
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array[i].length; j++) {
				
				array[i][j] = (int)(Math.random()*101);
				
				if (i+j == 8) {
					diagonal [i] = array[i][j];
				}
			}
		}
		
		for (int w = 0; w < array.length; w++) {
			for (int x = 0; x < array[w].length; x++) {
				System.out.print(array[w][x] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Diagonal");
		for (int h = 8; h > -1; h--) {
			System.out.print(diagonal[h] + " ");
		}
		

	}

}
