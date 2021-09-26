/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 9/26/2021 ************************************/
/****** Project: samaENO *********************/
/****************************************************/

package com.elhadjindongo.samaENO.exceptions;

public class SalleDeCoursNotFoundException extends RuntimeException {
    public SalleDeCoursNotFoundException(Long id) {
        super("Salle de cours avec id =" + id + " n'existe pas!");
    }
}
