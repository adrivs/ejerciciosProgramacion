import java.util.Scanner;

public class T7EJ05 {
	
	public static void main (String[] args) {
		
    int maximo = 0;
    int minimo = 9999;
    
    
    Scanner s = new Scanner(System.in);
    
    int[] n;
    n = new int[10];
    
    int numeroIntroducido = 0;
    
    for (int i = 0; i < 10; i++) {
    
      System.out.print("Escribe un número: ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      
      n[i] = numeroIntroducido;
      
      if (numeroIntroducido < minimo) {
      
          minimo = numeroIntroducido;
      }
      
      if (numeroIntroducido > maximo) {
        
          maximo = numeroIntroducido;
      }
        
        
    }
    
    for (int j = 0; j < 10; j++) {
      
      System.out.print(n[j] + " ");
      
      if (n[j] == maximo) {
        System.out.print("(máximo) ");
        
        
      }
      
      if (n[j] == minimo) {
        
        System.out.print("(minimo) ");
        
        
      }
      
      System.out.println();
      
    }
  }
}

