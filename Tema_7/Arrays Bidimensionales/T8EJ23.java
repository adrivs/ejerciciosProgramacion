// EJ 6 ARRAYS BIDIMENSIONALES
public class T8EJ23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] array = new int [6][10];
		
		int max = 0;
		int min = 9999;
		int aux = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array[i].length; j++) {
				 
				array[i][j] = (int)(Math.random()*1001);
				
				if (array[i][j] == aux) {
					
					array[i][j] = (int)(Math.random()*1001);
					aux = array[i][j];
				
				}
				
				if (array[i][j] > max){
			        max = array[i][j];
			      } else if (array[i][j] < min){
			        min = array[i][j];
			      }
				
				System.out.println(array[i][j]);
				
			}
			
		}
		
		
		System.out.println("M�nimo: " + min);
		System.out.println("M�ximo: " + max);
	}

}
