package com.sam.wordpress.controller;

import com.sam.wordpress.Animal;
import com.sam.wordpress.Dog;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//創建bean
public class AnimalController {



    @Autowired//要使用 @Autowired，AnimalController 本身也必須是一個bean
    private Animal animal;

    @RequestMapping("/dog")
    public String dog(){

        String sound = animal.sound("狗狗旺旺叫");

        return sound;
    }
}
