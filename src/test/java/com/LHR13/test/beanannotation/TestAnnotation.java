package com.LHR13.test.beanannotation;


import com.LHR13.beanannotation.BeanAnnotation;
import com.LHR13.beanannotation.injection.service.InjectionService;
import com.LHR13.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAnnotation extends UnitTestBase {

    public TestAnnotation() {
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void Testsay() {
        BeanAnnotation annotation = super.getBean("beanAnnotation");
        annotation.say("this is a test");
    }
}
