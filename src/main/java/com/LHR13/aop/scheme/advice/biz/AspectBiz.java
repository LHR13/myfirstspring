package com.LHR13.aop.scheme.advice.biz;

public class AspectBiz {

    public void biz() {
        System.out.println("Only the young !");
        System.out.println(1/100);
    }

    public void init(String bizName, int times) {
        System.out.println("AsprctBiz init: " + bizName + " " + times);
    }
}
