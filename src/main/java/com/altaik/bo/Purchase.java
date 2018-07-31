/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altaik.bo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Aset
 */
public class Purchase implements Serializable {

    public String type;
    public String kzName;
    public String ruName;
    public String customer;
    public String organizer;
    public String venue;
    public String method;
    public String status;
    public String publishDay;
    public String startDay;
    public String endDay;
    public String sum;
    public String attribute;
    public int nLots;
    public List<Lot> lots;
    public String priceSuggestion;
    public String link;
    public String pathToStogare;
    public String attribute2;
    public Map<String, String> urlsToUploadFiles;
    public int isDocs = 0;
    public PurchaseAddition addition;
    public int ivenue;
    public int isource;
    public int imethod;
    public int istatus;
    public int error = 0; // Номер ошибки
    public String additionalinformation;
    public int source;
    public String number;
    private int id;
//    private PurchaseId purchaseId;

//    public PurchaseId getPurchaseId() {
//        return purchaseId;
//    }
//
//    public void setPurchaseId(PurchaseId purchaseId) {
//        this.purchaseId = purchaseId;
//    }

    public int getSource() {
//        if (purchaseId != null)
//            return purchaseId.getSource();
//        return 0;
        return this.source;
    }

    public void setSource(int source) {
//        if (purchaseId == null)
//            purchaseId = new PurchaseId();
//        purchaseId.setSource(source);
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
//        if (purchaseId != null)
//            return purchaseId.getNumber();
//        return null;
        return this.number;
    }

    public void setNumber(String number) {
//        if (purchaseId == null)
//            purchaseId = new PurchaseId();
//        purchaseId.setNumber(number);
        this.number = number;
    }

    public String getKzName() {
        return kzName;
    }

    public void setKzName(String kzName) {
        this.kzName = kzName;
    }

    public String getRuName() {
        return ruName;
    }

    public void setRuName(String ruName) {
        this.ruName = ruName;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPublishDay() {
        return publishDay;
    }

    public void setPublishDay(String publishDay) {
        this.publishDay = publishDay;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int getnLots() {
        return nLots;
    }

    public void setnLots(int nLots) {
        this.nLots = nLots;
    }

//    public List<Lot> getLots() {
//        return lots;
//    }
//
//    public void setLots(List<Lot> lots) {
//        this.lots = lots;
//    }

    public String getPriceSuggestion() {
        return priceSuggestion;
    }

    public void setPriceSuggestion(String priceSuggestion) {
        this.priceSuggestion = priceSuggestion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPathToStogare() {
        return pathToStogare;
    }

    public void setPathToStogare(String pathToStogare) {
        this.pathToStogare = pathToStogare;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public Map<String, String> getUrlsToUploadFiles() {
        return urlsToUploadFiles;
    }

    public void setUrlsToUploadFiles(Map<String, String> urlsToUploadFiles) {
        this.urlsToUploadFiles = urlsToUploadFiles;
    }

    public int getIsDocs() {
        return isDocs;
    }

    public void setIsDocs(int isDocs) {
        this.isDocs = isDocs;
    }

    public PurchaseAddition getAddition() {
        return addition;
    }

    public void setAddition(PurchaseAddition addition) {
        this.addition = addition;
    }

    public int getIvenue() {
        return ivenue;
    }

    public void setIvenue(int ivenue) {
        this.ivenue = ivenue;
    }

    public int getIsource() {
        return isource;
    }

    public void setIsource(int isource) {
        this.isource = isource;
    }

    public int getImethod() {
        return imethod;
    }

    public void setImethod(int imethod) {
        this.imethod = imethod;
    }

    public int getIstatus() {
        return istatus;
    }

    public void setIstatus(int istatus) {
        this.istatus = istatus;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getAdditionalinformation() {
        return additionalinformation;
    }

    public void setAdditionalinformation(String additionalinformation) {
        this.additionalinformation = additionalinformation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "source = " + getSource() + "\r\n" +
                " number = " + getNumber() + "\r\n" +
                " ruName = " + ruName + "\r\n" +
                " organizer = " + organizer + "\r\n" +
                " venue = " + venue + "\r\n" +
                " method = " + method + "\r\n" +
                " status = " + status + "\r\n" +
                " startDay = " + startDay + "\r\n" +
                " endDay = " + endDay + "\r\n" +
                " type = " + type + "\r\n" +
                " publishDay = " + publishDay + "\r\n" +
                " link = " + link + "\r\n" +
                '}';
    }

    @Override
    public int hashCode() {
        return (number.hashCode() * 37) + source;
    }

    @Override
    public boolean equals(Object obj) {
        Purchase purchase = (Purchase) obj;
        return purchase.getNumber().equals(this.number)
                && purchase.getSource() == this.source;
    }
}
