package com.LHR13.beanannotation;

import org.springframework.stereotype.Component;

@Component
public class BeanAnnotation  {

    public void say(String a) {
        System.out.println("Beanannotation : " + a);
    }
}
