public class T3E8 {
	
	public static void main (String[] args) {
		
		System.out.print ("Introduce el número de horas trabajadas: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.print ("El salario semanal total es de " + (horas*12) + " euros.");
      
	}
}

