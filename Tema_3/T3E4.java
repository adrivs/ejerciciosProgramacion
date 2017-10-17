public class T3E4 {
	
	public static void main (String[] args) {
		 int n1;
        int n2;
        int resultado;
        
        System.out.print("Introduce un número: ");
        n1 = Integer.parseInt(System.console().readLine());
        
        System.out.print("Introduce otro número: ");
        n2 = Integer.parseInt(System.console().readLine());
        
         
        System.out.println("El resultado de sumar los dos números es igual a " + (n1+n2));
        
        System.out.println("El resultado de restar los dos números es igual a " + (n1-n2));
        
        System.out.println("El resultado de multiplicar los dos números es igual a " + (n1*n2));
        
        System.out.println("El resultado de dividir los dos números es igual a " + (n1/n2));
	}
}

