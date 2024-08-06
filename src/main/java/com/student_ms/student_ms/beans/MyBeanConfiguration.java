package com.student_ms.student_ms.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // shows works w springboot
// so can be considered w the controllers and the rest
public class MyBeanConfiguration {

    @Bean
    // just for practice we don't create bean for name bean is
    // singlton means creats once. instead od creating new objects for every call we make we create bean


    public String getName(){
        return "name";
    }
}
