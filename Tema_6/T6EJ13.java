public class T6EJ13 {
	
	public static void main (String[] args) {
		
    int tirada = 1;
    int dado1 = 0;
    int dado2 = 0;
    
    do {
      
      dado1 =((int)(Math.random()*7)+1);
      dado2 =((int)(Math.random()*7)+1);
      
      System.out.println("Tirada nº " + tirada);
      System.out.println("Dado 1 = " + dado1);
      System.out.println("Dado 2 = " + dado2);
      System.out.println();
      
      tirada++;
      
      
      
      
    } while (dado1 != dado2);
    
    
    
    
    
    
	}
}

