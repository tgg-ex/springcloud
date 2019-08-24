package com.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @author zyz
 * <p>
 * 网关启动类
 */
@SpringBootApplication
@EnableZuulServer
@EnableEurekaClient
public class ZuulApplicaiton {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplicaiton.class, args);
    }
}
