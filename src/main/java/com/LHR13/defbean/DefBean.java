package com.LHR13.defbean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("swift")
//@Scope("prototype")
public class DefBean {
    public void say(String s) {
        System.out.println("defbean" + s);
    }
}
