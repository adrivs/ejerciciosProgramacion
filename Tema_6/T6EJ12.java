public class T6EJ12 {
	
	public static void main (String[] args) {
		    
    char caracter = ' ';
    int contador = 1;
    for (int i = 0; i < contador; i++) {
      
      caracter = (char)((Math.random()*127)+32);
      System.out.print(caracter);
      contador++;
      
    }
	}
}

