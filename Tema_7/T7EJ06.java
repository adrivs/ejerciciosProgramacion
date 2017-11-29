import java.util.Scanner;

public class T7EJ06 {
	
	public static void main (String[] args) {
		
    Scanner s = new Scanner (System.in);
    
    int[] original;
    original = new int[15];
    
    int[] cambiado;
    cambiado = new int[16];
    
    
    
    int numeroIntroducido = 0;
    
    for (int i = 0; i < 15; i++) {
    
      System.out.print("Escribe un número: ");
      numeroIntroducido = Integer.parseInt(s.nextLine());
      
      original[i] = numeroIntroducido;
      
      cambiado [i+1] = numeroIntroducido;    
      if (i == 14) {
        
      cambiado[0] = numeroIntroducido; 
        
      }
    }
    
    System.out.print("Array primero: ");
    for (int j = 0; j < 15; j++) {
      
      System.out.print(original[j] + " ");
            
    }
    
    System.out.println();
    System.out.print("Array rotado: ");
    
    for (int k = 0; k < 15; k++) {
      
      System.out.print(cambiado[k] + " ");
      
    }
    
    
    
    
    
    
    
    
	}
}

