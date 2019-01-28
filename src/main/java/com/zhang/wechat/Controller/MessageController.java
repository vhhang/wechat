package com.zhang.wechat.Controller;

import com.zhang.wechat.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Map;

@RestController
public class MessageController {
    @Autowired
    private MessageService messageService;
    @RequestMapping(value = "/check",method =RequestMethod.GET)
    public void checkToken(HttpServletRequest request,HttpServletResponse response){
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");

        //校验请求
        if(messageService.check(timestamp,nonce,signature)){
            try {
                PrintWriter out = response.getWriter();
                out.print(echostr);
                out.flush();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("接入失败！");
        }
    }

    @RequestMapping(value = "/check",method =RequestMethod.POST)
    public void getMessage(HttpServletRequest request, HttpServletResponse response) {
        Map<String,String> requestMap = null;
        try {
            request.setCharacterEncoding("utf8");
            requestMap = messageService.parserRequest(request.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }


        //回复数据包
        String respXml = messageService.getRespose(requestMap);
        System.out.println("respxml:"+respXml);
        PrintWriter writer = null;
        try {
            response.setCharacterEncoding("utf8");
            writer = response.getWriter();
            writer.print(respXml);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
