package com.springcloud.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyz
 */
@RestController
public class DemoController {

    @RequestMapping("/test")
    public String testFind() {
        return "zyz";
    }
}
