/***********************************************************************
 * Module:  Agt.java
 * Author:  Ndongoel
 * Purpose: Defines the Class Agt
 ***********************************************************************/

package com.elhadjindongo.samaENO.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Data  @AllArgsConstructor @ToString
@Entity
@Table(name = "agt")
@PrimaryKeyJoinColumn(name = "id_utilisateur")
public class Agt extends PersonnelAdministratif {
}