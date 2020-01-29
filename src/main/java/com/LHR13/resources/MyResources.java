package com.LHR13.resources;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import javax.annotation.Resources;
import java.io.IOException;

public class MyResources implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void Resources() {
        Resource resource = applicationContext.getResource("file:D:\\myfirstspring\\src\\main\\resources\\Lover");
        System.out.println(resource.getFilename());
        try {
            System.out.println(resource.getFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}