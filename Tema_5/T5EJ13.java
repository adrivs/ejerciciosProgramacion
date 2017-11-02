import java.util.Scanner;

public class T5EJ13 {
	
	public static void main (String[] args) {
		
    int aux;
    int aux2;
    int contpos = 0;
    int contneg = 0;
    
    
    Scanner s = new Scanner (System.in);
    
    for (int i = 0; i < 10; i++) {
      
       System.out.print("Introduce un número: ");
       int num = Integer.parseInt(s.nextLine());
       
       aux = num;
      
       
       
      
       if (aux < 0) {
         
          contneg++;
         
         } else {
            
            contpos++;
           
           }
      
      
      }
      
        System.out.println(contpos + " son positivos.");
        System.out.println(contneg + " son negativos.");
        
    
    
    
    
	}
}

