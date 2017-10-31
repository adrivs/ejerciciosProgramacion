import java.util.Scanner;

public class T5EJ10 {
	
	public static void main (String[] args) {
		
    int contador=0;
    double suma = 0;
    double num;
    
    do {
      
      Scanner s = new Scanner(System.in);
      
      
      System.out.print("Introduce un número: ");
      num = Double.parseDouble(s.nextLine());
      suma += num;
      contador++;
      
      
      } while (num > 0);
      
      System.out.print("Media = " + (suma/contador));
    
    
    
    
    
    
    
    
    
    
	}
}

