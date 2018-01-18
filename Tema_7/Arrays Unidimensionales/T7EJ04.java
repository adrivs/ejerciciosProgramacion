public class T7EJ04 {
	
	public static void main (String[] args) {
		
    int[] arrayNumero;
    arrayNumero = new int [20];
    
    int[] arrayCuadrado;
    arrayCuadrado = new int[20];
    
    int[] arrayCubo;
    arrayCubo = new int[20];
    
    int numero = 0; 
    
    for (int i = 0; i < 20; i++)  {
      
      numero = (int)(Math.random()*101);
      
      arrayNumero[i] = numero;
      arrayCuadrado [i] = numero*numero;
      arrayCubo [i] = numero*numero*numero;
      
      System.out.print("Número: " + arrayNumero[i] + " ");
      System.out.print("Cuadrado: " + arrayCuadrado[i] + " ");
      System.out.println("Cubo: " + arrayCubo[i] + " ");
      
    }
  }
}

