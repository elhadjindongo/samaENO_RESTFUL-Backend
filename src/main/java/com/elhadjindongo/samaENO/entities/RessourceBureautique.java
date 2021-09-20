
/***********************************************************************
 * Module:  RessourceBureautique.java
 * Author:  Ndongoel
 * Purpose: Defines the Class RessourceBureautique
 ***********************************************************************/
/**
 * En MPhD, il faut une table intermedaire pour enregistrer la dateDeDebutDEmprunt,dateDeFinDEmprunt,dateDEmprunt et commentaire.
 *
 */

package com.elhadjindongo.samaENO.entities;

import com.elhadjindongo.samaENO.models.RessourceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RessourceBureautique {
   private long id;
   private String name;
   private String photo;
   private RessourceType type;//un enum cableRj45,priseElectrique,cableHDMI et cableVGA
   private boolean etat;
   
   public boolean emprunter() {
      // TODO: implement
      return false;
   }
   
   public boolean restituer() {
      // TODO: implement
      return false;
   }

}