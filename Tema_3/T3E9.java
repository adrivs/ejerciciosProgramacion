public class T3E9 {
	
	public static void main (String[] args) {
		System.out.print("Introduce la altura del cono: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce el radio del cono: ");
    double radio = Double.parseDouble(System.console().readLine());
    
    System.out.print("El volumen del cono es " + (0.33)*(3.1416)*(radio*radio)*altura);
    
    
	}
}

