public class T4E05{
	
	public static void main (String[] args) {
		System.out.print("Introduce la primera incognita (a): ");
		int a = Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduce la segunda incognita (b):");
		int b = Integer.parseInt(System.console().readLine());
		
		System.out.print("Resultado = " + (b-(b*2)) / a);
		

		
	}
}

