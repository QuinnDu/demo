package com.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.UserDAO;
import com.demo.domain.UserDTO;
import com.demo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserDAO userDAO;

	@Override
	public List<UserDTO> selectAllUser(UserDTO userDTO) {
		return userDAO.selectAllUser(userDTO);
	}

	@Override
	public int updateUserVersion() {
		userDAO.updateUserVersion();
		throw new RuntimeException();
//		return userDAO.updateUserVersion();
	}
}
