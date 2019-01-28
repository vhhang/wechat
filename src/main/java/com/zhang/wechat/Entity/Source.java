package com.zhang.wechat.Entity;

public class Source {
    private String sourceId;
    private String sourceName;
    private String sourceUrl;
    private String sourcePwd;
    private String sourceType;

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getSourcePwd() {
        return sourcePwd;
    }

    public void setSourcePwd(String sourcePwd) {
        this.sourcePwd = sourcePwd;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    @Override
    public String toString() {
        return "Source{" +
                "sourceId='" + sourceId + '\'' +
                ", sourceName='" + sourceName + '\'' +
                ", sourceUrl='" + sourceUrl + '\'' +
                ", sourcePwd='" + sourcePwd + '\'' +
                ", sourceType='" + sourceType + '\'' +
                '}';
    }
}
