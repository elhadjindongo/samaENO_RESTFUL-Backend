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

import javax.persistence.*;
import java.util.Collection;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "personnel_beno")
@PrimaryKeyJoinColumn(name = "id_utilisateur")
public class PersonnelBENO extends Personnel {
   @ManyToMany(mappedBy = "membres", fetch = FetchType.EAGER)
   private Collection<BenoClub> clubs;

}