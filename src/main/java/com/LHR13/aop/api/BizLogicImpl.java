package com.LHR13.aop.api;

public class BizLogicImpl implements BizLogic {
    @Override
    public String save() {
        System.out.println("BizLogicImpl : Logic save.");
        return "Logic save.";
//        throw new RuntimeException();
    }
}
