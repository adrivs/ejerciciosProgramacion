public class T7EJ10 {
	
	public static void main (String[] args) {
		
    
    
    int[] array;
    array = new int[20];
    
    int[] arrayPares;
    arrayPares = new int[20];
    
    int[] arrayImpares;
    arrayImpares = new int[20];
    
    int[] arrayResultado;
    arrayResultado = new int[20];
    
    int numero = 0;
    int contadorPares = 0;
    int contadorImpares = 0;
    int contador = 0;
    int numeroPar = 0;
    int numeroImpar = 0;
    
    System.out.print("Array 1: ");
    
    while (contador < 20) {
      
      numero = (int)(Math.random()*100);
      array[contador] = numero;
      System.out.print(array[contador] + " ");
      contador++;
    }
    
    for (int i = 0; i < 20; i++) {
      
        if (array[i]%2 == 0) {
          
          arrayPares[contadorPares] = array[i];
          contadorPares++;
          
        } else {
          
          arrayImpares[contadorImpares] = array[i];
          contadorImpares++;
          
          
          }
    }
    
    System.out.println();
    
    for (int w = 0; w < contadorPares; w++) {
      
        arrayResultado[w] = arrayPares[w];
      
    }
    
    int a = 0;
    for (int y = contadorPares; y < 20; y++) {
      
        arrayResultado[y] = arrayImpares[a++];
      
    }
    
    System.out.print("Array 2: ");
    
    for (int x = 0; x < 20; x++) {
      
        System.out.print(arrayResultado[x] + " ");
      
    }
                
  }
}
	


