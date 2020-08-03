package com.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Dog {
    public String name = "Alex";
    public Cat cat;

    public Dog(Cat cat) {
        this.cat = cat;
        System.out.println("constructor " + this);
    }

    @PostConstruct
    public void customInit()
    {
        System.out.println("Method customInit() invoked... " + this);
    }

    @PreDestroy
    public void customDestroy()
    {
        System.out.println("Method customDestroy() invoked... " + this);
    }
}
