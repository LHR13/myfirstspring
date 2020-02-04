package com.LHR13.test.beanannotation;

import com.LHR13.beanannotation.injection.service.InjectionServiceImpl;
import com.LHR13.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {

    public TestInjection() {
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void TestAutowired() {
        InjectionServiceImpl service = super.getBean("injectionServiceImpl");
        service.save("this is autowired");
    }
}
