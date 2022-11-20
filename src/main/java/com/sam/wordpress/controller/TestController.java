package com.sam.wordpress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    //發起一個 http request http://localhost:8080/index(url)
    @RequestMapping ("/index")
    public String index(){

        return "index";//跳轉到 index.html
    }

}
