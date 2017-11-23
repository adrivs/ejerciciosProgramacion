public class T6EJ05 {
	
	public static void main (String[] args) {
    
    int acumulador = 0;
    int maximo = 1;
    int minimo = 9999999;
    
    
    for (int i = 0; i < 50; i++) {
      int numero = ((int)(Math.random()*100)+100);
      System.out.print(numero + " ");
      
      if (maximo < numero) {
        
        maximo = numero;
        
      } 
        
      if (numero < minimo){
          
          minimo = numero;          
          
      }
          
      acumulador+=numero;
      
    }
    System.out.println();
    System.out.println("Media = " + (acumulador/50));
    System.out.println("Mínimo = " + minimo);
    System.out.print("Máximo = " + maximo);
    
    
	}
}

