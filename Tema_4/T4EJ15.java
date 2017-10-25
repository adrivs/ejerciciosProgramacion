public class T4EJ15 {
	
	public static void main (String[] args) {
		System.out.print ("Introduce un carácter: ");
    String h = System.console().readLine();
    
    System.out.println ("¿Para qué lado quieres que apunte el vértice?");
    System.out.println ("a) Hacia arriba.");
    System.out.println ("b) Hacia abajo.");
    System.out.println ("c) Hacia la izquierda.");
    System.out.println ("d) Hacia la derecha.");
    System.out.println ("Elige entre a,b,c ó d.");
    String vertice = System.console().readLine();
    
    switch (vertice) {
      
      case "a":
      System.out.println("\n    "+h+"    ");
      System.out.println("   "+h+h+h+"    ");
      System.out.println("  "+h+h+h+h+h+"   ");
      System.out.println(" "+h+h+h+h+h+h+h+" ");
      System.out.println(h+h+h+h+h+h+h+h+h);
      break;
      
      case "b":
      System.out.println("\n"+h+h+h+h+h+h+h+h+h);
      System.out.println(" "+h+h+h+h+h+h+h+" ");
      System.out.println("  "+h+h+h+h+h+"  ");
      System.out.println("   "+h+h+h+"   ");
      System.out.println("    "+h+"    ");
      break;
      
      case "c":
      System.out.println("\n"+h);
      System.out.println(h+h+h);
      System.out.println(h+h+h+h+h);
      System.out.println(h+h+h+h+h+h+h);
      System.out.println(h+h+h+h+h+h+h+h);
      System.out.println(h+h+h+h+h+h+h);
      System.out.println(h+h+h+h+h);
      System.out.println(h+h+h);
      System.out.println(h);
      break;
      
      case "d":
      System.out.println("\n       "+h);
      System.out.println("     "+h+h+h);
      System.out.println("   "+h+h+h+h+h);
      System.out.println(" "+h+h+h+h+h+h+h);
      System.out.println(h+h+h+h+h+h+h+h);
      System.out.println(" "+h+h+h+h+h+h+h);
      System.out.println("   "+h+h+h+h+h);
      System.out.println("     "+h+h+h);
      System.out.println("       "+h);
      break;
}
    
    
    
	}
}

