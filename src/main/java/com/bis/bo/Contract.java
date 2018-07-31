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
public class Contract {
    long contract_id;
    String contract_no;
    short contract_type;
//    ContractType contract_type;
    long contract_kato;
//    Kato contract_kato;
    Date contract_date1;
    Date contract_date2;
    short contract_mode;
//    ContractMode contract_mode;
    Date contract_created;
    String contract_createdby;
}
