public class T4EJ11 {
	
	public static void main (String[] args) {
		System.out.print("Introduce la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
      if (hora > 24 || hora < 0) {
      
        System.out.print("E R R O R");
      
        } else {
        
            System.out.print("Introduce los minutos: ");
            int minutos = Integer.parseInt(System.console().readLine());
    
              if (minutos > 60 || minutos < 0) {
            
                System.out.print("E R R O R");
        
                } else {
              
                    int segundos = (minutos*60)+(hora*60*60);
                    int mnseg = (24*60*60);
                    System.out.print ("Faltan " + (mnseg - segundos) + " segundos.");
              
      }
    }
	}
}

