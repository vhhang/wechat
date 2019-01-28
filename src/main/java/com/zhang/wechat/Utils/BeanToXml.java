package com.zhang.wechat.Utils;

import com.thoughtworks.xstream.XStream;
import com.zhang.wechat.Entity.BaseMessage;
import com.zhang.wechat.Entity.TextMessage;

public class BeanToXml {
    public static String beanToXml(BaseMessage message){
        XStream stream = new XStream();
        stream.processAnnotations(TextMessage.class);
        String xml = stream.toXML(message);
        return xml;
    }
}
