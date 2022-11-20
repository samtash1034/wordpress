package com.sam.wordpress;


import java.util.Random;

public class practice {

    public static void main(String[] args) {

        Random rand = new Random();

        for(int i = 0; i < 10; i++){
            int number = rand.nextInt(3) + 1;
            System.out.println(number);
        }

    }
}
