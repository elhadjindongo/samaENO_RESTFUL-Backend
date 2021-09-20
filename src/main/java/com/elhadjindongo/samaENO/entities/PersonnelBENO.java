/**
 * Module:  PersonnelBENO.java
 * Author:  Ndongoel
 * Purpose: Defines the Class PersonnelBENO
 **/
package com.elhadjindongo.samaENO.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "personnel_beno")
@PrimaryKeyJoinColumn(name = "id_utilisateur")
public class PersonnelBENO extends Personnel {
   @Column(name = "nom_club")
   private String intituleClub;

}