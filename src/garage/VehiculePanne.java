/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage;

/**
 *
 * @author duche
 */
public class VehiculePanne {
  
     private String nom;
     private String panne;
     /**
      * Get the value of nom
      *
      * @return the value of nom
      */
     public String getMarque() {
          return nom;
     }

     /**
      * Set the value of nom
      *
      * @param nom new value of nom
      */
     public void setMarque(String nom) {
          this.nom = nom;
     }

    

     /**
      * Get the value of Panne
      *
      * @return the value of Panne
      */
     public String getPanne() {
          return panne;
     }

     /**
      * Set the value of Panne
      *
      * @param Panne new value of Panne
      */
     public void setPanne(String Panne) {
          this.panne = Panne;
     }

     @Override
     public String toString() {
          return "VehiculePanne{" + "nom=" + nom + ", panne=" + panne + '}';
     }


}
