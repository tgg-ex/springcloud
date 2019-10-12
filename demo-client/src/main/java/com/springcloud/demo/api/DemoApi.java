package com.springcloud.demo.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zyz
 * <p>
 * 调用demo-service接口
 */
@Component
@FeignClient("demo-service")
public interface DemoApi {
    @RequestMapping("/test")
    String testFind();
}
