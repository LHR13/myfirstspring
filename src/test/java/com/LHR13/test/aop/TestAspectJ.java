package com.LHR13.test.aop;

import com.LHR13.aop.aspectj.biz.MyBiz;
import com.LHR13.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAspectJ extends UnitTestBase {

    public TestAspectJ() {
        super("spring-aop-aspectj.xml");
    }

    @Test
    public void TestAspectJ() {
        MyBiz biz = super.getBean("myBiz");
        biz.save("Miss American");
    }
}
