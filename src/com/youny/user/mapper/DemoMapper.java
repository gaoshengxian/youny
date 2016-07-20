package com.youny.user.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.youny.user.bo.DemoUser;

@Repository("demoMapper")
public interface DemoMapper {
	
	public List<DemoUser> getUserList();
}
