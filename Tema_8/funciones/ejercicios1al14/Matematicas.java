package numeros;

public class Matematicas {

	
	 public static boolean esCapicua(long x) {
		    return x == voltea(x);
		  }

		  public static boolean esCapicua(int x) {
		    return esCapicua((long)x);
		  }

	
		  public static Boolean esPrimo(long n) {
		    if (n < 2) {
		      return false;
		    } else {
		      for (long i = n / 2; i >= 2; i--) {
		        if (n % i == 0) {
		          return false;
		        }
		      }
		    }
		    return true;
		  }

		  
		  public static Boolean esPrimo(int n) {
		    return esPrimo((long) n);
		  }
		  
	
		  public static int siguientePrimo(int x) {
		    while (!esPrimo(++x)) {};

		    return x;
		  }

		 
		  public static double potencia(int base, int exponente) {
		    if (exponente == 0) {
		      return 1;
		    }

		    if (exponente < 0) {
		      return 1/potencia(base, -exponente);
		    }

		    int n = 1;

		    for (int i = 0; i < Math.abs(exponente); i++) {
		      n = n * base;
		    }

		    return n;
		  }

		
		  public static int digitos(long x) {
		    if (x < 0) {
		      x = -x;
		    }

		    if (x == 0) {
		      return 1;
		    } else {
		      int n = 0;
		      while (x > 0) {
		        x = x / 10; 
		        n++; 
		      }
		      return n;
		    }
		  }

		  public static int digitos(int x) {
		    return digitos((long)x);
		  }

	
		  public static long voltea(long x) {
		    if (x < 0) {
		      return -voltea(-x);
		    }

		    long volteado = 0;

		    while(x > 0) {
		      volteado = (volteado * 10) + (x % 10);
		      x = x / 10;
		    }

		    return volteado;
		  }

		  public static int voltea(int x) {
		    return (int)voltea((long)x);
		  }

		
		  public static int digitoN(long x, int n) {
		    x = voltea(x);

		    while (n-- > 0) {
		      x = x / 10;
		    }

		    return (int)x % 10;
		  }

		
		  public static int digitoN(int x, int n) {
		    return digitoN((long)x, n);
		  }

		
		  public static int posicionDeDigito(long x, int d) {
		    int i;

		    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};

		    if (i == digitos(x)) {
		      return -1;
		    } else {
		      return i;
		    }
		  }

		
		  public static int posicionDeDigito(int x, int d) {
		    return posicionDeDigito((long)x, d);
		  }

		
		  public static long quitaPorDetras(long x, int n) {
		    return x / (long)potencia(10, n);
		  }

		
		  public static int quitaPorDetras(int x, int n) {

		    return (int)quitaPorDetras((long) x, n);
		  }

		
		  public static long quitaPorDelante(long x, int n) {
		    x = pegaPorDetras(x, 1);
		    x = voltea(quitaPorDetras(voltea(x), n));
		    x = quitaPorDetras(x, 1);
		    return x;
		  }

		  public static int quitaPorDelante(int x, int n) {
		    return (int)quitaPorDelante((long)x, n);
		  }

		  public static long pegaPorDetras(long x, int d) {
		    return juntaNumeros(x, d);
		  }

		  public static int pegaPorDetras(int x, int d) {
		    return (int)pegaPorDetras((long)x, d);
		  }

		
		  public static long pegaPorDelante(long x, int d) {
		    return juntaNumeros(d, x);
		  }

		
		  public static int pegaPorDelante(int x, int d) {
		    return (int)pegaPorDelante((long)x, d);
		  }

		
		  public static long trozoDeNumero(long x, int inicio, int fin) {
		    int longitud = digitos(x);
		    x = quitaPorDelante(x, inicio);
		    x = quitaPorDetras(x, longitud - fin - 1);
		    return x;
		  }

	
		  public static int trozoDeNumero(int x, int inicio, int fin) {
		    return (int)trozoDeNumero((long)x, inicio, fin);
		  }

		
		  public static long juntaNumeros(long x, long y) {
		    return (long)(x * potencia(10, digitos(y))) + y;
		  }

		
		  public static int juntaNumeros(int x, int y) {
		    return (int)(juntaNumeros((long)x, (long)y));
		  }
		}

	
	
	
	
	
	
	
	
	
	
