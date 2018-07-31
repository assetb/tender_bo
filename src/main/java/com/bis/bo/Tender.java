/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bis.bo;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Smaile
 */
public class Tender {
    public long tender_id;
    public String tendet_code;
    public short tender_type_id;
//    TenderType tender_type_id;
    public String tender_name_ru;
    public String tender_name_kz;
    public String tender_name_en;
    public String tender_filePath;
    public long tender_fileSize;
    public Timestamp tender_publishOn;
    public Timestamp tender_offerStartOn;
    public Timestamp tender_offerEndOn;
    public short tender_offerValidLimit;
    public Timestamp tender_priceStartOn;
    public Timestamp tender_priceEndOn;
    public Timestamp tender_priceOpenOn;
    public String tender_contactEmail;
    public long tender_contactPhone;
    public long tender_committee_id;
//    Committee tender_committee_id;
    public short tender_status_id;
//    TenderStatus tender_status_id;
    public long tender_owner_id;
    public Date prolongation1;
    public Date prolongation2;
    public Date prolongation3;
    public boolean tendet_isDeleted;
    public Date tendet_created;
    public String tender_createdby;
}
