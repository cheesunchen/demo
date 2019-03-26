package com.mimeo.audit.service.impl;

import com.mimeo.audit.dao.TestDao;
import com.mimeo.audit.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    public String selectStr(){
        return testDao.selectMobile();
    }
}
