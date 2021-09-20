package com.elhadjindongo.samaENO.repository;
/***********************************************************************
 * Module:  PersonnelBENORepository.java
 * Author:  Ndongoel
 * Purpose: Defines the Interface PersonnelBENORepository
 ***********************************************************************/


import com.elhadjindongo.samaENO.entities.PersonnelBENO;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonnelBENORepository extends JpaRepository<PersonnelBENO, Long> {
}