package com.sam.wordpress.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/test")//記得改成 PostMapping
    public String test(@RequestHeader(required = false) String name){

        System.out.println("header 參數 name 的值為：" + name);

        return "成功取得 request header 裡面的參數";
    }
}
