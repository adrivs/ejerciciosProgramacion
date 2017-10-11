public class T3E3 {
	
	public static void main (String[] args) {
		String verde = "\033[32m";
    System.out.println(verde + "PROGRAMA PARA CONVERTIR PESETAS A EUROS");
    
    double pesetas;
    
    System.out.print("Introduce el número de pesetas: ");
    pesetas = Double.parseDouble(System.console().readLine());
    
    System.out.print(pesetas + " pesetas " + " equivalen a " + (pesetas/166.39) + " euros.");
    
	}
}

