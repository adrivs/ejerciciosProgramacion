import java.util.Scanner;
public class MainVehiculos {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Coche coche = new Coche();
		Bicicleta bici = new Bicicleta();	
		
		int eleccion;
		
		do {
			System.out.println("VEHÍCULOS");
			System.out.println("=========");
			System.out.println("1. Anda con la bicicleta");
			System.out.println("2. Haz el caballito con la bicicleta");
			System.out.println("3. Anda con el coche");
			System.out.println("4. Quema rueda con el coche");
			System.out.println("5. Ver kilometraje de la bicicleta");
			System.out.println("6. Ver kilometraje del coche");
			System.out.println("7. Ver kilometraje total");
			System.out.println("8. Salir");
			System.out.print("Elige una opción (1-8): ");
			
			eleccion = Integer.parseInt(s.nextLine());
			
			System.out.println();
			
			if (eleccion < 1 || eleccion > 9) {
				System.out.println("La opción que has elegido no existe");
			}
			
			if (eleccion == 1) {
				
				System.out.print("¿Cuántos kilometros quieres andar?: ");
				int k = Integer.parseInt(s.nextLine());
				bici.pedalear(k);
				
			}
			
			if (eleccion == 2) {
				
				bici.caballito();
			}
			
			
			if (eleccion == 3) {
				
				System.out.print("¿Cuántos kilometros quieres recorrer?: ");
				int k = Integer.parseInt(s.nextLine());
				coche.recorrer(k);
			}
			
			if (eleccion == 4) {
				coche.quemarRueda();
			}
			
			if (eleccion == 5) {
				System.out.println(bici.getKilometrosRecorridos());
			}
			
			if (eleccion == 6) {
				System.out.println(coche.getKilometrosRecorridos());
			}
			
			if (eleccion == 7) {
				System.out.println(Coche.getKilometrosTotales());
			}
			
			if (eleccion == 8) {
				for(int i = 0; i < 100; i++) {
					System.out.println();
				}
			}
			
		} while (eleccion != 8);
		
		
	}

}
