package com.ming.mybatis.database.mapper;

import com.ming.mybatis.database.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

//@Mapper   启动类添加@MapperScan，此处不需要
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("select * from user")
    User select();

//    @Insert(value = "insert into roncoo_user (name, create_time) values (#{name,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})")
//    int insert(User record);
//
//    @Select(value = "select id, name, create_time from roncoo_user where id = #{id,jdbcType=INTEGER}")
//    @Results(value = { @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP) })
//    User selectByPrimaryKey(Integer id);
}