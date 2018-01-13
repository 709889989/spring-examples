package com.ming.mybatis.repository;

import com.ming.mybatis.database.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Repository
public class UserRepository {
    @Autowired
    private UserMapper userMapper;

    public void select(){
        System.out.println(userMapper.selectByPrimaryKey(1));
    }
    public void select2(){
        System.out.println(userMapper.select());
    }
}
