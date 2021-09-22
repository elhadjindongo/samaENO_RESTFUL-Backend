/***********************************************************************
 * Module:  SalleDeCoursRepository.java
 * Author:  Ndongoel
 * Purpose: Defines the Interface SalleDeCoursRepository
 ***********************************************************************/
package com.elhadjindongo.samaENO.repository;
import com.elhadjindongo.samaENO.entities.SalleDeCours;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SalleDeCoursRepository extends JpaRepository<SalleDeCours, Long> {
}