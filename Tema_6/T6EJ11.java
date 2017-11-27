public class T6EJ11 {
	
	public static void main (String[] args) {
		
    int numero = 0;
    int contSus = 0;
    int contSuf = 0;
    int contBien = 0;
    int contNot = 0;
    int contSob = 0;
    
    for (int i = 0; i < 20; i++) {
    
      numero = (int)(Math.random()*11);
      
      if (numero == 5) {
        
        contSus++;
        System.out.println("Suspenso.");
        
      }
      
      if (numero == 6) {
        
        contBien++;
        System.out.println("Bien.");
        
      }
      
      if (numero == 7 || numero == 8) {
        
        contNot++;
        System.out.println("Notable");
        
      }
      
      if (numero == 9 || numero == 10) {
        
        contSob++;
        System.out.println("Sobresaliente.");
      
      }
    }
      System.out.println();
      System.out.println("Total de suspensos = " + contSus);
      System.out.println("Total de suficientes = " + contSuf);
      System.out.println("Total de bienes = " + contBien);
      System.out.println("Total de notables = " + contNot);
      System.out.println("Total de sobresalientes = " + contSob);
  }
}

