package com.LHR13.test.multibean;

import com.LHR13.beanannotation.multibean.BeanInvoker;
import com.LHR13.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestMultibean extends UnitTestBase {

    public TestMultibean() {
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void TestMultibean() {
        BeanInvoker beanInvoker = super.getBean("beanInvoker");
        beanInvoker.sayByList();
        beanInvoker.sayByMap();
    }
}

