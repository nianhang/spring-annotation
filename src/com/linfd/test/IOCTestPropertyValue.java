package com.linfd.test;

import com.linfd.bean.Person;
import com.linfd.config.MainConfigOfLifeCycle;
import com.linfd.config.MainConfigOfPropertyValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class IOCTestPropertyValue {


    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfPropertyValue.class);

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String name: beanDefinitionNames){
            System.out.println(name);
        }
    }

    @Test
    public void test01(){
        printBeans(context);
        System.out.println("================================");

        Person person = (Person) context.getBean("person");
        System.out.println(person);

        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("person.nickName");
        System.out.println(property);


        context.close();
    }


}
