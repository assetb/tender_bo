package com.altaik.bo;

/**
 * @author Vladimir Kovalev (v.kovalev@altatender.kz) on 13.04.2018
 */
public class LastProcess {
    private String name;
    private int lastProcessed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLastProcessed() {
        return lastProcessed;
    }

    public void setLastProcessed(int lastProcessed) {
        this.lastProcessed = lastProcessed;
    }
}
