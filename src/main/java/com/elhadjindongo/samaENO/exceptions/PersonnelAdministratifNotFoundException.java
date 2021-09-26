/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 9/26/2021 ************************************/
/****** Project: samaENO *********************/
/****************************************************/

package com.elhadjindongo.samaENO.exceptions;

public class PersonnelAdministratifNotFoundException extends RuntimeException {
    public PersonnelAdministratifNotFoundException(Long id) {
        super("Membre de l'administration avec id =" + id + " n'existe pas!");
    }
}
