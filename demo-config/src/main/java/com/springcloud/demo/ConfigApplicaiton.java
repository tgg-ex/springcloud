package com.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zyz
 * <p>
 * 配置中心启动类
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplicaiton.class, args);
    }

}
