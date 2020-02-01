package com.LHR13.resources;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import java.io.IOException;

public class MyResources implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void Resources() {
        Resource resource = applicationContext.getResource("Url:https://www.imooc.com/video/3758/0");
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription()); 
    }
}