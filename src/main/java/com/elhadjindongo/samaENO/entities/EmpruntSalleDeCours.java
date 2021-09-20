
/***********************************************************************
 * Module:  EmpruntSalleDeCours.java
 * Author:  Ndongoel
 * Purpose: Defines the Class EmpruntSalleDeCours
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
public class EmpruntSalleDeCours {
   private Utilisateur utilisateur;
   private RessourceBureautique ressourceBureautique;
   private Date dateDemprunt;
   private Date debut;
   private Date fin;
   private String observation;

}