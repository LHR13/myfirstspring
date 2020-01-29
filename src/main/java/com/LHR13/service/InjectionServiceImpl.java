package com.LHR13.service;

import com.LHR13.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;

    //构造器注入
//    public InjectionServiceImpl(InjectionDAO injectionDAO) {
//        this.injectionDAO = injectionDAO;
//    }

    //设值注入
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String arg) {
        System.out.println("Service接收参数：" + arg);
        arg = arg + ":" + this.hashCode();
        injectionDAO.save(arg);
    }
}
