import java.util.Scanner;

public class T5EJ21 {
	
	public static void main (String[] args) {
		
    
    Scanner s = new Scanner (System.in);
    
    int contador = 0;
    int n;
    int aux = 0;
    int media = 0;
    int aux2 = 0;
    int mayor = 0;
   
    do {
      
      System.out.print("Introduce un número: ");
      n = Integer.parseInt(s.nextLine());
      contador++;
      
      aux+=n;
      
      if (n%2 !=0) {
        
        media = aux/contador;
        
        }
        
       if (n%2 == 0) {
         
         if  (n > mayor) {
           
           mayor = n;
           }
  }
      } while (n>0);
      
      System.out.println("Se han introducido: " + (contador-1) + " números");
      System.out.println("La media de los números impares es igual a " + media);
      System.out.println("El mayor de los pares es: " + mayor);
	}
}

