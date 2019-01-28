package com.zhang.wechat.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhang.wechat.Entity.Source;
import com.zhang.wechat.Service.SourceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@RestController
public class SourceController {
    @Autowired
    private SourceService sourceService;
    @RequestMapping(value = "/addSource")
    public Boolean addSource(HttpServletRequest request) throws IOException {
        boolean flag;
        String textarea = request.getParameter("textarea");
        if (("").equals(textarea) || null == textarea || textarea.isEmpty()){
            flag =true;
        }
        boolean b = sourceService.addSource(textarea);
        System.out.println("b:"+b);
        return false;
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public void add(Source source){
        System.out.println("source"+source);
        sourceService.add(source);
    }

    @RequestMapping(value = "/findSource")
    public PageInfo<Source> findSource(Model model, @RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
        System.out.println("pageNum:"+pageNum+",pageSize:"+pageSize);
        PageHelper.startPage(pageNum, pageSize);
        List<Source> sourceList = sourceService.findSource();
        PageInfo<Source> pageInfo = new PageInfo<Source>(sourceList);
        System.out.println(pageInfo);
        model.addAttribute("list",pageInfo);
        System.out.println("mode:"+model);
        return pageInfo;
    }
}
