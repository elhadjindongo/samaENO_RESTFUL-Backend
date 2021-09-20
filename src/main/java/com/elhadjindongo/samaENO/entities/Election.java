/***********************************************************************
 * Module:  Election.java
 * Author:  Ndongoel
 * Purpose: Defines the Class Election
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
public class Election {
   private Long id;
   private String intituler;
   private Date ouverureVote;
   private Date fermetureVote;
   private Etudiant vainqueur;

}