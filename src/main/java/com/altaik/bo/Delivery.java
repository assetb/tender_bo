package com.altaik.bo;

/**
 * Created by admin on 25.09.2017.
 */
public class Delivery {
    private Integer id;
    private Integer userId;
    private String keyWordFirst;
    private String keyWordTwo;
    private String keyWordThree;
    private String startDay;
    private String endDay;
    private Boolean no;
    private Integer settingMailSenderId;
//    private List<UserSource> userSources;
//    private List<UserRegion> userRegions;
//    private List<UserMethod> userMethods;
//    private List<UserCustomer> userCustomers;
//    private List<IgnoredUserSource> ignoredUserSources;
//    private List<IgnoredUserRegion> ignoredUserRegions;
//    private List<IgnoredUserMethod> ignoredUserMethods;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getSettingMailSenderId() {
        return settingMailSenderId;
    }

    public void setSettingMailSenderId(Integer settingMailSenderId) {
        this.settingMailSenderId = settingMailSenderId;
    }

//    public List<IgnoredUserMethod> getIgnoredUserMethods() {
//        return ignoredUserMethods;
//    }
//
//    public void setIgnoredUserMethods(List<IgnoredUserMethod> ignoredUserMethods) {
//        this.ignoredUserMethods = ignoredUserMethods;
//    }
//
//    public List<IgnoredUserSource> getIgnoredUserSources() {
//        return ignoredUserSources;
//    }
//
//    public void setIgnoredUserSources(List<IgnoredUserSource> ignoredUserSources) {
//        this.ignoredUserSources = ignoredUserSources;
//    }
//
//    public List<IgnoredUserRegion> getIgnoredUserRegions() {
//        return ignoredUserRegions;
//    }
//
//    public void setIgnoredUserRegions(List<IgnoredUserRegion> ignoredUserRegions) {
//        this.ignoredUserRegions = ignoredUserRegions;
//    }
//
//    public List<UserCustomer> getUserCustomers() {
//        return userCustomers;
//    }
//
//    public void setUserCustomers(List<UserCustomer> userCustomers) {
//        this.userCustomers = userCustomers;
//    }
//
//    public List<UserMethod> getUserMethods() {
//        return userMethods;
//    }
//
//    public void setUserMethods(List<UserMethod> userMethods) {
//        this.userMethods = userMethods;
//    }
//
//    public List<UserRegion> getUserRegions() {
//        return userRegions;
//    }
//
//    public void setUserRegions(List<UserRegion> userRegions) {
//        this.userRegions = userRegions;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getKeyWordFirst() {
        return keyWordFirst;
    }

    public void setKeyWordFirst(String keyWordFirst) {
        this.keyWordFirst = keyWordFirst;
    }

    public String getKeyWordTwo() {
        return keyWordTwo;
    }

    public void setKeyWordTwo(String keyWordTwo) {
        this.keyWordTwo = keyWordTwo;
    }

    public String getKeyWordThree() {
        return keyWordThree;
    }

    public void setKeyWordThree(String keyWordThree) {
        this.keyWordThree = keyWordThree;
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

    public Boolean getNo() {
        return no;
    }

    public void setNo(Boolean no) {
        this.no = no;
    }

//    public List<UserSource> getUserSources() {
//        return userSources;
//    }
//
//    public void setUserSources(List<UserSource> userSources) {
//        this.userSources = userSources;
//    }
}
