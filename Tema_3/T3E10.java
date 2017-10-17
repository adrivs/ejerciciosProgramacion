public class T3E10 {
	
	public static void main (String[] args) {
		System.out.print("Introduce el numero de Mb: ");
    float Mb = Float.parseFloat(System.console().readLine());
    
    System.out.print(Mb + " Mb equivalen a " + (Mb*1024) + " Kb" );
    
	}
}

