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

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Annonce {
   private Long id;
   private String titre;
   private String[] liens;
   private String contenu;
   private Date date;
   private String photo;

}