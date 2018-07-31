package com.altaik.bo.view;

import com.altaik.bo.ProcessedPurchase;
import com.altaik.bo.User;

/**
 * Created by admin on 25.09.2017.
 */
public class CurrentDayDeliveryView {
    private Integer userId;
    private String email;
    private String keyword;
    private String purchaseNumber;
    private String ruName;
    private String kzName;
    private User user;
    private Integer purchaseId;
    private ProcessedPurchase processedPurchase;
    private int id;
    private int mailSettingsId;

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ProcessedPurchase getProcessedPurchase() {
        return processedPurchase;
    }

    public void setProcessedPurchase(ProcessedPurchase processedPurchase) {
        this.processedPurchase = processedPurchase;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(String purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }

    public String getRuName() {
        return ruName;
    }

    public void setRuName(String ruName) {
        this.ruName = ruName;
    }

    public String getKzName() {
        return kzName;
    }

    public void setKzName(String kzName) {
        this.kzName = kzName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMailSettingsId() {
        return mailSettingsId;
    }

    public void setMailSettingsId(int mailSettingsId) {
        this.mailSettingsId = mailSettingsId;
    }

}
