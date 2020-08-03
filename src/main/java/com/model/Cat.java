package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cat {
    private String name;
    private int age;

    @Override
    public String toString() {
        return this.toString();
    }

//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
////        Cat cat = (Cat) bean;
//        System.out.println(bean + " !");
//        return bean;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        return bean;
//    }
}
