import java.util.Scanner;

public class T5EJ14 {
	
	public static void main (String[] args) {
		
      Scanner s = new Scanner (System.in);
      
      int aux =1;
      int total = 0;
      
      
      System.out.print("Introduce la base: ");
      int base = Integer.parseInt(s.nextLine());
      
      System.out.print("Introduce el exponente: ");
      int expo = Integer.parseInt(s.nextLine());
      
      for (int i = 0; i < expo; i++) {
        
         aux *= base;
         
         total = aux;
                               
        }
        
        System.out.print("Resultado = " + total);
	}   
}

