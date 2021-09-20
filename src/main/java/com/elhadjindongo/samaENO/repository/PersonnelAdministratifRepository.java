package com.elhadjindongo.samaENO.repository;
/***********************************************************************
 * Module:  PersonnelAdministratifRepository.java
 * Author:  Ndongoel
 * Purpose: Defines the Interface PersonnelAdministratifRepository
 ***********************************************************************/

import com.elhadjindongo.samaENO.entities.PersonnelAdministratif;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonnelAdministratifRepository extends JpaRepository<PersonnelAdministratif, Long> {
}