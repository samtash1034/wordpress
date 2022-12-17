package com.sam.wordpress;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal {

    @Override
    public String sound(String sound) {

        return sound;
    }


}
