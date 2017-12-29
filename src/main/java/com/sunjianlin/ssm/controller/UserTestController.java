package com.sunjianlin.ssm.controller;

import com.sunjianlin.ssm.service.IUserTestSerivce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by sunjianlin on 2017/11/23.
 */
@Controller
@RequestMapping("/test")
public class UserTestController {

    @Resource
    private IUserTestSerivce userTestSerivce;

    @RequestMapping("/hello")
//    @ResponseBody
    public String hello(){
        return "hello";
    }

}
