package com.LHR13.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(* com.LHR13.aop.aspectj.biz.*Biz.*(..))")
    public void pointcut() {}

    @Pointcut("within(com.LHR13.aop.aspectj.biz.*)")
    public void bizPointcut() {}

//    @Before("execution(* com.LHR13.aop.aspectj.biz.*Biz.*(..))")
    @Before("pointcut()")
    public void before() {
        System.out.println("before");
    }

    @Before("pointcut() && args(arg)")
    public void beforeWithArg(String arg) {
        System.out.println("beforeWithArg : " + arg);
    }

    @Before("pointcut() && @annotation(myMethod)")
    public void beforeWithAnnotation(MyMethod myMethod) {
        System.out.println("beforeWithAnnotation : " + myMethod.value());
    }

    @AfterReturning(pointcut = "bizPointcut()",returning = "returnValue")
    public void afterReturning(Object returnValue) {
        System.out.println("after returning : " + returnValue.toString());
    }

    @AfterThrowing(pointcut = "pointcut()", throwing = "Exc")
    public void afterThrowing(Exception Exc) {
        System.out.println("after throwing : " + Exc.toString());
    }

    @After("pointcut()")
    public void after() {
        System.out.println("After.");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around 1");
        Object obj = pjp.proceed();
        System.out.println("around 2");
        System.out.println("around : " + obj);
        return obj;
    }
}
