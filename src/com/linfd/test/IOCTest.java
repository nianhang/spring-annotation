package com.linfd.test;

import com.linfd.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.TestExecutionListeners;

public class IOCTest {

    @SuppressWarnings("resource")
    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        for (String name:beanDefinitionNames){
            System.out.println(name);
        }
    }

}
