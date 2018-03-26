package com.wujing.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.wujing.web.config.BaseConfig;


@Controller
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET,value="/login")
	public String login(Model model) { 
		return "/login";
	} 
	
	@RequestMapping(value="/login",method ={RequestMethod.POST})
	public String loginAction(HttpSession session,String username,String password){
		
		JSONObject jsonObject = new JSONObject();
		
		if (username.equals(BaseConfig.USERNAME)&&password.equals(BaseConfig.PASSWORD)) {
			session.setAttribute("username", username);  
			jsonObject.put("result", "success");
			jsonObject.put("resultDesc", "成功");
			return "redirect:/branch";
		}else  {
			jsonObject.put("result", "failed");
			jsonObject.put("resultDesc", "登陆名或密码错误");
			return "/login";
		}
		
	}
	

}
