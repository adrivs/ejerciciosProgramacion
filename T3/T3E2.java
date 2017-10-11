public class T3E2 {
	
	public static void main (String[] args) {
		
    String verde = "\033[32m";
    System.out.println(verde + "PROGRAMA PARA CONVERTIR EUROS A PESETAS");
    
    double euros;
    
    System.out.print("Introduce el número de euros: ");
    euros = Double.parseDouble(System.console().readLine());
    
    double pesetas = 166.39;
    
    System.out.print(euros + " euros " + " equivalen a " + (euros*pesetas) + " pesetas.");
    
	}
}

