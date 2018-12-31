package com.ming.gateway.restful;

import com.ming.persistence.entity.MUserEntity;
import com.ming.persistence.entity.UserEntity;
import com.ming.persistence.read.MUserrMapper;
import com.ming.persistence.write.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

	@Autowired
	private MUserrMapper mUserrMapper;
	
	@RequestMapping("/getUsers")
	public List<UserEntity> getUsers() {
		List<UserEntity> users=userMapper.getAll();
		return users;
	}
	
    @RequestMapping("/getMUser")
    public List<MUserEntity> getUser() {
        return mUserrMapper.getAll();
    }

    
}