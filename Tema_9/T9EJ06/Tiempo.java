
public class Tiempo {

	private int hora;
	private int minuto;
	private int segundo;
	
	public Tiempo () {
		
	}

	public Tiempo(int hora, int minuto, int segundo) {
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public void suma (int h, int m, int s) {
		
		
		int auxm = 0;
		int auxh = 0;
		
		if (this.segundo+s >= 60) {
			
			this.segundo = (this.segundo+s)-60;
			auxm++;
		} else {
			
			this.segundo += s;
			
		}
		
		if ((this.minuto+m+auxm) >= 60) {
			
			this.minuto = (this.minuto+m+auxm)-60;
			auxh++;
		} else {
			
			this.minuto +=m;
		}
		
		if ((this.hora+h+auxh) > 24) {
			
			this.hora = 24-h-auxh;

			
		} else {
			
			this.hora = this.hora + h + auxh;
			
		}
		
	}
	
	
	public String toString () {
		
		return "Horas: " + this.hora + " Minutos: " + this.minuto + " Segundos: " + this.segundo;
	}
	
	
	
	
	
}
