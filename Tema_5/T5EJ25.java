import java.util.Scanner;

public class T5EJ25 {
	
	public static void main (String[] args) {
		
      Scanner s = new Scanner (System.in);
      
      long volteado = 0;
               
      System.out.print("Introduce un número: ");
      long numeroIntroducido = Long.parseLong(s.nextLine());
      
      
      while (numeroIntroducido > 0) {
        
        volteado = (volteado*10) + (numeroIntroducido%10);
        numeroIntroducido /= 10;
        
        }
        
        System.out.print("Número volteado = " + volteado);
      
      
      
      
      
      
      
      
      
      
    
	}
}

