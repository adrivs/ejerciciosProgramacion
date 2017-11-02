import java.util.Scanner;

public class T5EJ12 {
	
	public static void main (String[] args) {
		
    Scanner s = new Scanner (System.in);
    
    
    System.out.println(" - SERIE DE FIBONACCI -");
    
    int fst = 0;
    int scd = 1;
    int total = 0;
    
    System.out.print("Dime los 'n' primeros términos que quieres que tenga la serie: ");
    int n = Integer.parseInt(s.nextLine());
    
    if (n == 1) {
      
      System.out.println("0");
      
      } else {
        
          if (n == 2) {
            
              System.out.println("0");
              System.out.println("1");
            
  
            
            } else {
              
                System.out.println("0");
                System.out.println("1");
                n -= 2;
              
                for (int i = 0; i < n; i++) {
      
                  total = fst + scd;

                  System.out.println(total);
        
                  fst = scd;
                  scd = total; 
                  
                  }
              
      }
    }
	}
}

