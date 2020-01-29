package com.LHR13.defbean;

import org.springframework.stereotype.Component;

@Component("swift")
public class DefBean {
    public void say(String s) {
        System.out.println("defbean" + s);
    }
}
