/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 9/26/2021 ************************************/
/****** Project: samaENO *********************/
/****************************************************/

package com.elhadjindongo.samaENO.exceptions;

public class PersonnelBENONotFoundException extends RuntimeException {
    public PersonnelBENONotFoundException(Long id) {
        super("Membre du BENO ou Club avec id =" + id + " n'existe pas!");
    }
}
