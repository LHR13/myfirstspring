package com.LHR13.aop.scheme.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyMoocAspect {

    public void afterThrowing() {
        System.out.println("MyMoocAspect afterThrowing");
    }

    public void before() {
        System.out.println("MyMoocAspect before");
    }

    public void afterReturning() {
        System.out.println("MyMoocAspect afterReturning");
    }

    public void after() {
        System.out.println("MyMoocAspect after");
    }

    public Object around(ProceedingJoinPoint pjp) {
        Object o = null;
        System.out.println("around前");
        try {
            o = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around后");
        return o;
    }

    public Object aroundInit(ProceedingJoinPoint pjp, String bizName, int times) {
        System.out.println("bizName: " + bizName + "times: " + times);
        Object o = null;
        System.out.println("aroundInit前");
        try {
            o = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("aroundInit后");
        return o;
    }
}
