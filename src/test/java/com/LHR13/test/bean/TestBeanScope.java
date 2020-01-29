package com.LHR13.test.bean;

import com.LHR13.bean.Beanscope;
import com.LHR13.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {

    public TestBeanScope() {
        super("classpath*:spring-beanscope.xml");
    }

    @Test
    public void testSay() {
        Beanscope beanscope = super.getBean("beanscope");
        beanscope.say();

        Beanscope beanscope2 = super.getBean("beanscope");
        beanscope2.say();
    }

//    @Test
//    public void testSay2() {
//        Beanscope beanscope = super.getBean("beanscope");
//        beanscope.say();
//    }
//
}
