package com.zhang.wechat;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    @org.junit.Test
    public void fun(){
       String url = "寄生兽链接：https://pan.baidu.com/s/1D8QvigTZrNwnn3suI3PMcg 提取码：54dO";
        String[] split = url.split("链接：");
        for (String s : split){
            System.out.println(s);
            if (s.contains("提取码：")){
                String[] split1 = s.split("提取码：");
                for (String str : split1){
                    System.out.println(str);
                }
            }
            System.out.println(s);
        }
    }

    @org.junit.Test
    public void read(){
        List<List> lists = new ArrayList<List>();

        try {
            FileReader fileReader = new FileReader("C:\\idea\\wechat\\src\\main\\resources\\static\\url.txt");
            BufferedReader br = new BufferedReader(fileReader);
            List<Map<String,String>> listMap = new ArrayList<Map<String, String>>();
            String line = null;
            while ((line=br.readLine())!=null){
                Map map = new HashMap();
                String[] strs = line.split("链接：");
                System.out.println(strs[0]);
                map.put("电影",strs[0]);
                for(String s : strs){

                    if (s.contains("提取码：")){
                        String[] strings = s.split("提取码：");
                        map.put("链接：",strings[0]);
                        map.put("提取码：",strings[1]);
                    }
                }
              listMap.add(map);
            }
            lists.add(listMap);

            br.close();
        } catch (IOException e) {
            throw new RuntimeException("文件路径不对");
        }
    }
}
