package com.mimeo.audit.controller;

import com.mimeo.audit.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
        return "Hello SpringBoot!";
    }

    @RequestMapping(value = "selectStr", method = RequestMethod.GET)
    public String selectStr(){
        return testService.selectStr();
    }

}
