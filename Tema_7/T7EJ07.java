import java.util.Scanner;

public class T7EJ07 {
	
	public static void main (String[] args) {
		
    Scanner s = new Scanner(System.in);
    
    int[] array = new int[20];
    
    int numero = 0;
    int valor1 = 0;
    int valor2 = 0;
    
    for (int i = 0; i < 20; i++) {
    
        numero = (int)(Math.random()*101);
        array[i] = numero;
        System.out.print(array[i] + " ");
      
    }
    
    System.out.println();
    
    System.out.print("Introduce un valor: ");
    valor1 = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduce otro valor: ");
    valor2 = Integer.parseInt(s.nextLine());
    
    for (int j = 0; j < 20; j++) {
      
        if (array[j] == valor1) {
          
        array[j] = valor2;
          
        }
      
    }
    
     for (int k = 0; k < 20; k++) {
        
        if (array[k] == valor1) {
            
            valor2 = (char)('"'+valor2+'"');
          
        }
        
        System.out.print(array[k] + " ");
      
    }
    
    
    
	}
}

