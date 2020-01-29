package com.LHR13.test.defbean;

import com.LHR13.defbean.DefBean;
import com.LHR13.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestDefBean extends UnitTestBase {

    public TestDefBean() {
        super("classpath*:defbean.xml");
    }

    @Test
    public void testSay() {
        DefBean defBean = super.getBean("defBean");
        defBean.say(" i love Taylor");
    }
}
