package com.linfd.config;

import com.linfd.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.linfd")
public class MainConfig {

    @Bean
    public Person person(){
        return new Person("lisi",20);
    }

}
