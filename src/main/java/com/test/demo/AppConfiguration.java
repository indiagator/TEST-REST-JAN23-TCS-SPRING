package com.test.demo;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfiguration
{
    @Bean
    //@Bean(name = "testone") // Only for Infrastructure Beans
    //@Scope("prototype")
    @Primary
    TestClass getBeanTestClassOne()
    {
       return new TestClass("one");
    }

    @Bean
    //@Bean(name = "testtwo") // Only for Infrastructure Beans
    //@Scope("prototype")
    TestClass getBeanTestClassTwo()
    {
        return new TestClass("two");
    }
}
