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

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity @Table(name="elections")
public class Election implements Serializable {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(length = 155)
   private String intituler;
   private Date ouverureVote;
   private Date fermetureVote;
   //il peut etre interessant d'enumerer l'ensemble des postes a pourvoir

   @OneToMany(fetch = FetchType.EAGER)
   private Collection<Etudiant> vainqueurs;//on a plusieurs vainqueurs dans une election puisque dans celle ci il ya plusieur poste

}