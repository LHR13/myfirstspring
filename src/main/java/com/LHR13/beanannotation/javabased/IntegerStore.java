package com.LHR13.beanannotation.javabased;

public class IntegerStore implements Store<Integer> {
    @Override
    public void init() {
        System.out.println("bean的初始化");
    }

    @Override
    public void destroy() {
        System.out.println("bean的摧毁");
    }
}
