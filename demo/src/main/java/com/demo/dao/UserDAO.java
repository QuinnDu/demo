package com.demo.dao;

import java.util.List;

import com.demo.domain.UserDTO;

public interface UserDAO {
	
    int deleteByPrimaryKey(String userName);

    int insert(UserDTO record);

    int insertSelective(UserDTO record);

    UserDTO selectByPrimaryKey(String userName);

    int updateByPrimaryKeySelective(UserDTO record);

    int updateByPrimaryKey(UserDTO record);
    
    /**
     * 查询所有用户
     * @author
     * @param userDTO
     */
    List<UserDTO> selectAllUser(UserDTO userDTO);
    
    /**
     * 更新用户版本号
     * @author 杜保坤
     */
    public int updateUserVersion();
}