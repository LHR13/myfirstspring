package com.LHR13.beanannotation.multibean;

import com.LHR13.beanannotation.injection.service.InjectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class BeanInvoker {

    @Autowired
    private List<BeanInterFace> list;

    @Autowired
    private Map<String, BeanInterFace> map;

    @Autowired
    @Qualifier("beanInterFaceImpNumTwo")
    private BeanInterFace beanInterFace;

    public void sayByList() {
        if (null != list && list.size() != 0) {
            System.out.println("SayByList...");
            for (BeanInterFace beanInterFace : list) {
                System.out.println(beanInterFace.getClass().getName());
            }
        }else {
            System.out.println("This is a null List or an empty List");
        }
    }

    public void sayByMap() {
        if (null != map && map.size() != 0) {
            System.out.println("SayByMap...");
            for (Map.Entry<String, BeanInterFace> entry : map.entrySet()) {
                System.out.println("[" + entry.getKey() + ", " + entry.getValue().getClass().getName() + "] ");
            }
        }else {
            System.out.println("this is a null Map or an empty Map");
        }
        System.out.println(beanInterFace.getClass().getName());
    }
}
