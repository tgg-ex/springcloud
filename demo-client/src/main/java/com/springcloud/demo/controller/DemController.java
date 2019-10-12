package com.springcloud.demo.controller;

import com.springcloud.demo.api.DemoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyz
 */
@RestController
public class DemController {
    @Autowired
    private DemoApi demoApi;

    @RequestMapping("/test")
    public String testFind() {
        return demoApi.testFind();
    }
}
