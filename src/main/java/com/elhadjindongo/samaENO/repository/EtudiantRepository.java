package com.elhadjindongo.samaENO.repository;
/***********************************************************************
 * Module:  EtudiantRepository.java
 * Author:  Ndongoel
 * Purpose: Defines the Interface EtudiantRepository
 ***********************************************************************/

import com.elhadjindongo.samaENO.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;




public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}