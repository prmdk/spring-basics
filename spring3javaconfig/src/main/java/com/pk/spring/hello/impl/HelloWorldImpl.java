package com.pk.spring.hello.impl;

import com.pk.spring.hello.HelloWorld;

/**
 * Created by pkumar on 14/12/17.
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void showMsg(String msg) {
        System.out.println("Asked msg is : " + msg);
    }
}
