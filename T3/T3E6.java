public class T3E6 {
	
	public static void main (String[] args) {
		System.out.print("Introduce la base: ");
      double base = Double.parseDouble(System.console().readLine());;
      
      System.out.print("Introduce la altura: ");
      double altura = Double.parseDouble(System.console().readLine());
      
      System.out.print ("Area del triangulo = " + (base*altura)/2);
	}
}

