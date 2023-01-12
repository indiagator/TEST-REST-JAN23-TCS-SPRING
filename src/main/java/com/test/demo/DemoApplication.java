package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication
{

    public static void main(String[] args) // inversion of control container - 1. main method is not written by you | 2. 'new' keyword is not used by you
    {
        SpringApplication.run(DemoApplication.class, args);
    }

}
