import java.util.Scanner;

public class T6EJ17 {
	
	public static void main (String[] args) {
		
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int altura = Integer.parseInt(s.nextLine());
    
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int anchura = Integer.parseInt(s.nextLine());
    
    int x = (int)(Math.random()*(anchura-2));
    int y = (int)(Math.random()*(altura-2));
    
    System.out.print("x: " + x + "y: " + y);
    System.out.println();
    
    
    
    
    for (int w = 0; w < anchura; w++) {
      
      System.out.print("* ");
      
    }
    
    System.out.println();
    
    for (int i = 0; i < altura-2; i++) {
      
      System.out.print("*");
      
      for (int j = 0; j < (anchura*2)-3; j++) {
        
        if (i == y && j == x) {
          
            System.out.print("&");
            
        }
        
        System.out.print(" ");
        
      }
      System.out.print("*");
      System.out.println();
      
    }
    
   
    
    for (int k = 0; k < anchura; k++) {
      
      System.out.print("* ");
      
    }
    
    
	}
}

