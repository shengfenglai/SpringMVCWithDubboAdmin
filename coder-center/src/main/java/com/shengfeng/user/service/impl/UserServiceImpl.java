
package com.shengfeng.user.service.impl;

import com.shengfeng.user.bean.UserBean;
import com.shengfeng.user.service.UserService;

/**
 *  UserService impl 
 *
 */
public class UserServiceImpl implements UserService {

	public long addUser() {
		
		return 0;
	}

	public UserBean getUserByUserId() {
		UserBean userBean = new UserBean();
		userBean.setUsername("shengfeng");
		return userBean;
	}
    
}
