package com.LHR13.test.beanannotation;

import com.LHR13.beanannotation.javabased.Store;
import com.LHR13.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavaBased extends UnitTestBase {

    public TestJavaBased() {
        super("classpath*:spring-beanannotation.xml");
    }

//    @Test
//    public void test() {
//        Store store = super.getBean("outman");
//        System.out.println(store.getClass().getName());
//
//    }

    @Test
    public void TestG() {
        Store store = super.getBean("store");
    }
}
