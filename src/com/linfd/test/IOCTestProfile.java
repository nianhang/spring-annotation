package com.linfd.test;

import com.linfd.bean.Person;
import com.linfd.bean.Yellow;
import com.linfd.config.MainConfigOfProfile;
import com.linfd.config.MainConfigOfPropertyValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.sql.DataSource;

public class IOCTestProfile {


    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfProfile.class);

    @Test
    public void test01(){

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("dev");
        applicationContext.register(MainConfigOfProfile.class);
        applicationContext.refresh();


        String[] beanNamesForType = applicationContext.getBeanNamesForType(DataSource.class);

        for(String string:beanNamesForType){
            System.out.println(string);
        }

        Yellow bean = applicationContext.getBean(Yellow.class);
        System.out.println(bean);
        applicationContext.close();
    }


}
