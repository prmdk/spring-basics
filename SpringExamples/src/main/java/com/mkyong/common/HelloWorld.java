package com.mkyong.common;

/**
 * Created by pkumar on 14/12/17.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello ! " + name);
    }
}
