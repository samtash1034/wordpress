package com.sam.wordpress;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

    @Override
    public String sound(String sound) {

        return sound;
    }
}
