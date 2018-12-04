/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolwtin11;

import java.util.Scanner;

/**
 *
 * @author slorenzorodriguez
 */
public class Bolwtin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner scan = new Scanner(System.in);
        
        System.out.println("ESCRIBE LA SIGUIENTE FRASE : \n" +
                                "A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática .");
        long startTime = System.currentTimeMillis();

        String text = scan.next();
        
        long endTime   = System.currentTimeMillis();
        
        float totalTime = (endTime - startTime)/1000F;
        
        System.out.println("Has tardado: " + totalTime + " segundos en terminar");
    }
    
}
    
    
    
    
    
    
    
    }
    
}
