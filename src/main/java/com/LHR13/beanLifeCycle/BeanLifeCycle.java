package com.LHR13.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean,DisposableBean {
    public void default_init() {
        System.out.println("(配置全局默认方法):the bean is  initialised");
    }

    public void default_destroy() {
        System.out.println("(配置全局默认方法):the bean is destroyed");
    }

    public void init_method() {
        System.out.println("(配置init_method方法):this bean is started");
    }

    public void destroy_method() {
        System.out.println("(配置destroy_method方法):this bean is destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("(接口方法)这个bean被初始化了");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("(接口方法)这个bean被销毁了");
    }
}
