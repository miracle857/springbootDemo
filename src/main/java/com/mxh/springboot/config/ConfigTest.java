package com.mxh.springboot.config;

import com.mxh.springboot.common.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConfigTest {

    @Autowired
    private Config config;

    @RequestMapping("/test")
    public String test() {
    	return config.getServers().toString();
    }

}
