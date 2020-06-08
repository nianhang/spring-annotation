package com.linfd.condition;

import com.linfd.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {


    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean red = registry.containsBeanDefinition("com.linfd.bean.Red");
        boolean blue = registry.containsBeanDefinition("com.linfd.bean.Blue");
        if(red && blue){
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
            registry.registerBeanDefinition("rainbow",rootBeanDefinition);
        }
    }
}
