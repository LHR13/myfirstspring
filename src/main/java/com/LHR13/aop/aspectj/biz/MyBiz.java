package com.LHR13.aop.aspectj.biz;

import com.LHR13.aop.aspectj.MyMethod;
import org.springframework.stereotype.Service;

@Service
public class MyBiz {

    @MyMethod("i love Taylor Swift !")
    public String save(String argcccs) {
        System.out.println("MyBiz save : " + argcccs);
        return "save success !";
//        throw new RuntimeException();
    }
}
