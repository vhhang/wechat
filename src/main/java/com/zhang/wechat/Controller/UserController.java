package com.zhang.wechat.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhang.wechat.Entity.Source;
import com.zhang.wechat.Service.SourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class UserController {


    @RequestMapping("/login")
    public String login(){
        return "/page/login.html";
    }
    @RequestMapping(value = "/index")
    public String index(){
        return "/page/index.html";
    }
    @RequestMapping(value = "/toTable")
    public String toTbale(){
        return "/page/tables.html";
    }
    @RequestMapping(value = "/toAdd")
    public String toAdd() { return "/page/validations.html";}

}