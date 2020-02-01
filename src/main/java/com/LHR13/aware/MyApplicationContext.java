package com.LHR13.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyApplicationContext implements ApplicationContextAware, BeanNameAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("My application context is " + applicationContext.getBean("myApplicationContext"));
    }

    @Override
    public void setBeanName(String name) {
        //System.out.println("My bean name is " + name);
    }
}
