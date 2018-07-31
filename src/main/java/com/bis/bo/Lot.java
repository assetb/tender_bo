/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bis.bo;

import java.math.BigDecimal;

/**
 *
 * @author Smaile
 */
public class Lot {
    long lot_tender_id;
//    Tender lot_tender_id;
    long lot_no;
    String lot_name_ru;
    String lot_name_kz;
    String lot_name_en;
    long lot_kato_id;
//    Kato lot_kato_id;
    String lot_addr_ru;
    String lot_addr_kz;
    String lot_addr_en;
    String lot_durationDelivery;
    String lot_durationContract;
    BigDecimal lot_kz;
    BigDecimal lot_amtGuarantee;
    BigDecimal lot_amtContract;
    boolean lot_docreq1;
    boolean lot_docreq2;
    boolean lot_docreq3;
    String lot_filePath;
    long lot_fileSize;
    String lot_winner_id;
    short lot_oiReason_id;
    BigDecimal lot_ioPrice;
    BigDecimal lot_ioKs;
    BigDecimal lot_plan_id;
//    Plan lot_plan_id;
    BigDecimal lot_totalSum;
}