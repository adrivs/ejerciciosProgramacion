public class T4E04 {
	
	public static void main (String[] args) {
		
		System.out.print("Introduzca el número de horas trabajadas: ");
		int horas = Integer.parseInt(System.console().readLine());
		
		if (horas <= 40) {
			
			int total = horas*12;
			System.out.println("Total = " + total + " euros.");

			} else {
				
				if (horas > 40) {
					
					int aux = horas - 40;
					int total2 = aux * 16;
					int total3 = 40*12;
					System.out.print("Total = " + (total2+total3) + " euros.");
			}
		}	
	}
}

