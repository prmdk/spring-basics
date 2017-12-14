package com.pk.spring;

import com.pk.spring.config.AppConfig;
import com.pk.spring.hello.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pkumar on 14/12/17.
 */
public class App {
    public static void main(String[] args) {
        String msg = "Random msg";
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");

        obj.showMsg("Hi " + msg);
    }
}
