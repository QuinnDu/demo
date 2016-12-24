package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.domain.UserDTO;
import com.demo.service.UserService;

@Controller
public class UserController {

	public static Logger LOG = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	/**
	 * 查询所有用户
	 * @param userDTO
	 * @author 杜保坤
	 */
	@RequestMapping("/showUsers")
	public String selectAllUser(HttpServletRequest request,UserDTO userDTO,ModelMap model){
		LOG.info("================This is selectAllUser！===============");
		List<UserDTO> userDTOs = userService.selectAllUser(userDTO);
		model.put("users", userDTOs);
		return "user/showUsers";
	}
	
	/**
	 * 更新用户版本号
	 * @author 杜保坤
	 */
	@RequestMapping("/updateUserVersion")
	public String updateUserVersion(){
		LOG.info("----------------This is updateUserVersion-----------------");
		int count = userService.updateUserVersion();
		return "success";
	}
}
