import java.util.Scanner;

public class T5EJ16 {
	
	public static void main (String[] args) {
		
    int aux = 0;
      
    Scanner s = new Scanner (System.in);
    
    System.out.print("Introduce un número y te diré si es primo o no: ");
    int n = Integer.parseInt(s.nextLine());
    
    if (n == 2) {
      
      System.out.print(n + " es primo.");
      
      } else {
        
        for (int i = 1; i < n+1; i++) {
      
      aux = n%i;
                
      } if (aux == 0 && n%2 !=0) {
        
        System.out.print(n + " es primo.");
        
        } else {
          
          System.out.print(n + " no es primo.");
          
          }
        
        
        
        
        
        }
    
    
	}
}

