package com.zhang.wechat.Entity;

import java.util.Map;

public class MusicMessage extends BaseMessage {
    private Music music;

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public MusicMessage(Map<String, String> requestMap, Music music) {
        super(requestMap);
        this.setMsgType("music");
        this.music = music;
    }
}
