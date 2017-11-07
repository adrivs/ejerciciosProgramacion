import java.util.Scanner;

public class T5EJ18 {
	
	public static void main (String[] args) {
		
    int aux;
    int aux2;
    
    Scanner s = new Scanner (System.in);
    
    System.out.print("Introduce un número: ");
    int n1 = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduce un otro número: ");
    int n2 = Integer.parseInt(s.nextLine());
    
    if (n1 == n2) {
      
      System.out.print("Los números introducidos deben ser distintos.");
      
      } else {
        
          if (n1 < n2) {
            
            do {
               
               n1+=7;
               aux = n1;
               System.out.println(aux);
         
         
         
         } while (aux < n2-7);
            
            } else {
              
              
                  do {
         
                    n2+=7;
                    aux = n2;
                    System.out.println(aux);
  
                    } while (aux < n1-7);
      }
    }
	}
}

