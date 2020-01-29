package com.LHR13.test;

import com.LHR13.autowrit.AutoWritingService;
import com.LHR13.service.InjectionService;
import com.LHR13.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class IOCtest extends UnitTestBase {

    public IOCtest() {
        super("classpath:spring-injection.xml");
    }

    @Test
    public void Test() {
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("asd");
    }
}
