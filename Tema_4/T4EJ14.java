public class T4EJ14 {
	
	public static void main (String[] args) {
	
		System.out.print("Introduce un número: ");
		int n = Integer.parseInt(System.console().readLine());
		
		if (n%2 == 0 && n%5 == 0) {
			
			System.out.print ("El número introducido es par y divisible entre 5.");
			
		} else {
			
			if (n%5 == 0) {
				
				System.out.print ("El número introducido es divisible entre 5.");
				
				} else {
					
					if (n%2 == 0) {
						
						System.out.print ("El número introducido es par.");
						
						} else {
							
							
							System.out.print ("El número introducido ni es par ni es divisible entre 5.");
							
							
							}
					
					
					}
			
			}
	}
}

