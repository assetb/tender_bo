/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altaik.bo;

import com.altaik.bo.settings.DeliverySettings;

import java.util.ArrayList;

/**
 *
 * @author Aset
 */
public class Recipient {
    public User user;
    public DeliverySettings deliverySettings;
    public ArrayList<DeliverySettings> deliverySettingsCollection;
    public Customer customer;
    
    public boolean IsValid(){
        return !(user==null || user.id==0 || null==user.email || user.email.isEmpty());
    }

}
