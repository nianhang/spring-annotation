package com.linfd.test;

import com.linfd.bean.Blue;
import com.linfd.bean.Person;
import com.linfd.config.MainConfig;
import com.linfd.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.test.context.TestExecutionListeners;

import java.util.Map;

public class IOCTest {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);

    @Test
    public void testImport(){
        printBeans(context);
        Blue bean = context.getBean(Blue.class);
        System.out.println(bean);
        //工厂Bean获取的是调用getObject创建的对象
        Object colorFactoryBean = context.getBean("colorFactoryBean");
        Object colorFactoryBean2 = context.getBean("colorFactoryBean");
        System.out.println("bean的类型"+colorFactoryBean.getClass());
        System.out.println(colorFactoryBean == colorFactoryBean2);

        Object colorFactoryBean3 = context.getBean("&colorFactoryBean");
        System.out.println(colorFactoryBean3.getClass());
    }


    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String name: beanDefinitionNames){
            System.out.println(name);
        }
    }


    @SuppressWarnings("resource")
    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        for (String name:beanDefinitionNames){
            System.out.println(name);
        }
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);

        System.out.println("IOC容器创建完成......");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        for (String name:beanDefinitionNames){
            System.out.println(name);
        }

        Object person1 = context.getBean("person");
        Object person2 = context.getBean("person");
        System.out.println(person1 == person2);
    }

    @Test
    public void test3(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);

        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);

        String[] names = context.getBeanNamesForType(Person.class);

       for(String name:names){
            System.out.println(name);
        }
        Map<String, Person> beansOfType = context.getBeansOfType(Person.class);
        System.out.println(beansOfType);

    }


    @Test
    public void test4(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);

        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);

        String[] names = context.getBeanNamesForType(Person.class);

        for(String name:names){
            System.out.println(name);
        }
        Map<String, Person> beansOfType = context.getBeansOfType(Person.class);
        System.out.println(beansOfType);

    }

}
