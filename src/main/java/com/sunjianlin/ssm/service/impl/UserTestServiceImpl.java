package com.sunjianlin.ssm.service.impl;

import com.sunjianlin.ssm.dao.UserTestMapper;
import com.sunjianlin.ssm.model.UserTest;
import com.sunjianlin.ssm.service.IUserTestSerivce;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by sunjianlin on 2017/11/24.
 */
//@Service
//@Transactional
@Service
@Path("user/test")
@Produces("application/json;charset=UTF-8")
@Consumes("application/json;charset=UTF-8")
public class UserTestServiceImpl implements IUserTestSerivce {

    @Resource
    private UserTestMapper userTestMapper;

    @Path("searchGoodsBrowse")
    @POST
    public int add(UserTest userTest) {
        return userTestMapper.insert(userTest);
    }

    @Path("searchGoodsBrowse")
    @POST
    public UserTest findById(int id) {
        return userTestMapper.selectByPrimaryKey(id);
    }
}
