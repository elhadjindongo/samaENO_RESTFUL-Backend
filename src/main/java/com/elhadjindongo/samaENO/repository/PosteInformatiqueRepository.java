/***********************************************************************
 * Module:  PosteInformatiqueRepository.java
 * Author:  Ndongoel
 * Purpose: Defines the Interface PosteInformatiqueRepository
 ***********************************************************************/
package com.elhadjindongo.samaENO.repository;


import com.elhadjindongo.samaENO.entities.PosteInformatique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PosteInformatiqueRepository  extends JpaRepository<PosteInformatique, Long> {
}