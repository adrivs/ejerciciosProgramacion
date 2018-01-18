import java.util.Scanner;

public class T7EJ08 {
	
	public static void main (String[] args) {
		
    Scanner s = new Scanner (System.in);
    
    int[] array = new int[12];
    
    char caracter = '*';
    int longitud = 0;
  
    
    for (int i = 0; i < 12; i++) {
      
        System.out.print("Introduce la temperatura del mes " + (i+1) + ": ");
        array[i] = Integer.parseInt(s.nextLine());
        
    }
    
    
    for (int j = 0; j < 12; j++) {
      
        longitud = array[j];
        System.out.println();
        
        do {
          
        System.out.print(caracter + " ");  
        longitud--;
        } while (longitud != 0);
        
    }
    
    
    
	}
}

