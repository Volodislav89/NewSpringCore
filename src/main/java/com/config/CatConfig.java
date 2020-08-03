package com.config;

import com.model.Cat;
import com.model.MyBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.model"
})
public class CatConfig {
    @Bean
    public Cat createCate() {
        return new Cat("Fluff", 3);
    }

    @Bean
    public MyBeanPostProcessor beanPostProcessor() {
        return new MyBeanPostProcessor();
    }
}
