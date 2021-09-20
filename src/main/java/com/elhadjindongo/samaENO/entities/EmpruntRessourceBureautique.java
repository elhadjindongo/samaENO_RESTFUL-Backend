 /***********************************************************************
 * Module:  EmpruntRessourceBureautique.java
 * Author:  Ndongoel
 * Purpose: Defines the Class EmpruntRessourceBureautique
 ***********************************************************************/
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
public class EmpruntRessourceBureautique {
   private Utilisateur utilisateur;
   private RessourceBureautique ressourceBureautique;
   private Date dateDemprunt;
   private Date debut;
   private Date fin;

}