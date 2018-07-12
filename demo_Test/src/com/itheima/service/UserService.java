package com.itheima.service;

import java.sql.SQLException;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

public class UserService {

	/**
	 * 登录
	 * @param username
	 * @param password
	 * @return
	 * @throws SQLException 
	 */
	public User login(String username, String password) throws SQLException {
		return null;
	}

	public User login(User user) throws SQLException {
		UserDao dao = new UserDao();
		return dao.login(user);
	}
	
}
