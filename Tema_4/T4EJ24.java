public class T4EJ24 {
	
	public static void main (String[] args) {
		System.out.println("Cargos del empleado: ");
    System.out.println("1 - Programador junior. ");
    System.out.println("2 - Programador senior. ");
    System.out.println("3 - Jefe de proyecto. ");
    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
    int cargo = Integer.parseInt((System.console().readLine()));
    
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
    int dias = Integer.parseInt((System.console().readLine()));
    
    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
    int estciv = Integer.parseInt((System.console().readLine()));
    
    
    System.out.println("---------------------------------");
    switch (cargo) {
      
      case 1:
      System.out.println ("> Sueldo base               900");
      break;
      
      case 2:
      System.out.println ("> Sueldo base               1200");
      break;
      
      case 3:
      System.out.println ("> Sueldo base               1600");
      break;
      
      }
      
      System.out.println ("> Dietas ("+dias+" viajes)         " + dias*30);
      
      System.out.println("---------------------------------");
      
      if (cargo == 1) {
        int a = (900+(dias*30));
        System.out.println("> Sueldo bruto              " + a );
        
        if (estciv == 1) {
          int a1 = (a*20/100);
          System.out.println("> Retención IRPF (20%)      " + a1 );
          System.out.println("---------------------------------");
          System.out.print("> Sueldo neto               " + (a-a1) );
          
          } else {
            int a2 = (a*25/100);
            System.out.println("> Retención IRPF (25%)      " + a2);
            System.out.println("---------------------------------");
            System.out.print("> Sueldo neto               " + (a-a2) );
            
            }
        } else {
          
          if (cargo == 2) {
         int b = (1200+(dias*30));
         System.out.println("> Sueldo bruto              " + b);
        
          if (estciv == 1) {
            int b1 = (b*20/100);
            System.out.println("> Retención IRPF (20%)       " + b1);
            System.out.println("---------------------------------");
            System.out.print("> Sueldo neto                " + (b-b1) );
          
          
          } else {
              int b2 = (b*25/100);
              System.out.println("> Retención IRPF (25%)       " + b2);
              System.out.println("---------------------------------");
              System.out.print("> Sueldo neto                " + (b-b2) );
            
            
            }
        } else {
          
          if (cargo == 3) {
           int c = (1600+(dias*30));
          System.out.println("> Sueldo bruto              " + c);
        
        if (estciv == 1) {
          int c1 = (c*20/100);
          System.out.println("> Retención IRPF (20%)       " + c1);
          System.out.println("---------------------------------");
          System.out.print("> Sueldo neto       " + (c-c1) );
          
          } else {
              int c2 = (c*25/100);
              System.out.println("> Retención IRPF (25%)      " + c2);
              System.out.println("---------------------------------");
              System.out.print("> Sueldo neto       " + (c-c2) );
            
            }
        }
      }
    }        
	}
}

