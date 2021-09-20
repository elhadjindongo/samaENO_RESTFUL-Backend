/***********************************************************************
 * Module:  Utilisateur.java
 * Author:  Ndongoel
 * Purpose: Defines the Class Utilisateur
 ***********************************************************************/
package com.elhadjindongo.samaENO.entities;


import com.elhadjindongo.samaENO.models.SocialMedia;
import com.elhadjindongo.samaENO.models.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "utilisateurs")
@Inheritance( strategy = InheritanceType.JOINED )
public class Utilisateur {
    @Column(name = "id_utilisateur")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String nom;
    @Column(length = 155)
    private String prenom;
    @Column(length = 13)
    private String telephone;
    @Column(name = "email_uvs",length = 200)
    private String emailInstitutionnelle;
    @Column(name = "mots_de_passe",length = 75)
    private String motsDePasse;
    private String photo;
    //private Map<SocialMedia, String> socials; TO DO:
    @Column(length = 75)
    private UserRole role;

}