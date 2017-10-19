public class T4E09 {
	
	public static void main (String[] args) {
		
		System.out.print("Introduce la primera incognita (a) que no debe ser 0: ");
		int a = Integer.parseInt(System.console().readLine());
			
		System.out.print("Introduce la segunda incognita (b): ");
		int b = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce la segunda incognita (c) la cual no debe ser 0: ");
		int c = Integer.parseInt(System.console().readLine());
		
		int bnegada = b-(b*2);
		float discriminante = (b*b)-(4*a*c);
		
		if (discriminante < 0) {
			
			System.out.print("Error... el discriminante no puede ser negativo");
			
			} else { 
				
				float raiz = (float)Math.sqrt(discriminante);
				int den = 2*a;
				float nump = (float) (bnegada + raiz) / den;
				float numn = (float) (bnegada - raiz) / den;
				System.out.println("Resultado 1 = " + nump);
				System.out.print("Resultado 2 = " + numn);
		}		
	}
}

