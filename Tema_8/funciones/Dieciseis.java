package funciones;

import numeros.Matematicas;

public class Dieciseis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for (int i = 1; i < 100000; i++) {
					
			if(Matematicas.esCapicua(i) == true) {
				
				System.out.println(i);
			}
			
		}
	}
}
