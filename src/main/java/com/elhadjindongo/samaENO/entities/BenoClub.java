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

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BenoClub {
   private Long id;
   private String sigle;
   private String intitule;
   private String slogan;
   private String description;

}