package com.LHR13.beanannotation.injection.dao;


import org.springframework.stereotype.Repository;

@Repository
public class InjectionDAOImpl implements InjectionDAO {

    @Override
    public void save(String arg) {
        System.out.println("向数据库中保存：" + arg);
    }
}
