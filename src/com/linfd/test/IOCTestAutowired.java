package com.linfd.test;

import com.linfd.bean.Boss;
import com.linfd.bean.Car;
import com.linfd.bean.Color;
import com.linfd.bean.Person;
import com.linfd.config.MainConfigOfAutowired;
import com.linfd.config.MainConfigOfPropertyValue;
import com.linfd.dao.BookDao;
import com.linfd.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class IOCTestAutowired {


    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

   /* private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String name: beanDefinitionNames){
            System.out.println(name);
        }
    }*/

    @Test
    public void test01(){

        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService);

        /*Object bookDao2 = context.getBean("bookDao2");
        System.out.println(bookDao2.toString());*/
       /* BookDao bookDao = context.getBean(BookDao.class);
        System.out.println(bookDao);*/

        Boss bean = context.getBean(Boss.class);
        System.out.println(bean);


        Car bean1 = context.getBean(Car.class);
        System.out.println(bean1);

        Color bean2 = context.getBean(Color.class);
        System.out.println(bean2);

        context.close();
    }


}
