import java.util.Scanner;

public class T5EJ09 {
	
	public static void main (String[] args) {
		
    int contador = 1;
    
    
    Scanner s = new Scanner (System.in);
    
    System.out.print("Introduce un número: ");
    int num = Integer.parseInt(s.nextLine());
    
    int i = num;
    
    while (i>10) {
      
      i/= 10;
      contador++;
      
      }
      
      System.out.print(num + " tiene " + contador + " digito/s");
      
	}
}

