import java.util.Scanner;

public class T7EJ09 {
	
	public static void main (String[] args) {
		
    
    Scanner s = new Scanner (System.in);
    
    int[] array;
    array = new int[8];
    
    int numeroIntroducido = 0;
    
    for (int i = 0; i < 8; i++) {
    
      System.out.print("Escribe un número: ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      
      array[i] = numeroIntroducido;
      
    }
    
    System.out.println();
    
    for (int j = 0; j < 8; j++) {
      
      
    if (array[j]%2 == 0) {
        
          System.out.println(array[j] + " es par.");
        
      }
      
      if (array[j]%2 != 0) {
      
        System.out.println(array[j] + " es impar.");
      
      }  
      
    }
    
	}
}

