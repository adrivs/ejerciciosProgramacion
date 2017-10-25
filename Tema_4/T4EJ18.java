public class T4EJ18 {
	
	public static void main (String[] args) {
			System.out.print ("Introduce un número entero (máximo 5 cifras): ");
      int n = Integer.parseInt(System.console().readLine());
      
      if (n < 10) {
        
        System.out.println ("Como solo tiene un numero, ese es la primera cifra.");
        System.out.print ("En este caso: " + n);
        
        } else {
          
          if ((n >= 10) && n < 100) {
        
          System.out.print ("La primera cifra es: " + n/10);
        
        } else {
          
          if ((n >= 100) && n < 1000) {
        
          System.out.print ("La primera cifra es: " + n/100);
        
        } else {
          
          
          if ((n >= 1000) && n < 10000) {
        
          System.out.print ("La primera cifra es: " + n/1000);
        
          } else {
            
            if ((n >= 10000) && n < 100000) {
        
            System.out.print ("La primera cifra es: " + n/10000);
        
            }
          }
        }
      }
    }
	}
}

