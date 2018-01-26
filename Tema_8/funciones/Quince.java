package funciones;
import numeros.Matematicas;

public class Quince {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for (int i = 1; i < 1001; i++) {
					
			if(Matematicas.esPrimo(i).equals(true)) {
				
				System.out.println(i);
			}
			
		}
		
	}

}
