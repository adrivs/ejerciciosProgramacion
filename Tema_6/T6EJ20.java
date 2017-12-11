import java.util.Scanner;

public class T6EJ20 {
	
	public static void main (String[] args) {
		
    Scanner s = new Scanner(System.in);
    
    int ancho = 6;
    
    int capacidad = 0;
    
    char caracter = '=';
    
    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    capacidad = Integer.parseInt(s.nextLine());
    
    int cantidad = (int)(Math.random()*(capacidad+1));
    
    System.out.print("*    *");
    System.out.println();
    
    for (int i = 0; i < capacidad-1; i++) {
      
      System.out.print("*");
      
      for (int j = 0; j < ancho-2; j++) {
      
          System.out.print(caracter);
        
      }
      
          System.out.print("*");
          System.out.println();
    }
    
    
    System.out.print("******");
    
    
    
    
    
    
	}
}

