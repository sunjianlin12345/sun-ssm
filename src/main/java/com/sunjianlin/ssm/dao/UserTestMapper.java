package com.sunjianlin.ssm.dao;

import com.sunjianlin.ssm.model.UserTest;
import org.springframework.stereotype.Repository;

public interface UserTestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserTest record);

    int insertSelective(UserTest record);

    UserTest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserTest record);

    int updateByPrimaryKey(UserTest record);
}