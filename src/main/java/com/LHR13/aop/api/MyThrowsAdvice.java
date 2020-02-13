package com.LHR13.aop.api;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class MyThrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception e) throws Throwable {
        System.out.println("afterThrowing 1");
    }

    public void afterThrowing(Method method, Object[] args, Object target, Exception e) throws Throwable {
        System.out.println("afterThrowing 2" + method.getName() + "  " + target.getClass().getName());
    }
}
