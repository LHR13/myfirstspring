package com.LHR13.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterception implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("MyMethodInterception 1 : " + methodInvocation.getMethod().getName() + "  " + methodInvocation);
        Object obj = methodInvocation.proceed();
        System.out.println("MyMethodInterception 2 : " + obj);
        return obj;
    }
}
