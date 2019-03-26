package com.mimeo.audit.service.impl;

import com.mimeo.audit.dao.TestDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceImplTest {
    @Autowired
    private TestDao testDao;

    @Test
    public void selectStr() {
        String str = testDao.selectMobile();
        assertEquals("111", str);
    }
}