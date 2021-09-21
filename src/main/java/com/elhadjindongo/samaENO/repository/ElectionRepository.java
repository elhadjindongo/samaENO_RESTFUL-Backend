/***********************************************************************
 * Module:  ElectionRepository.java
 * Author:  Ndongoel
 * Purpose: Defines the Interface ElectionRepository
 ***********************************************************************/
package com.elhadjindongo.samaENO.repository;
import com.elhadjindongo.samaENO.entities.Election;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ElectionRepository extends JpaRepository<Election, Long> {
}