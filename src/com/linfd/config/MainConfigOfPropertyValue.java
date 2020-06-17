package com.linfd.config;

import com.linfd.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = {"file:./config/person.properties"})
public class MainConfigOfPropertyValue {

    @Bean
    public Person person(){
        return new Person();
    }

}
