import java.util.Scanner;

public class T5EJ19 {
	
	public static void main (String[] args) {
    
    Scanner s = new Scanner (System.in);
    
    String esp = "a";
    
    System.out.print("Introduce la altura de la pirámide: ");
    int h = Integer.parseInt(s.nextLine());
    
     
    System.out.print("Introduce el carácter por le que estaŕa formada la pirámide: ");
    String c = s.nextLine();
    int h2 = 1;
    
    
    
    do {
      
      
      System.out.print(esp);
      h2++;
      
      } while (h2 < h);
      
      
    
		
	}
}

