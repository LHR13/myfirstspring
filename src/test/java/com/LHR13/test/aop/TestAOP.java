package com.LHR13.test.aop;

import com.LHR13.aop.scheme.advice.Fit;
import com.LHR13.aop.scheme.advice.biz.AspectBiz;
import com.LHR13.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOP extends UnitTestBase {

    public TestAOP () {
        super("spring-aop-scheme-advice.xml");
    }

    @Test
    public void TestBiz() {
        AspectBiz biz = super.getBean("aspectBiz");
        biz.biz();
        biz.init("Taylor Swift", 30);
    }

    @Test
    public void TestFit() {
        Fit fit = (Fit)super.getBean("aspectBiz");
        fit.Filter();
    }
}
