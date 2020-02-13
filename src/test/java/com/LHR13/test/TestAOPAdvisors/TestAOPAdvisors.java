package com.LHR13.test.TestAOPAdvisors;

import com.LHR13.aop.scheme.advisors.service.InvokeService;
import com.LHR13.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.dao.PessimisticLockingFailureException;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPAdvisors extends UnitTestBase {

    public TestAOPAdvisors() {
        super("spring-aop-scheme-advisors.xml");
    }

    @Test
    public void TestAOPAdvisors() {
        InvokeService service = super.getBean("invokeService");
        service.invoke();

        System.out.println();
        try {
            service.invokeException();
        }catch (PessimisticLockingFailureException e) {
            System.out.println("error");
        }
    }
}
