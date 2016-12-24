package com.demo.service;

import java.util.List;

import com.demo.domain.UserDTO;

public interface UserService {
	
	/**
	 * 查询所有用户
	 * @author du
	 * @param userDTO
	 * @return List<UserDTO> 返回用户结果集
	 */
	public List<UserDTO> selectAllUser(UserDTO userDTO);
	
	/**
	 * 用户用户版本号
	 * @author 杜保坤
	 */
	public int updateUserVersion();
}
