package com.LHR13.test.autowrit;

import com.LHR13.autowrit.AutoWritingService;
import com.LHR13.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWriting extends UnitTestBase {

    public TestAutoWriting() {
        super("classpath:spring-autowriting.xml");
    }

    @Test
    public void Test() {
        AutoWritingService autoWritingService = super.getBean("autoWritingService");
        autoWritingService.say("can i go where you go?");
    }
}
