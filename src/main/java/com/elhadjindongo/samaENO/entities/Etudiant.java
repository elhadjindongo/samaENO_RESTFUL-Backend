
/***********************************************************************
 * Module:  Etudiant.java
 * Author:  Ndongoel
 * Purpose: Defines the Class Etudiant
 ***********************************************************************/
package com.elhadjindongo.samaENO.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "etudiants")
@PrimaryKeyJoinColumn(name = "id_utilisateur")
public class Etudiant extends Utilisateur {
   private String ine;
}