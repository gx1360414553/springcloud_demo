package com.qf.springcloud_consumer_feign_6061.service;

import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements IUserService {
    @Override
    public String hello(String param) {
        return "返回默认响应！！！！！！！";
    }
}
