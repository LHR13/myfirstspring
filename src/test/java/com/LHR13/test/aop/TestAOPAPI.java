package com.LHR13.test.aop;

import com.LHR13.aop.api.BizLogic;
import com.LHR13.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPAPI extends UnitTestBase {

    public TestAOPAPI() {
        super("spring-aop-api.xml");
//        super("spring-aop-api2.xml");
//        super("spring-aop-api3.xml");
    }

    @Test
    public void TestAOPAPI() {
        BizLogic logic = super.getBean("bizLogicImpl");
        logic.save();
    }
}
