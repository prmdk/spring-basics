package com.pk.spring.config;

import com.pk.spring.hello.HelloWorld;
import com.pk.spring.hello.impl.HelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pkumar on 14/12/17.
 */
@Configuration
public class AppConfig {
    @Bean (name = "helloBean")
    public HelloWorld hb () {
        return new HelloWorldImpl();
    }
}
