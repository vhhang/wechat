package com.zhang.wechat.Entity;

import java.util.Map;

public class VideoMessage extends BaseMessage {
    private String mediaId;
    private String title;
    private String description;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VideoMessage(Map<String, String> requestMap,String mediaId,String title,String description) {
        super(requestMap);
        this.setMsgType("video");
        this.mediaId = mediaId;
        this.title = title;
        this.description = description;
    }
}
