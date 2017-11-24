public class T6EJ10 {
	
	public static void main (String[] args) {
		
    int numero = (int)(Math.random()*6);
    char caracter = ' ';
      
    if (numero == 0) {
      
      caracter = '*';
      
    }
    
    if (numero == 1) {
      
      caracter = '-';
            
    }
    
    if (numero == 2) {
      
      caracter = '=';
            
    }
    
    if (numero == 3) {
      
      caracter = '.';
            
    }
    
    if (numero == 4) {
      
      caracter = '|';
            
    }
    
    if (numero == 5) {
      
      caracter = '@';
            
    }
    
    for (int i = 0; i < 10; i++) {
      int longitud = (int)((Math.random()*40)+1);
        for (int j = 0; j < longitud; j++) {
          
          System.out.print(caracter);
      
        }
      System.out.println();
    }
      
      
      
	}
}

