import java.util.Scanner;

public class T5EJ23 {
	
	public static void main (String[] args) {
		
    Scanner s = new Scanner (System.in);
    
    int contador = 0;
    int media;
    int suma = 0;
    int n;
    
    
    do {
      
      System.out.print("Introduce un número: ");
      n = Integer.parseInt(s.nextLine());
      contador++;
      
      suma+=n;
      
      
      } while (suma < 10000);
      
      System.out.println("Suma total = " + suma);
      System.out.println("Números introducidos: " + contador);
      System.out.println("Media = " + suma/contador);
    
    
    
    
    
    
    
    
    
	}
}

