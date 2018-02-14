
public class Bicicleta extends Vehiculo {

	private int kilometrosRecorridos;
	
	public Bicicleta () {
		super();
	}
	
	public void caballito () {
		
		int probabilidad;
		probabilidad = (int) (Math.random() * 10) + 1;
		
		if (probabilidad < 5) {
			
			System.out.println("Te has caído haciendo el caballito, por parguelón.");
		} else {
			
			System.out.println("*Haciendo el caballito...*");
		}
		
	}
	
	
	public void pedalear (int kilometros) throws InterruptedException {
		
		int probabilidad;
		probabilidad = (int) (Math.random() * 10) + 1;
		
		if (probabilidad < 5) {
			
			System.out.println("No has podido recorrer todos los kilometros, estás cansad@.");
			System.out.println("Descansa e intentalo de nuevo. :)");
			
		} else {
			
			System.out.print("*Pedaleando* ");
			kilometrosRecorridos += kilometros;
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println(".");
			Thread.sleep(1000);
			System.out.println("Has pedaleado " + kilometros + " kilometros.");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
