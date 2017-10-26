public class T4EJ23 {
	
	public static void main (String[] args) {
		System.out.print("Introduzca la base imponible: ");
    double baseImp = Double.parseDouble((System.console().readLine()));
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIVA = System.console().readLine();
    
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5, 5porc): ");
    String codigo = System.console().readLine();
    
    System.out.println("Base Imponible: " + baseImp);
    
    switch (tipoIVA) {
      
      case "general":
        double g = (baseImp*21/100);
        System.out.println("IVA (21%): " + g);
        double g2 = (baseImp+g);
        System.out.println("Precio con IVA: " + g2);
        
        if (codigo == "nopro")  {
          
          System.out.print("Cód. promo. (nopro): -0");
          System.out.print("tOTAL = " + g2);
          
          } else {
            
              if (codigo == "mitad") {
                
                System.out.print("Cód. promo. (mitad): -" + (g2/2));
                System.out.print("TOTAL = " + g2/2);
                
                } else {
                  
                    if (codigo == "meno5") {
                      System.out.print("Cód. promo. (mitad): -" + (g2-5.0));
                      System.out.print("TOTAL = " + (g2-5.0));
                      
                      } else {
                        
                        if (codigo == "5porc") {
                          
                          System.out.print("Cód. promo. (5porc): -" + (g2*5/100));
                          System.out.print("TOTAL = " + (g2-(g2*5/100)));
                          
                  }
                }
              }         
            }
        break;
      
      case "reducido":
        double r = (baseImp*10/100);
        System.out.println("IVA (10%): " + r);
        double r2 = (baseImp+r);
        System.out.println("Precio con IVA: " + r2);
        
        if (codigo == "nopro")  {
          
          System.out.print("Cód. promo. (nopro): -0");
          System.out.print("tOTAL = " + r2);
          
          } else {
            
              if (codigo == "mitad") {
                
                System.out.print("Cód. promo. (mitad): -" + (r2/2));
                System.out.print("TOTAL = " + r2/2);
                
                } else {
                  
                    if (codigo == "meno5") {
                      System.out.print("Cód. promo. (mitad): -" + (r2-5.0));
                      System.out.print("TOTAL = " + (r2-5.0));
                      
                      } else {
                        
                        if (codigo == "5porc") {
                          
                          System.out.print("Cód. promo. (5porc): -" + (r2*5/100));
                          System.out.print("TOTAL = " + (r2-(r2*5/100)));
                          
                  }
                }
              }         
            }
        
        break;
      
      case "superreducido":
        double s = (baseImp*4/100);
        System.out.println("IVA (4%): " + s);
        double s2 = (baseImp+s);
        System.out.println("Precio con IVA: " + s2 );
        
        if (codigo == "nopro")  {
          
          System.out.print("Cód. promo. (nopro): -0");
          System.out.print("tOTAL = " + s2);
          
          } else {
            
              if (codigo == "mitad") {
                
                System.out.print("Cód. promo. (mitad): -" + (s2/2));
                System.out.print("TOTAL = " + s2/2);
                
                } else {
                  
                    if (codigo == "meno5") {
                      System.out.print("Cód. promo. (mitad): -" + (s2-5.0));
                      System.out.print("TOTAL = " + (s2-5.0));
                      
                      } else {
                        
                        if (codigo == "5porc") {
                          
                          System.out.print("Cód. promo. (5porc): -" + (s2*5/100));
                          System.out.print("TOTAL = " + (s2-(s2*5/100)));
                          
                  }
                }
              }         
            }
        
        
        break; }    
    
	}
}
