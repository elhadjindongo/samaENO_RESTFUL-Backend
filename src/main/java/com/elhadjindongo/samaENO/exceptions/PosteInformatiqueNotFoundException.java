/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 9/26/2021 ************************************/
/****** Project: samaENO *********************/
/****************************************************/

package com.elhadjindongo.samaENO.exceptions;

public class PosteInformatiqueNotFoundException extends RuntimeException {
    public PosteInformatiqueNotFoundException(Long id) {
        super("Poste Informatique avec id =" + id + " n'existe pas!");
    }
}
