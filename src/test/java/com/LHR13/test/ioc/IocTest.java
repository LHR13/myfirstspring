package com.LHR13.test.ioc;

import com.LHR13.service.InjectionService;
import com.LHR13.test.base.UnitTestBase;
import jdk.nashorn.internal.ir.Block;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class IocTest extends UnitTestBase {
    public IocTest() {
        super("classpath:spring-injection.xml");
    }

    @Test
    public void TestSetter() {
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.save("the vital data");
    }
}
