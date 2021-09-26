/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 9/26/2021 ************************************/
/****** Project: samaENO *********************/
/****************************************************/

package com.elhadjindongo.samaENO.exceptions;

public class AnnonceNotFoundException extends RuntimeException {
    public AnnonceNotFoundException(Long id) {
        super("Anonce avec id =" + id + " n'existe pas!");
    }
}
