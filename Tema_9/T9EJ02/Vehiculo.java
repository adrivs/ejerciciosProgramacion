
public class Vehiculo {

	private static int vehiculosCreados = 0;
	private static int kilometrosTotales = 0;
	
	private int kilometrosRecorridos;
	
	public Vehiculo () {
		this.kilometrosRecorridos = 0;
		Vehiculo.vehiculosCreados++;
	}

	public static int getVehiculosCreados() {
		return vehiculosCreados;
	}

	public static int getKilometrosTotales() {
		return kilometrosTotales;
	}

	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}
	
	public void recorrer (int kilometros) {
		
		
		this.kilometrosRecorridos += kilometros;
		Vehiculo.kilometrosTotales += kilometros;
				
	}	
}
