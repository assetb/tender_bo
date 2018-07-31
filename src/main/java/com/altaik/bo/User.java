/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altaik.bo;

/**
 * @author Aset
 */
public class User {
    public int id;
    public String login;
    public String email;
    public String password;
    public Integer lastpurchase;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLastpurchase() {
        return lastpurchase;
    }

    public void setLastpurchase(Integer lastpurchase) {
        this.lastpurchase = lastpurchase;
    }
}
