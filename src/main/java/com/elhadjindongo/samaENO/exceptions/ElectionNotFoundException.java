/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 9/26/2021 ************************************/
/****** Project: samaENO *********************/
/****************************************************/

package com.elhadjindongo.samaENO.exceptions;

public class ElectionNotFoundException extends RuntimeException {
    public ElectionNotFoundException(Long id) {
        super("Election avec id =" + id + " n'existe pas!");
    }
}
