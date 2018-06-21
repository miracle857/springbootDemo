package com.mxh.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @GetMapping("/")
    public String getMethod(){
        System.out.println("getMethod");
        return "hello";
    }
}
