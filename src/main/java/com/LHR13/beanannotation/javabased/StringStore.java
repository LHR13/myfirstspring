package com.LHR13.beanannotation.javabased;

public class StringStore implements Store<String> {

    public void init() {
        System.out.println("bean的初始化");
    }

    public void destroy() {
        System.out.println("bean的摧毁");
    }
}
