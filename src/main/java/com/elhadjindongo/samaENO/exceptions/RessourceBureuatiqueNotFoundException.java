/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 9/26/2021 ************************************/
/****** Project: samaENO *********************/
/****************************************************/

package com.elhadjindongo.samaENO.exceptions;

public class RessourceBureuatiqueNotFoundException extends RuntimeException {
    public RessourceBureuatiqueNotFoundException(Long id) {
        super("Ressource Bureautique avec id =" + id + " n'existe pas!");
    }
}
