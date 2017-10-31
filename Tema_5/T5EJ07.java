public class T5EJ07 {
	
	public static void main (String[] args) {
		
    
    System.out.print("Introduce la combinación correcta de la caja fuerte: ");
    int comb = Integer.parseInt(System.console().readLine());
    
    do {
      
      if (comb == 6666) {
        
        
        System.out.print("La caja fuerte se ha abierto correctamente.");
        
        
        } else {
          
            System.out.print("Lo siento, esa no es la combinación.");
            int i = 0;
            System.out.print("Introduce la combinación correcta de la caja fuerte: ");
            int comb = Integer.parseInt(System.console().readLine());
            i++;
          }
      
      } while ( i < 3);
      
      
    }
	}


