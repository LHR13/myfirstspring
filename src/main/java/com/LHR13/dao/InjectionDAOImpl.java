package com.LHR13.dao;

public class InjectionDAOImpl implements InjectionDAO {

    @Override
    public void save(String arg) {
        System.out.println("向数据库中保存：" + arg);
    }
}
