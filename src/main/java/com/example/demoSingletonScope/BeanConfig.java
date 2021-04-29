package com.example.demoSingletonScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean
    @Scope("singleton")
    public Person newPerson() {
        return new Person();
    }
}
