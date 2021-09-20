 /***********************************************************************
 * Module:  PosteInformatique.java
 * Author:  Ndongoel
 * Purpose: Defines the Class PosteInformatique
 ***********************************************************************/
 /** En MPhD, il faut une table intermedaire pour enregistrer la dateDeDebutDEmprunt,dateDeFinDEmprunt,dateDEmprunt et commentaire.
  *
  *
  *
  */
 package com.elhadjindongo.samaENO.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;




@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PosteInformatique {
   private Long id;
   private String name;
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