package com.altaik.bo;

import java.io.Serializable;

/**
 * @author Vladimir Kovalev (v.kovalev@altatender.kz) on 26.03.2018
 */
public class PurchaseId implements Serializable {
    private String number;
    private int source;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }
}
