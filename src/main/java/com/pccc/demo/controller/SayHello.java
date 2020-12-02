package com.pccc.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("say")
public class SayHello {

    @RequestMapping("/hello")
    public  String  hello(){
        return  " hello";
    }

    @RequestMapping("/hot")
    public  String  hot(){
        return  " hot";
    }
}
