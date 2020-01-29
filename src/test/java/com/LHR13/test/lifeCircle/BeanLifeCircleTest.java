package com.LHR13.test.lifeCircle;

import com.LHR13.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class  BeanLifeCircleTest extends UnitTestBase {

    public BeanLifeCircleTest() {
        super("classpath:BeanLifeCycle.xml");
    }
    @Test
    public void test() {
        super.getBean("BeanLifeCycle");
    }
}
