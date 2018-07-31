/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bis.bo;

import java.sql.Date;

/**
 *
 * @author Smaile
 */
public class Committee {
    long committee_id;
    boolean committee_isRegular;
    String committee_name_ru;
    String committee_name_kz;
    String committee_name_en;
    String committee_details;
    Date committee_created;
    String committee_createdby;
}
