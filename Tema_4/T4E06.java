public class T4E06 {
	
	public static void main (String[] args) {
		System.out.print("Introduce la altura en metros desde la que caerá el objeto: ");
		double h = Double.parseDouble(System.console().readLine());
		
		double dentroraiz = (2*h)/9.81;
		
		double t = Math.sqrt(dentroraiz);
		
		System.out.print (t + " segundos será el tiempo que tardará en caer el objeto.");		
	}
}

