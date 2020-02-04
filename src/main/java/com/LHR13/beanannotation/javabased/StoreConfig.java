package com.LHR13.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {

    @Autowired
    private Store<String> s1;

    @Autowired
    private Store<Integer> s2;

//    @Bean(name = "outman", initMethod = "init", destroyMethod = "destroy")
//    public Store getStringStore() {
//        return new StringStore();
//    }

    @Bean
    public IntegerStore integerStore() {
        return new IntegerStore();
    }

    @Bean
    public StringStore stringStore() {
        return new StringStore();
    }

    @Bean(name = "store")
    public Store<Double> TestStore() {
        System.out.println("s1 : " + s1.getClass().getName());
        System.out.println("s2 : " + s2.getClass().getName());
        return new Store<Double>() {
            @Override
            public void init() {

            }

            @Override
            public void destroy() {

            }
        };
    }

}
