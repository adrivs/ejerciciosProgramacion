public class T4E07 {
	
	public static void main (String[] args) {
		System.out.print("Introduce la primera nota: ");
		int n1 = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce la segunda nota: ");
		int n2 = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce la tercera nota: ");
		int n3 = Integer.parseInt(System.console().readLine());
		
		int media = (n1+n2+n3)/3;
		
		System.out.print("La media de las tres notas es " + media);
	}
}

