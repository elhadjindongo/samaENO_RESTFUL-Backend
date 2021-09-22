/**
 * Module:  SalleDeCours.java
 * Author:  Ndongoel
 * Purpose: Defines the Class SalleDeCours
 * En MPhD, il faut une table intermedaire pour enregistrer la dateDeDebutDEmprunt,dateDeFinDEmprunt,dateDEmprunt et commentaire.
 */
/** En MPhD, il faut une table intermedaire pour enregistrer la dateDeDebutDEmprunt,dateDeFinDEmprunt,dateDEmprunt et commentaire.
 *
 */

package com.elhadjindongo.samaENO.entities;

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
@Table(name = "salle_de_cours")
public class SalleDeCours {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 155)
    private String titre;
    @Column(length = 155)
    private String capacite;
    private String description;

    public boolean reserver() {
        // TODO: implement
        return false;
    }


    public boolean liberer() {
        // TODO: implement
        return false;
    }

}