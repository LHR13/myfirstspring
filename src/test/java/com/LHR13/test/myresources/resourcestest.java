package com.LHR13.test.myresources;

import com.LHR13.resources.MyResources;
import com.LHR13.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class resourcestest extends UnitTestBase {
    public resourcestest() {
        super("spring-resourse.xml");
    }

    @Test
    public void Test() {
        MyResources myResources = super.getBean("myResources");
        myResources.Resources();
    }
}
