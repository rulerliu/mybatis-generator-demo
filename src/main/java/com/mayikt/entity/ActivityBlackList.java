package com.mayikt.entity;

public class ActivityBlackList {
    private Long blackListId;

    private Long activityBlackListFileId;

    private String phoneNumber;

    private Long marketingActivityId;

    public Long getBlackListId() {
        return blackListId;
    }

    public void setBlackListId(Long blackListId) {
        this.blackListId = blackListId;
    }

    public Long getActivityBlackListFileId() {
        return activityBlackListFileId;
    }

    public void setActivityBlackListFileId(Long activityBlackListFileId) {
        this.activityBlackListFileId = activityBlackListFileId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public Long getMarketingActivityId() {
        return marketingActivityId;
    }

    public void setMarketingActivityId(Long marketingActivityId) {
        this.marketingActivityId = marketingActivityId;
    }
}