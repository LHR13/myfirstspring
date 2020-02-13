package com.LHR13.aop.scheme.advisors.service;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;

@Service
public class InvokeService {

    public void invoke() {
        System.out.println("InvokeService...");
    }

    public void invokeException() {
        throw new PessimisticLockingFailureException("");
    }
}
