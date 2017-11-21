public class T6EJ02 {
	
	public static void main (String[] args) {
		
    int palo = ((int)(Math.random()*4)+1);
    int carta = ((int)(Math.random()*15)+2);
    
    if (palo == 1) {
      
      if (carta < 11) {
        
        System.out.print(carta + " de picas.");
        
      }
      
      if (carta == 11) {
        
         System.out.print("J de picas.");
        
        }
        
       if (carta == 12) {
        
         System.out.print("Q de picas.");
        
        }
        
        if (carta == 13) {
        
         System.out.print("K de picas.");
        
        }
        
        if (carta == 14) {
        
         System.out.print("A de picas.");
        
        } 
    } 
    
      if (palo == 2) {
      
      if (carta < 11) {
        
        System.out.print(carta + " de corazones.");
        
      }
      
      if (carta == 11) {
        
         System.out.print("J de corazones.");
        
        }
        
       if (carta == 12) {
        
         System.out.print("Q de corazones.");
        
        }
        
        if (carta == 13) {
        
         System.out.print("K de corazones.");
        
        }
        
        if (carta == 14) {
        
         System.out.print("A de corazones.");
        
        } 
    } 
    
        if (palo == 3) {
      
      if (carta < 11) {
        
        System.out.print(carta + " de diamantes.");
        
      }
      
      if (carta == 11) {
        
         System.out.print("J de diamantes.");
        
        }
        
       if (carta == 12) {
        
         System.out.print("Q de diamantes.");
        
        }
        
        if (carta == 13) {
        
         System.out.print("K de diamantes.");
        
        }
        
        if (carta == 14) {
        
         System.out.print("A de diamantes.");
        
        } 
    } 
    
        if (palo == 4) {
      
      if (carta < 11) {
        
        System.out.print(carta + " de tréboles.");
        
      }
      
      if (carta == 11) {
        
         System.out.print("J de tréboles.");
        
        }
        
       if (carta == 12) {
        
         System.out.print("Q de tréboles.");
        
        }
        
        if (carta == 13) {
        
         System.out.print("K de tréboles.");
        
        }
        
        if (carta == 14) {
        
         System.out.print("A de tréboles.");
        
        } 
    } 
	}
}

