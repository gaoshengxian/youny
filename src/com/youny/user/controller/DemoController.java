package com.youny.user.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.youny.user.service.DemoService;

@Controller
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
    private DemoService demoService;
    
	@RequestMapping(value="getUserInfo",method = RequestMethod.GET)
	public void getUserInfo(HttpServletRequest request,HttpServletResponse response) throws IOException{
		    String json = demoService.getUserList();
			response.getWriter().write(json);
	} 
	
	@RequestMapping(value="getMybatisUserInfo",method = RequestMethod.GET)
	public void getMybatisUserInfo(HttpServletRequest request,HttpServletResponse response) throws IOException{
		response.getWriter().write(demoService.getMybatisUserList());
	}
}
