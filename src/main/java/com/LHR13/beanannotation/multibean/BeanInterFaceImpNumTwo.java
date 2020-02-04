package com.LHR13.beanannotation.multibean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class BeanInterFaceImpNumTwo implements BeanInterFace {
}
