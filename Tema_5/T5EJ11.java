import java.util.Scanner; // String cadena = s.nextLine(); 

public class T5EJ11 {
	
	public static void main (String[] args) {
		
    int aux;
    
    Scanner s = new Scanner (System.in);
    System.out.print("Introduce un número entero: ");
    int num = Integer.parseInt(s.nextLine());
    num+=1;
    
    
    for (int i = 0; i < 5; i++) {
      
      
      
      aux = num++;
      System.out.println("Nº: " + aux + "     Cuadrado: " + (aux*aux) + "     Cubo: " + (aux*aux*aux));
    
      
      
      
      }
    
    
    
    
    
	}
}

