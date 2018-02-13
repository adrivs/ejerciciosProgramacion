
public class Coche extends Vehiculo {

	private int tanque ;
	private int consumo = 10;
	
	public Coche () {
		super();
		this.setTanque(100);
	}

	public int getTanque() {
		return tanque;
	}

	public void setTanque(int tanque) {
		this.tanque = tanque;
	}
	
	public void recorrer (int kilometros) {
		

		int gastado;
		
		gastado = (kilometros/100)*consumo;
		
		if (gastado > this.getTanque()) {
			
			System.out.println("No tienes suficiente gasolina para recorrer " + kilometros + " kilometros.");
		} else {
			
			super.recorrer(kilometros);
			System.out.println("¡Has podido recorrer " + kilometros + " kilometros!");
			this.tanque -= gastado;
					
		}
		
	}
	
	public void repostar () {
		
		if (tanque == 100) {
			
			System.out.println("El tanque de la gasolina está lleno.");
		} else {

			int aux = tanque;
			tanque = 100;
			
			System.out.println("Se han repostado " + (100-aux) + " litros. El tanque está ahora lleno.");
		}
		
		
	}
	
	
	
	
}
