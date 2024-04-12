package com.testing.coordinates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:SwitchPropertiesDev.txt")
public class CoordinatesApplication{
    public static void main(String[] args){
        SpringApplication.run(CoordinatesApplication.class, args);
    }
}