/***********************************************************************
 * Module:  EmpruntPosteInformatique.java
 * Author:  Ndongoel
 * Purpose: Defines the Class EmpruntPosteInformatique
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
public class EmpruntPosteInformatique {
   private Utilisateur utilisateur;
   private PosteInformatique posteInformatique;
   private Date dateDemprunt;
   private Date debut;
   private Date fin;

}