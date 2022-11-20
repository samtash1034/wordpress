package com.sam.wordpress.controller;

import com.sam.wordpress.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalSound {

    @Autowired
    private Animal animal;

    public String getAnimalSound(){
        return animal.sound("狗狗旺旺叫");
    }

    public static void main(String[] args) {

        System.out.println(new AnimalSound().getAnimalSound());
    }
}
