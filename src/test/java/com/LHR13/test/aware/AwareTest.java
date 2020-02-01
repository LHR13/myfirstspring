package com.LHR13.test.aware;

import com.LHR13.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class AwareTest extends UnitTestBase {

    public AwareTest() {
        super("classpath:spring-aware.xml");
    }

    @Test
    public void test() {
        //System.out.println(super.getBean("myApplicationContext").hashCode());
    }
}
