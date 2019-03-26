package com.mimeo.audit.dao;

import com.mimeo.audit.model.AccountDto;

public interface AccountDao {

    /**
     * 根据手机查询用户
     * @param mobile
     * @return AccountDto
     */
    AccountDto selectAccountByMobile(String mobile);
}
