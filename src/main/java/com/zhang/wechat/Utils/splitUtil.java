package com.zhang.wechat.Utils;

import com.zhang.wechat.Entity.Source;

import javax.servlet.ServletInputStream;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class splitUtil {
    public static List<Source> splitUtil(String textarea) {
        List<Source> lists = new ArrayList<Source>();

        try {
            //FileReader fileReader = new FileReader("C:\\idea\\wechat\\src\\main\\resources\\static\\url.txt");
            InputStream inputStream = new ByteArrayInputStream(textarea.getBytes());
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;
            while ((line = br.readLine()) != null) {
                Source source = new Source();
                Map map = new HashMap();
                String[] strs = line.split("链接：");
                System.out.println(strs[0]);
                source.setSourceName(strs[0]);
                for (String s : strs) {

                    if (s.contains("提取码：")) {
                        String[] strings = s.split("提取码：");
                        source.setSourceUrl(strings[0]);
                        source.setSourcePwd(strings[1]);
                        source.setSourceType("0");
                    }
                }
                lists.add(source);
            }
            System.out.println("list:" + lists);

            br.close();
        } catch (IOException e) {
            throw new RuntimeException("文件路径不对");
        }
        return lists;
    }
}



