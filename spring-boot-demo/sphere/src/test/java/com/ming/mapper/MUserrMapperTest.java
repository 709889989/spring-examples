package com.ming.mapper;

import com.ming.persistence.entity.UserEntity;
import com.ming.domain.enums.UserSexEnum;
import com.ming.persistence.read.MUserrMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MUserrMapperTest {

	@Autowired
	private MUserrMapper userMapper;

//	@Test
//	public void testInsert() throws Exception {
//		userMapper.insert(new UserEntity("aa", "a123456", UserSexEnum.MAN));
//		userMapper.insert(new UserEntity("bb", "b123456", UserSexEnum.WOMAN));
//		userMapper.insert(new UserEntity("cc", "b123456", UserSexEnum.WOMAN));
//
//		Assert.assertEquals(3, userMapper.getAll().size());
//	}
//
//	@Test
//	public void testQuery() throws Exception {
//		List<UserEntity> users = userMapper.getAll();
//		if(users==null || users.size()==0){
//			System.out.println("is null");
//		}else{
//			System.out.println(users.toString());
//		}
//	}
//
//
//	@Test
//	public void testUpdate() throws Exception {
//		UserEntity user = userMapper.getOne(6l);
//		System.out.println(user.toString());
//		user.setNickName("ming");
//		userMapper.update(user);
//		Assert.assertTrue(("ming".equals(userMapper.getOne(6l).getNickName())));
//	}

}