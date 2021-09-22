
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

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "ressources_bureautique")
public class RessourceBureautique {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(length = 155)
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