import java.util.Scanner;

public class T5EJ26 {
	
	public static void main (String[] args) {
		
    
      Scanner s = new Scanner (System.in);
      
      int contador = 0;
      long numeroSupuesto;
      long divisor = 10;
                   
      System.out.print("Introduce un número: ");
      long numeroIntroducido = Long.parseLong(s.nextLine());
      
      System.out.print("Introduce un digito: ");
      int numeroASaber = Integer.parseInt(s.nextLine());
      
      do {
        
        
        numeroSupuesto = numeroIntroducido%divisor;
        contador++;
        divisor *= 10;
        
        } while (numeroSupuesto != numeroIntroducido);
      
     
    
	}
}

