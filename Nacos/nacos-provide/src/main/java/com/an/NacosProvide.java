package com.an;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class NacosProvide {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvide.class, args);
    }

    @GetMapping("/helloNacos")
    public String helloNacos(){
        return "你好，nacos！";
    }
}
