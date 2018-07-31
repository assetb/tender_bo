package com.altaik.bo;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 25.09.2017.
 */
public class ProcessedPurchase {
    private Integer id;
    private Integer sourceId;
    private Source source;
    private String number;
    private String ruName;
    private String kzName;
    private Integer customerId;
    private String customer;
    private String organizer;
    private Integer regionId;
    private Region region;
    private Integer methodId;
    private Method method;
    private String status;
    private String publishDay;
    private String startDay;
    private String endDay;
    private String attribute;
    private String priceSuggestion;
    private String type;
    private String link;
    private Integer statusInt;
    private Date dEndDay;
    private Timestamp timeInserted;
    private Date dStartDay;
    private Date loadDay;
    private Date dPublishDay;
    private Integer isDocs;
    private String docsZip;
    private Float iSum;
    private String additionalInformation;
    private List<Lot> lots = new ArrayList<>();

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer source) {
        this.sourceId = source;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer venue) {
        this.regionId = venue;
    }

    public Integer getMethodId() {
        return methodId;
    }

    public void setMethodId(Integer method) {
        this.methodId = method;
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

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getPriceSuggestion() {
        return priceSuggestion;
    }

    public void setPriceSuggestion(String priceSuggestion) {
        this.priceSuggestion = priceSuggestion;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getStatusInt() {
        return statusInt;
    }

    public void setStatusInt(Integer isStatus) {
        this.statusInt = isStatus;
    }

    public Date getdEndDay() {
        return dEndDay;
    }

    public void setdEndDay(Date dEndDay) {
        this.dEndDay = dEndDay;
    }

    public Timestamp getTimeInserted() {
        return timeInserted;
    }

    public void setTimeInserted(Timestamp timeInserted) {
        this.timeInserted = timeInserted;
    }

    public Date getdStartDay() {
        return dStartDay;
    }

    public void setdStartDay(Date dStartDay) {
        this.dStartDay = dStartDay;
    }

    public Date getLoadDay() {
        return loadDay;
    }

    public void setLoadDay(Date loadDay) {
        this.loadDay = loadDay;
    }

    public Date getdPublishDay() {
        return dPublishDay;
    }

    public void setdPublishDay(Date dPublishDay) {
        this.dPublishDay = dPublishDay;
    }

    public Integer getIsDocs() {
        return isDocs;
    }

    public void setIsDocs(Integer isDocs) {
        this.isDocs = isDocs;
    }

    public String getDocsZip() {
        return docsZip;
    }

    public void setDocsZip(String docsZip) {
        this.docsZip = docsZip;
    }

    public Float getiSum() {
        return iSum;
    }

    public void setiSum(Float iSum) {
        this.iSum = iSum;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public List<Lot> getLots() {
        return lots;
    }

    public void setLots(List<Lot> lots) {
        this.lots = lots;
    }
}
