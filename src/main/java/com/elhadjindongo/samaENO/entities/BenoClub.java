/***********************************************************************
 * Module:  BenoClub.java
 * Author:  Ndongoel
 * Purpose: Defines the Class BenoClub
 ***********************************************************************/
package com.elhadjindongo.samaENO.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "beno_clubs")
public class BenoClub {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(length = 10)
   private String sigle;
   @Column(length = 155)
   private String intitule;
   @Column(length = 155)
   private String slogan;
   private String description;
   @ManyToMany(fetch = FetchType.EAGER)
   private Collection<PersonnelBENO> membres;

}