package com.ming.persistence.read;

import java.util.List;

import com.ming.persistence.entity.MUserEntity;
import com.ming.persistence.entity.UserEntity;
import com.ming.domain.enums.UserSexEnum;
import org.apache.ibatis.annotations.*;

public interface MUserrMapper {


	@Select("SELECT * FROM user")
	List<MUserEntity> getAll();

//	@Select("SELECT * FROM users WHERE id = #{id}")
//	@Results({
//			@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
//			@Result(property = "nickName", column = "nick_name")
//	})
//	UserEntity getOne(Long id);
//
//	@Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
//	void insert(UserEntity user);
//
//	@Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
//	void update(UserEntity user);
//
//	@Delete("DELETE FROM users WHERE id =#{id}")
//	void delete(Long id);

}