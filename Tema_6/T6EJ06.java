import java.util.Scanner;

public class T6EJ06 {
	
	public static void main (String[] args) {
		
    Scanner s = new Scanner (System.in);
    int numeroSecreto = ((int)(Math.random()*100));
    int intentos = 5;
    int numeroIntroducido;
    
    System.out.print("Dime un número (entre 0 y 100) a ver si lo aciertas: ");
    System.out.print(numeroSecreto);
    numeroIntroducido = Integer.parseInt(s.nextLine());
    
    do {
    
      if (numeroSecreto != numeroIntroducido) {
        
          System.out.print("No has acertado. ");
          
          if (numeroIntroducido > numeroSecreto) {
            
          System.out.println("El número que has introducido es mayor al que has de adivinar.");
          
          intentos--;
          System.out.println("Te quedan " + intentos + " intentos.");
          System.out.print("Vuelve a introducir un número: ");
          numeroIntroducido = Integer.parseInt(s.nextLine());
          
          }
          
          if (numeroIntroducido < numeroSecreto) {
            
          System.out.println("El número que has introducido es menor al que has de adivinar.");
          
          intentos--;
          System.out.println("Te quedan " + intentos + " intentos.");
          System.out.print("Vuelve a introducir un número: ");
          numeroIntroducido = Integer.parseInt(s.nextLine());
          }
          
      } else {
          
          System.out.print("¡Has acertado!");
          intentos = 0;
        
        }
      
      } while (numeroIntroducido != numeroSecreto || intentos > 0);
    
    
	}
}

