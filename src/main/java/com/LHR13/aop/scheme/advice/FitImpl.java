package com.LHR13.aop.scheme.advice;

public class FitImpl implements Fit {
    @Override
    public void Filter() {
        System.out.println("FitImpl filter");
    }
}
