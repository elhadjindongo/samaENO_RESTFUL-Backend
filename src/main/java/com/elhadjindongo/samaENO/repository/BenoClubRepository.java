/***********************************************************************
 * Module:  BenoClubRepository.java
 * Author:  Ndongoel
 * Purpose: Defines the Interface BenoClubRepository
 ***********************************************************************/

package com.elhadjindongo.samaENO.repository;

import com.elhadjindongo.samaENO.entities.BenoClub;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BenoClubRepository extends JpaRepository<BenoClub,Long> {
}