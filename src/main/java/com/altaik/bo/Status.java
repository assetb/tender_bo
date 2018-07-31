package com.altaik.bo;

/**
 * @author Vladimir Kovalev (v.kovalev@altatender.kz) on 19.03.2018
 */
public class Status {
    private int id;
    private String name;
    private String regex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
}
