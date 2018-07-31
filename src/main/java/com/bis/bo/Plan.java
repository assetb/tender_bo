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
public class Plan {
    public long plan_id;
    public long plan_contract_id;
    public short plan_year;
    public short plan_type_id;
    public short plan_trutype_id;
    public String plan_skpCode;
    public String plan_desc_ru;
    public String plan_desc_kz;
    public long paln_mkei_id;
    public BigDecimal plan_qty;
    public BigDecimal plan_amt;
    public short plan_tradeType;
    public long plan_tradePlace;
    public String plan_tradeDate;
    public String plan_deliveryDate;
    public String plan_sign;
    public String plan_ex_ru;
    public String plan_ex_kz;
    public String plan_ex_en;
    public long plan_tender_id;
    public short plan_lot_no;
    public Date plan_created;
    public String plan_createdby;
}
