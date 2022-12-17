package com.sam.wordpress.controller;

import lombok.Data;

@Data//透過 lombok 產生 getter/setter
public class Student {

    private Integer id;

    private String name;

    private String email;
}
