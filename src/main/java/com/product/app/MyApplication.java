package com.product.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.product.app")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class MyApplication {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(MyApplication.class, args);
    }
}

