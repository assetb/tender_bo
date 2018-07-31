/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altaik.bo;

/**
 *
 * @author Smaile
 */
public enum ErrorsEnum {

    NONE(0), PURCHASE_CAPTHA(20), PURCHASE_ERROR_PARSING_LOTS(21), PURCHASE_NOT_FOUND_LIST(22), UNKNOWN(90);

    private final int value;

    ErrorsEnum(int value) {
        this.value = value;
    }

    public int GetValue() {
        return value;
    }
}
