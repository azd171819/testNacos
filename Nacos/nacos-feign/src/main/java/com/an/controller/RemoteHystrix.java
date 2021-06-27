package com.an.controller;

import org.springframework.stereotype.Component;

@Component
public class RemoteHystrix implements RemoteClient{
    public String helloNacos() {
        return "helloNacos:请求超时了";
    }

//    public String helloNacos() {
//        return "helloNacos:请求超时了";
//    }
}
