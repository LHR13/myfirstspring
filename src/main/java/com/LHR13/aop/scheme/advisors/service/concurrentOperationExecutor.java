package com.LHR13.aop.scheme.advisors.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;
import org.springframework.dao.PessimisticLockingFailureException;

public class concurrentOperationExecutor implements Ordered {

    private static final int DEFAULT_MAX_RETRIES = 2;

    private int maxRetires = DEFAULT_MAX_RETRIES;

    private int order = 1;

    public int getMaxRetires() {
        return maxRetires;
    }

    public void maxReties(int maxRetires) {
        this.maxRetires = maxRetires;
    }

    public void setMaxRetires(int maxRetires) {
        this.maxRetires = maxRetires;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public int getOrder() {
        return 0;
    }

    public Object doConcurrentOperation(ProceedingJoinPoint pjp) throws Throwable {
        int numAttemps = 0;
        PessimisticLockingFailureException lockingFailureException;
        do {
            numAttemps++;
            System.out.println("Try times : " + numAttemps);
            try {
                return pjp.proceed();
            }catch (PessimisticLockingFailureException ex) {
                lockingFailureException = ex;
            }
        } while (numAttemps <= this.maxRetires);
        System.out.println("Try error : " + numAttemps);
        throw lockingFailureException;
    }
}
