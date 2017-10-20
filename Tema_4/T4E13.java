public class T4E13 {
	
	public static void main (String[] args) {
		System.out.print("Introduce un número: ");
		int a = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce segundo número: ");
		int b = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce tercer número: ");
		int c = Integer.parseInt(System.console().readLine());
		
		if ( a > b && b > c) {
			
			System.out.print ( a + " , " + b + " , " + c);
			
			
			} else {
				
				
				if ( b > a && a > c && b > c) {
					
					
					System.out.print ( b + " , " + a + " , " + c);
					
					
					} else {
						
						
						if (c > a && c > b && a > b) {
							
							
							System.out.print ( c + " , " + a + " , " + b);
							
							
							} else {
								
								if (c > b && c > a && b > a) {
							
							
							System.out.print ( c + " , " + b + " , " + a);
							
							
							} else {
								
								
								if (a > c && a > b && c > b) {
							
							
							System.out.print ( a + ", " + c + ", " + b);
							
							
							} else {
								
								
								if ( b > c && b > a && c > a) {
									
									
									System.out.print ( b + ", " + c + ", " + a);
									
							}
						}	
					}			
				}
			}
		}
	}
}

