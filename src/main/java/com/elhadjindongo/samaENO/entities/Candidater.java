/***********************************************************************
 * Module:  Candidater.java
 * Author:  Ndongoel
 * Purpose: Defines the Class Candidater
 ***********************************************************************/

package com.elhadjindongo.samaENO.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Candidater {
   private Etudiant candidat;
   private Election election;
   private String slogan;
   private String poste;
}