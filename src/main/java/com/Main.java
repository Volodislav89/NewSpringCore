package com;

import com.config.CatConfig;
import com.model.Cat;
import com.model.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CatConfig.class)) {
//            Cat cat = applicationContext.getBean(Cat.class);
//            System.out.println(cat.getName());
            Dog dog = applicationContext.getBean(Dog.class);
//            System.out.println(dog.name);
//            System.out.println(dog.cat.getName());
//            System.out.println(dog);
//            Dog dog1 = applicationContext.getBean(Dog.class);
//            System.out.println(dog1);
//            dog1 = null;
        }
    }
}
