public class T4E08 {
	
	public static void main (String[] args) {
		System.out.print("Introduce la primera nota: ");
		int n1 = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce la segunda nota: ");
		int n2 = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce la tercera nota: ");
		int n3 = Integer.parseInt(System.console().readLine());
		
		int media = (n1+n2+n3)/3;
		
		if (media < 5) {
			
			System.out.print("Suspenso.");
			
			} else {
				
				if (media == 5) {
					
					System.out.print("Aprobado.");
					
					} else {
						
						
						if (media == 6) {
							
							
							System.out.print("Bien.");
							
							
							} else {
								
								if (media == 7 || media == 8) {
									
									
									System.out.print ("Notable.");
									
									} else {
										
										
										if (nota == 9 || nota == 10) {
											
											
											System.out.print("Sobresaliente.");			
						}		
					}	
				}								
			}	
		}
	}
}
