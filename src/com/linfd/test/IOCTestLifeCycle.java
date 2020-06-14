package com.linfd.test;

import com.linfd.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestLifeCycle {



    @Test
    public void test01(){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

        System.out.println("容器创建完成");

        Object car = context.getBean("car");


        context.close();
    }


}
