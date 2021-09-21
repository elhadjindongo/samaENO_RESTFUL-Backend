/***********************************************************************
 * Module:  AnnonceRepository.java
 * Author:  Ndongoel
 * Purpose: Defines the Interface AnnonceRepository
 ***********************************************************************/
package com.elhadjindongo.samaENO.repository;

import com.elhadjindongo.samaENO.entities.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnonceRepository extends JpaRepository<Annonce, Long> {
}