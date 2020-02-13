package com.LHR13.aop.api;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class MyAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("MyAfterReturningAdvice : " + method.getName() + "  " + o1.getClass().getName() + o);
    }
}
