import java.util.Scanner;

public class T6EJ14 {
	
	public static void main (String[] args) {
   
     Scanner s = new Scanner(System.in);
       
     int numeroPC = 0;
     int intentos = 0;
     
     System.out.print("Dime un número entre 0 y 100 que te lo voy a adivinar: ");
     int numeroAdivinar = Integer.parseInt(s.nextLine());
     
     numeroPC = (int)(Math.random()*101);
     System.out.println("¿Es el " + numeroPC + "?");
     
    do {
    
     if (numeroPC == numeroAdivinar) {
       
       System.out.print("¡Acerte!");
       intentos = 5;
     }
     
     System.out.print("Escribe un 1 si es mayor o un 2 si es menor el número que has pensado: ");
     int m = Integer.parseInt(s.nextLine());
     
     if (m == 1) {
       
        numeroPC = (int)((Math.random()*101)+numeroAdivinar);
        System.out.println("El número que has pensado es el " + numeroPC + ". ");
       
     }
     
     if (m == 2) {
     
        numeroPC = (int)((Math.random()*numeroAdivinar));
        System.out.println("El número que has pensado es el " + numeroPC + ". ");
       
     }
     
      intentos++;
     
    } while (intentos < 5);
  
  
  
  
  
	}
}

