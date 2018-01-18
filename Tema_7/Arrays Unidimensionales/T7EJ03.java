import java.util.Scanner;

public class T7EJ03 {
	
	public static void main (String[] args) {
		
    Scanner s = new Scanner(System.in);
    
    int[] n;
    n = new int[10];
    
    int numeroIntroducido = 0;
    
    for (int i = 0; i < 10; i++) {
    
      System.out.print("Escribe un número: ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      
      n[i] = numeroIntroducido;
        
    }
    
    for (int j = 9; j >= 0; j--) {
      
      
        System.out.print(n[j] + " ");
      
    }
    
    
    
    
    
    
    
    
    
    
    
    
	}
}

