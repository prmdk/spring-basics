package com.pk.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pkumar on 14/12/17.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"Spring-Common.xml"});

        OutputHelper output = (OutputHelper)context.getBean("outputHelper");
        output.generateOutput();

    }
}
