package com.zhang.wechat.Entity;

import java.util.Map;

public class VoiceMessage extends BaseMessage {
    private String mediaId;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    @Override
    public String toString() {
        return "VoiceMessage{" +
                "mediaId='" + mediaId + '\'' +
                "} " + super.toString();
    }

    public VoiceMessage(Map<String, String> requestMap,String mediaId) {
        super(requestMap);
        this.setMsgType("voice");
        this.mediaId = mediaId;
    }
}
