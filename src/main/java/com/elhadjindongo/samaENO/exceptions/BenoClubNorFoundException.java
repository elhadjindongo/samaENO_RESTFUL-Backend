/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 9/26/2021 ************************************/
/****** Project: samaENO *********************/
/****************************************************/

package com.elhadjindongo.samaENO.exceptions;

public class BenoClubNorFoundException extends RuntimeException {
    public BenoClubNorFoundException(Long id) {
        super("Beno ou Club avec id =" + id + " n'existe pas!");
    }
}
