/***********************************************************************
 * Module:  Annonce.java
 * Author:  Ndongoel
 * Purpose: Defines the Class Annonce
 ***********************************************************************/
package com.elhadjindongo.samaENO.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "annonces")
public class Annonce {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(length = 155)
   private String titre;
   private String[] liens;
   private String contenu;
   private Date date;
   private String photo;
   @ManyToOne
   private Personnel auteur;

}