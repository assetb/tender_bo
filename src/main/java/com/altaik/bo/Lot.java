/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altaik.bo;

import java.io.Serializable;

/**
 * @author Aset
 */
public class Lot implements Serializable {
    public int id;
    public String purchaseNumber;
    public String lotNumber;
    public String ruName;
    public String kzName;
    public String ruDescription;
    public String kzDescription;
    public String quantity;
    public String unit;
    public String vid;
    public String price;
    public String sum;
    public String deliveryPlace;
    public String deliverySchedule;
    public String deliveryTerms;
    public String ktru;
    public String kind;
    public String kato;
    public String link;
    public String skp;
    private int sourceId;
    private double iQuantity;
    private double iPrice;
    private double iSum;

    private ProcessedPurchase processedPurchase;

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public ProcessedPurchase getProcessedPurchase() {
        return processedPurchase;
    }

    public void setProcessedPurchase(ProcessedPurchase processedPurchase) {
        this.processedPurchase = processedPurchase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(String purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String number) {
        this.lotNumber = number;
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

    public String getRuDescription() {
        return ruDescription;
    }

    public void setRuDescription(String ruDescription) {
        this.ruDescription = ruDescription;
    }

    public String getKzDescription() {
        return kzDescription;
    }

    public void setKzDescription(String kzDescription) {
        this.kzDescription = kzDescription;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    public String getDeliverySchedule() {
        return deliverySchedule;
    }

    public void setDeliverySchedule(String deliverySchedule) {
        this.deliverySchedule = deliverySchedule;
    }

    public String getDeliveryTerms() {
        return deliveryTerms;
    }

    public void setDeliveryTerms(String deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    public String getKtru() {
        return ktru;
    }

    public void setKtru(String ktru) {
        this.ktru = ktru;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKato() {
        return kato;
    }

    public void setKato(String kato) {
        this.kato = kato;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSkp() {
        return skp;
    }

    public void setSkp(String skp) {
        this.skp = skp;
    }

    @Override
    public String toString() {
        return String.format("Lot{ source=%d,\n" +
                " number = \"%s\",\n" +
                " negnumber = \"%s\",\n" +
                " ruName = \"%s\",\n" +
                " ruDescription = \"%s\",\n" +
                " quantity = \"%s\",\n" +
                " price = %s,\n" +
                " sum = %s,\n" +
                " deliveryPlace = \"%s\"\n" +
                "}", sourceId, lotNumber, purchaseNumber, ruName, ruDescription, quantity, price, sum, deliveryPlace);
    }

    @Override
    public int hashCode() {
        return ((sourceId * 37) + lotNumber.hashCode() * 37) + purchaseNumber.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Lot lot = (Lot) obj;
        return lot.getSourceId() == this.sourceId
                && lot.getLotNumber().equals(this.lotNumber)
                && lot.getPurchaseNumber().equals(this.purchaseNumber);
    }

    public double getiQuantity() {
        return iQuantity;
    }

    public void setiQuantity(double iQuantity) {
        this.iQuantity = iQuantity;
    }

    public double getiPrice() {
        return iPrice;
    }

    public void setiPrice(double iPrice) {
        this.iPrice = iPrice;
    }

    public double getiSum() {
        return iSum;
    }

    public void setiSum(double iSum) {
        this.iSum = iSum;
    }
}
