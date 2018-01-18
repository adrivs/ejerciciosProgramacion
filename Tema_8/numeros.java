package numeros;

public class numeros {

	
	//1
	
	public static boolean esCapicua (int num) {
		
		 boolean palindromo = false;
		   
		    long numBasura = num;
		    long numDig = 0;
		    long numReves = 0;
		    while (numBasura > 0){
		      numReves = ((numReves*10) + (numBasura % 10));
		      numBasura /=10;
		      numDig++;
		    }
		  
		    long numDerecho = num;
		    long cifraDerecho = 0;
		    long cifraReves = 0;
		    numDig /= 2;
		    do{
		      cifraDerecho = numDerecho%10;
		      cifraReves = numReves%10;
		      if (cifraDerecho == cifraReves){
		        palindromo = true;
		      } else {
		        palindromo = false;
		      }
		      numDerecho /= 10;
		      numReves /= 10;
		      numDig--;
		    } while ((numDig > 0) && (palindromo == true));
		    System.out.print("El número "+num);
		    if (palindromo == true){
		      return true;
		    } else {
		      return false;
		    }
		
		
	}
	
	//2
	
	public static boolean esPrimo (int num) {
		
		boolean primo = true;
		 		  
		    for (int i = 2; i < num; i++){
		      if ((num%i) == 0){
		        primo = false;
		      } else {
		        primo = true;
		      }
		    }
		    System.out.print("El número introducido ");
		    if (primo == true){
		      return true;
		    } else {
		      return false;
		    }
		
	}
	
	
	//4
	
	public static int potencia (int base, int exp) {
		
		
	    int total = 1;
	    
	    for (int i = 0; i < exp; i++){
	      total = base * total;
	    }
	    
	    return (total);
		
	}
	
	//5 (hasta 5 cifras)
	
	public static int digitos (int num) {
		int contador = 1;
		
		if (num > 100000){
		      System.out.print("La cifra debe tener como máximo 5 cifras.");
		      // Divide hasta que num < 10)
		    } else {
		      
		      num = num/10;
		      if (num < 10){
		        contador++;
		       
		      } else {
		        contador++;
		        num = num/10;
		        if (num < 10){
		          contador++;
		          
		        } else {
		          contador++;
		          num = num/10;
		          if (num < 10){
		            contador++;
		            
		          } else {
		            contador++;
		            num = num/10;
		            if (num < 10){
		              contador++;
		              
		            } else {
		              contador++;
		              num = num/10;
		             
		            }
		          }
		        }
		      }
		    }
		return contador;
	}
	
	
	
	
}
