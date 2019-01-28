package com.zhang.wechat.Service;


import javax.servlet.ServletInputStream;
import java.util.Map;


public interface MessageService {
    Map<String,String> parserRequest(ServletInputStream inputStream);

    boolean check(String timestamp, String nonce, String signature);
    /*
    用于处理所有的事件和消息的回复内容
     */
    String getRespose(Map<String,String> requestMap);

    String getRespContent(String content);
}
