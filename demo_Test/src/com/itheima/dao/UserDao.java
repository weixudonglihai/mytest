package com.itheima.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.itheima.domain.User;
import com.itheima.utils.DataSourceUtils;import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;

public class UserDao {

	/**
	 * 登录
	 * @param username
	 * @param password
	 * @return
	 * @throws SQLException 
	 */
	public User getUserByUsernameAndPwd(String username, String password) throws SQLException {
		return null;
	}

	public User login(User user) throws SQLException {
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from user where username=? and password=?";
		Object[] params = {user.getUsername(),user.getPassword()};
		return qr.query(sql,new BeanHandler<>(User.class),params);
	}

}
