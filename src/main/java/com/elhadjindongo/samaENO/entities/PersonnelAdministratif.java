/***********************************************************************
 * Module:  PersonnelAdministratif.java
 * Author:  Ndongoel
 * Purpose: Defines the Class PersonnelAdministratif
 ***********************************************************************/

package com.elhadjindongo.samaENO.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data
@AllArgsConstructor
@ToString
@Entity
@Table(name = "personnel_administratif")
@PrimaryKeyJoinColumn(name = "id_utilisateur")
@Inheritance(strategy = InheritanceType.JOINED)
public class PersonnelAdministratif extends Personnel {
}