/***********************************************************************
 * Module:  RessourceBureautiqueRepository.java
 * Author:  Ndongoel
 * Purpose: Defines the Interface RessourceBureautiqueRepository
 ***********************************************************************/
package com.elhadjindongo.samaENO.repository;


import com.elhadjindongo.samaENO.entities.RessourceBureautique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RessourceBureautiqueRepository extends JpaRepository<RessourceBureautique, Long> {
}