package com.sunjianlin.ssm.service;

import com.sunjianlin.ssm.model.UserTest;

/**
 * Created by sunjianlin on 2017/11/24.
 */
public interface IUserTestSerivce {

    public int add(UserTest userTest);

    public UserTest findById(int id);

}
