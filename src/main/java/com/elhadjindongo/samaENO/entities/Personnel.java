/***********************************************************************
 * Module:  Personnel.java
 * Author:  Ndongoel
 * Purpose: Defines the Class Personnel
 ***********************************************************************/
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
@Table(name = "personnel")
@PrimaryKeyJoinColumn(name = "id_utilisateur")
@Inheritance(strategy = InheritanceType.JOINED)
public class Personnel extends Utilisateur {
   @Column(name = "poste_occupe", length = 100)
   private String posteOccuppe;
}