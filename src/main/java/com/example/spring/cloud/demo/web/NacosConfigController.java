package com.example.spring.cloud.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class NacosConfigController {

    @Value("${user.name}")
    String userName;

    @Value("${user.age}")
    int age;


    @RequestMapping("/user")
    public String simple() {
        return "获取 Nacos Config配置如下：" + userName + " " + age + "!";
    }
}