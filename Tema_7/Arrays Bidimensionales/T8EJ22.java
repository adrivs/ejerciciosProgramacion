// EJ 5 ARRAYS BIDIMENSIONALES.
public class T8EJ22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] array = new int [6][10];
		
		int max = 0;
		int min = 9999;
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array[i].length; j++) {
				 
				array[i][j] = (int)(Math.random()*1001);
				
				if (array[i][j] > max){
			        max = array[i][j];
			      } else if (array[i][j] < min){
			        min = array[i][j];
			      }
				
			}
			
		}
		
		
		System.out.println("Mínimo: " + min);
		System.out.println("Máximo: " + max);
		
	}

}
