package com.youny.user.service;

import java.util.List;

import javax.annotation.Resource;


import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youny.user.bo.DemoUser;
import com.youny.user.dao.DemoDao;
import com.youny.user.mapper.DemoMapper;

@Service("demoService")
public class DemoServiceImpl implements DemoService {
	 
	@Resource(name="demoDao")
	private DemoDao demoDao;
    
	@Resource(name="demoMapper")
    private DemoMapper demoMapper;
    
	@Override
	public String getUserList() {
		List<DemoUser> userList = demoDao.getUserList();
		JSONArray json = JSONArray.fromObject(userList);
		return json.toString();
	}
	
	@Override
	public String getMybatisUserList() {
		List<DemoUser> userList = demoMapper.getUserList();
		JSONArray json = JSONArray.fromObject(userList);
		return json.toString();
	}
	
    
	
}
