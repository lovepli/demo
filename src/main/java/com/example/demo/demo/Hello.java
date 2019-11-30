package com.example.demo.demo;

/**
 * @author: lipan
 * @date: 2019-06-06
 * @description:
 */
public class Hello {

    private final String name;

    public Hello(String name) {
        this.name=name;
    }

    public String hello() {
        return "Hello, " + name + "!";
    }

}
