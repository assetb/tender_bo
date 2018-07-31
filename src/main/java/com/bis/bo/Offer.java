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
public class Offer {
    public long offer_tendet_id;
    public long offer_lot_no;
    public String offer_filePath;
    public long offer_fileSize;
    public long offer_sign;
    public long offer_recallSing;
    public String offer_rejectReason;
    public String offer_rejectComments;
    public BigDecimal offer_ks;
    public boolean offer_domesticProducer;
    public Date offer_created;
    public String offer_createdby;
}
