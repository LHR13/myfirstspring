package com.LHR13.aop.api;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("MyBeforeAdvice : " + method.getName() + " " + o.getClass().getName());

    }
}
