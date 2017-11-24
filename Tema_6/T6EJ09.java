public class T6EJ09 {
	
	public static void main (String[] args) {
		
    int numero = 0;
    int contador = 0;
    
    do {
     
      numero = ((int)(Math.random()*100));
      System.out.print(numero + " ");
      contador++;
            
    } while (numero != 24);
    
    System.out.println();
    System.out.print("Se han generado " + contador + " numeros.");
	}
}

