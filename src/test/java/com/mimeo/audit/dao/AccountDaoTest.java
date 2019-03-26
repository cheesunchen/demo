package com.mimeo.audit.dao;

import com.mimeo.audit.model.AccountDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountDaoTest {

    @Autowired
    private AccountDao accountDao;

    @Test
    public void selectAccountByMobile() {
        AccountDto dto = accountDao.selectAccountByMobile("15671616233");
        assertEquals("陈楚翔", dto.getNickName());
    }
}