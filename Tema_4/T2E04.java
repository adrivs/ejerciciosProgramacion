public class T2E04 {
	
	public static void main (String[] args) {
		System.out.print ("Introduce una hora (sin decimales): ");
    int hora = Integer.parseInt(System.console().readLine());
    
    if (hora >= 6 && hora <= 12) {
      System.out.print("Buenos días");
    
    } else {
        if (hora >= 13 && hora <= 20) {
          System.out.print("Buenas tardes");
  } else {
    
    System.out.print ("Buenas noches");
      }
    }
  }
}
