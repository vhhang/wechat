package com.zhang.wechat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.zhang.wechat.Mapper")
@ComponentScan(basePackages = "com.zhang.wechat")
/*public class WechatApplication {
    public static void main(String[] args) {
        SpringApplication.run(WechatApplication.class, args);
    }*/
public class WechatApplication extends SpringBootServletInitializer{
    protected SpringApplicationBuilder configure(SpringApplicationBuilder app){
        return app.sources(WechatApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(WechatApplication.class,args);
    }
}

