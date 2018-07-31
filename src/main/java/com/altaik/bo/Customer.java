/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altaik.bo;

/**
 *
 * @author Aset
 */
public class Customer {
    public int userId;
    public String email;
    public String companyRuName;
    public String firstName;
    public String lastName;
    
    
    public Customer(String email,String companyRuName,String firstName,String lastName){
        this.email = email;
        this.companyRuName = companyRuName;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    
}
