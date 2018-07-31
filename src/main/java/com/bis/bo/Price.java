/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bis.bo;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author Smaile
 */
public class Price {
    public float price_tender_id;
    public float price_lot_no;
    public BigDecimal price_value;
    public BigDecimal price_sign;
    public Date price_created;
    public String price_createdby;
}
