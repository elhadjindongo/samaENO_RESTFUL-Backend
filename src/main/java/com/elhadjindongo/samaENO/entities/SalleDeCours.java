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


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SalleDeCours {
    private long id;
    private String titre;
    private String capacite;
    private String description;

    public boolean reserver() {
        // TODO: implement
        return false;
    }

    /** @pdOid a390af62-a48f-4008-a9e3-8c22932e4154 */
    public boolean liberer() {
        // TODO: implement
        return false;
    }

}