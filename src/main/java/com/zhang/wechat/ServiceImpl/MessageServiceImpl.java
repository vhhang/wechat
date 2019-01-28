package com.zhang.wechat.ServiceImpl;

import com.zhang.wechat.Entity.BaseMessage;
import com.zhang.wechat.Entity.Source;
import com.zhang.wechat.Entity.TextMessage;
import com.zhang.wechat.Mapper.SourceMapper;
import com.zhang.wechat.Service.MessageService;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletInputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.zhang.wechat.Utils.BeanToXml.beanToXml;

import static com.zhang.wechat.Utils.Sha1.sha1;

@Service
public class MessageServiceImpl implements MessageService {
    private static final String TOKEN = "zhanghang";
    @Autowired
    private SourceMapper sourceMapper;

    @Override
    public Map<String, String> parserRequest(ServletInputStream inputStream) {
        Map<String, String> map = new HashMap<String, String>();
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(inputStream);
            Element rootElement = document.getRootElement();
            List<Element> elements = rootElement.elements();
            for (Element e : elements) {
                map.put(e.getName(), e.getStringValue());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public boolean check(String timestamp, String nonce, String signature) {

        //1）将token、timestamp、nonce三个参数进行字典序排序
        String[] arr = {TOKEN, timestamp, nonce};
        Arrays.sort(arr);


        // 2）将三个参数字符串拼接成一个字符串进行sha1加密
        String newStr = arr[0] + arr[1] + arr[2];
        String mysig = sha1(newStr);

        // 3）开发者获得加密后的字符串可与signature对比，标识该请求来源于微信

        return mysig.equalsIgnoreCase(signature);
    }

    @Override
    public String getRespose(Map<String, String> requestMap) {
        BaseMessage msg = null;
        String msgType = requestMap.get("MsgType");

        switch (msgType) {
            case "text":
                //处理文本消息
                msg = dealTextMsg(requestMap);
                break;
            case "image":
                break;
            case "voice":
                break;
            case "video":
                break;
            case "shortvideo":
                break;
            case "location":
                break;
            case "link":
                break;

        }
        return beanToXml(msg);
    }

    private BaseMessage dealTextMsg(Map<String, String> requestMap) {

        String reqContent = requestMap.get("Content");
        if ("" == reqContent && null == reqContent) {
            TextMessage tm = new TextMessage(requestMap, "are you ok?");
        }
        Source source = sourceMapper.querySourceByReqContent(reqContent);
        if (source==null){
            TextMessage tm = new TextMessage(requestMap, "你输入的啥呀?");
            return tm;
        }
        String respContent = "电影："+source.getSourceName()+"链接："+source.getSourceUrl()+"提取码："+source.getSourcePwd();
        TextMessage tm = new TextMessage(requestMap, respContent);
        return tm;

    }

    @Override
    public String getRespContent(String content) {
        String respContext = sourceMapper.querySourceByReqContent(content).getSourceUrl();
        return null;
    }
}
