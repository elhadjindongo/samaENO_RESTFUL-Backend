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

import javax.persistence.*;


 @Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
 @Table(name="poste_informatique")
public class PosteInformatique {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(length = 155)
   private String name;
   private boolean etat; //true la machine est fonctionnelle
   
   public boolean emprunter() {
      // TODO: implement
      return false;
   }
   
   public boolean restituer() {
      // TODO: implement
      return false;
   }

}