/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

import java.util.Scanner;

/**
 *
 * @author duche
 */
public class Main {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
          int choix;
          
          do {               
               System.out.println("1: yolo");
               System.out.println("2: swag");
               System.out.println("0:Quitter");

               choix = new Scanner(System.in).nextInt();
               System.out.println(choix);
               
               switch (choix){
                   case 1:
                        System.out.println("vehicule");
                        System.out.println("nom");
                       
                        String nom = new Scanner(System.in).nextLine();
                        
                        System.out.println("panne");
                        String panne = new Scanner(System.in).nextLine();
                        System.out.println("vehicule  "+nom+ "  panne "+panne);
                        break;
                    case 2:
                         System.out.println("s");
                         break;
                    default :
                         break;
               }
          } while (choix != 0);
     }
}
